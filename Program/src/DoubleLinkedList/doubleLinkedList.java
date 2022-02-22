package DoubleLinkedList;

class doubleLinkedList {
    Node head;
    Node tail;

    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int d){
            data = d;
            prev = null;
            next = null;
        }
    }

    public void addFirst(int data){
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        head.prev = node;
        head = node;
    }

    public void add(Node node, int data){
        Node new_node = new Node(data);
        new_node.next = node.next;
        node.next = new_node;
        new_node.prev = node;
        if(new_node.next != null){
            new_node.next.prev = new_node;
        }
    }

    public void addLast(int data){
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        Node node = new Node(data);
        last.next = node;
        node.prev = last;
        last = node;
        tail = last;
    }

    public void printlist(Node node)
    {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    /* public void printList(boolean asc) {
        Node n = null;
        if(asc){
            n = head;
        }else {
            n = tail;
        }
        System.out.print("[ ");
       
        while (n != null){
            System.out.print(n.data + " ");
            if(asc){
            n = n.next;
            }else {
            n = n.prev;
            }
        }
        System.out.println("]");
    } */
}
