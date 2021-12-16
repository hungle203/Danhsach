package baitap;

import org.w3c.dom.Node;

public class MyLinkList {
    private Node head;
    private int numNode;
    private boolean flag;

    public static class Node {
        private Node next;
        private final Object data;

        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return this.data;
        }
    }
    public MyLinkList(Object data) {
        head = new Node(data);
    }
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index-1 && temp.next!=null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNode++;
    }
    public void addFist(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
       numNode++;
    }
    public void addLast(Object data) {
        if (head == null)
            addFist(data);
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = new Node(data);

        }
    }
    public void remote(int index) {
        Node temp = head;
        for (int i = 0; i < index-1 && temp!=null; i++) {
            temp.next = head;
        }
        numNode--;
    }
    public void get(int index) {
        Node temp = head;
        for (int i = 0; i < index-1; i++)
            System.out.println(temp.data);
    }
    public void size() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        System.out.println(i);
    }

    public boolean contains(Object data) {
        Node temp = head;
        int q = 0;
        for (int i = 0; i <= numNode; i++) {
            if ((temp.data).equals(data)) {
                flag = true;
                break;
            }
            else {
                flag = false;
                break;
            }
        }
        return false;
    }
    public int indexOf(Object data) {
        Node temp = head;
        int q =0;
        for (int i = 0; i < numNode; i++) {
            if ((temp.data).equals(data)) {
                q = i;
                break;
            }
            else {
                temp = temp.next;
            }
        }
        return q;
    }
    public void printList() {
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
