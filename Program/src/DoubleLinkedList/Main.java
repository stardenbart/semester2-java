package DoubleLinkedList;

public class Main {

    public static void main(String[] args){
        doubleLinkedList llist = new doubleLinkedList();
        //boolean asc = true;
       
        llist.addFirst(200);
        //llist.add(llist.head.next, 300);
        llist.addLast(400);

        llist.printlist(llist.head);
    }
    
}
