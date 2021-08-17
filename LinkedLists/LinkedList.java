/**
 * Singly linked list class contains a reference to the head of the list.
 */
public class LinkedList {
    Node head;

    /**
     * Default Constructor
     */
    public LinkedList(){
        head = null;
    }

    /**
     * Parameterized Constructor
     * @param x Node that will be set as the head during creation of the List. 
     */
    public LinkedList(Node x){
        head = x;
    }

    /**
     *  Add Node to List
     * @param x Node that will be added to the List.
     */
    public void add(Node x){
        if(head == null){
            head = x;
        } else {
            Node current = head;
            while(current.next() != null){
                current = current.next();
            }
            current.addNext(x);
        }
    }

    /**
     *  Add Node to List by int 
     * @param x Int that will be stored in a Node and added to the List
     */
    public void add(int x){
        if(head == null){
            head = new Node(x);
        } else {
            Node current = head;
            while(current.next() != null){
                current = current.next();
            }
            Node newNode = new Node(x);
            current.addNext(newNode);
        }
    }

    /**
     * Print List
    */
    public void print(){
        Node current = head;
        while(current != null){
            if(current.next() == null){
                System.out.println(current.getVal());
            } else {
                System.out.print(current.getVal() + "->");
            }
            current = current.next();
        }
    }
}
