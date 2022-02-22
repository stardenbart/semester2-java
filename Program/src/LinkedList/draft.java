/* package LinkedList;

    public static linkedList deleteByKey(linkedList list, int key){
        // Store head node
        Node currNode = list.first, prev = null;
 
        //
        // CASE 1:
        // If head node itself holds the key to be deleted
 
        if (currNode != null && currNode.data == key) {
            list.first = currNode.next; // Changed head
 
            // Display the message
            System.out.println(key + " found and deleted");
 
            // Return the updated List
            return list;
        }
 
        //
        // CASE 2:
        // If the key is somewhere other than at head
        //
 
        // Search for the key to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currNode != null && currNode.data != key) {
            // If currNode does not hold key
            // continue to next node
            prev = currNode;
            currNode = currNode.next;
        }
 
        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (currNode != null) {
            // Since the key is at currNode
            // Unlink currNode from linked list
            prev.next = currNode.next;
 
            // Display the message
            System.out.println(key + " found and deleted");
        }
 
        //
        // CASE 3: The key is not present
        //
 
        // If key was not present in linked list
        // currNode should be null
        if (currNode == null) {
            // Display the message
            System.out.println(key + " not found");
        }
 
        // return the List
        return list;
    }

    public static linkedList deleteAtPosition(linkedList list, int index) {
        Node currNode = list.first, prev = null;
 
        if (index == 0 && currNode != null) {
            list.first = currNode.next;
 
            System.out.println(
                index + " position element deleted");
 
            return list;
        }
 
        int counter = 0;
 
        while (currNode != null) {
 
            if (counter == index) {
 
                prev.next = currNode.next;

                System.out.println(
                    index + " position element deleted");
                break;
            }
            else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
 
        
        if (currNode == null) {
            System.out.println(
                index + " position element not found");
        }
 
        return list;
    }
  } */