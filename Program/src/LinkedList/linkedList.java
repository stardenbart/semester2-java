package LinkedList;

public class linkedList {
    Node first;

    public linkedList insertLast(linkedList list, int data){
        //membuat node baru
        Node new_node = new Node(data);
        new_node.next = null;

        //menjadikan node sebagai isi list pertama
        if(list.first == null){
            list.first = new_node;

        }else {
            Node last;
            //transverse sampai akhir node
            //tambahkan node baru di akhir list
            last = list.first;
            while(last.next != null){
                last = last.next;

            }
            last.next = new_node;
        }
        return list;
    }

    public linkedList insertFirst(linkedList list, int data){
        Node new_node = new Node(data);
        if(list.first == null){
            insertLast(list, data);

        }else {
            new_node.next = list.first;
            list.first = new_node;
        }
        return list;
    }

    public linkedList insertAfter(linkedList list, int data, int index){
        Node new_node = new Node(data);
        if(list.first == null){
            System.out.println("List Kosong.");

        }else {
            Node P;
            P = list.first;
            int i = 0;
            while(i < index - 1 && P != null){
                P = P.next;
                i++;
            }if(P != null){
                new_node.next = P.next;
                P.next = new_node;
            }else {
                System.out.println("Data Kurang.");
            }
        }
        return list;
    }

    public void printInfo(linkedList list){
        Node P;
        P = list.first;
        System.out.print("Linked List: ");

        while(P != null){
            System.out.println(P.info + " ");
            P = P.next;
        }
    }
}
