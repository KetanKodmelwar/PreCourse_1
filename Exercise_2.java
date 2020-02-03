public class StackAsLinkedList {

    StackNode root;
    StackNode backhead;

    StackNode head;

    static class StackNode {
        int value;
        StackNode next;

        StackNode(int data) {
            value = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        if (root == null) {
            return true;
        }
        return false;
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode temp = new StackNode(data);
        if (root == null) {
            head = temp;
        } else {
            root.next = temp;
        }

        root = temp;

    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int poppedData = root.value;
        backhead = head;
        if (backhead == root) {
            root = null;
            return poppedData;
        }
        while (backhead.next != root) {
            backhead = backhead.next;
        }
        root = backhead;
        backhead.next = null;
        root.next = null;
        backhead = head;
        return poppedData;

    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (root == null) {
            System.out.println("Stack empty");
            return -1;
        }
        return root.value;
    }

    // Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
