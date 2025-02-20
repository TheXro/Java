package LinkedList;

public class LL {
    private Node head;
    private Node tail;

    private int size;
    public LL() {
        this.size = 0;
    }

    public void InserFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void InsertLast(int value) {
        if (tail == null) {
            InserFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    
    public void InsertAtIndex(int value, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid Index");
            return;
        }
        if (index == 0) {
            InserFirst(value);
            return;
        }
        if (index == size) {
            InsertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        size++;
        return;
    }

    public int DeleteFirst() {
        int val = head.value;
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return -1;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public Node get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int DeleteLast() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return -1;
        }
        int val;
        Node secondLast = get(size - 2); //size - 2 because we need to get second last node 
        val = tail.value;
        secondLast.next = null;
        tail = secondLast;
        size--;
        return val;
    }

    public int DeleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return -1;
        }
        if (index == 0) {
            return DeleteFirst();
        }
        if (index == size - 1) {
            return DeleteLast();
        }
        Node temp = get(index - 1);
        int val = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public Node Find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void Size() {
        System.out.println("Size of LinkedList is: " + size);
    }

    private class Node {
        private int value;
        private Node next;
        
        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
