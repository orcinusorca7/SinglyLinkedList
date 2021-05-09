public class LinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void display() {
        Node temp = head;
        if(head == null) {
            System.out.println("Null Linked List");
            return;
        }
        System.out.println("Nodes of linked list:");
        while(temp != null) {
            //Prints each node by incrementing pointer
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
