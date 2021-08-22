/**
 * Singly Linked List class contains a reference to the head of the list and the length.
 */
public class LinkedList {

    private Node head;
    private int length;

    /**
     * Default Constructor
     */
    public LinkedList(){
        head = null;
        length = 0;
    }

    /**
     * Parameterized Constructor
     * @param x Node that will be set as the head during creation of the List. 
     */
    public LinkedList(Node x){
        head = x;
        length += 1;
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
            current.setNext(x);
        }
        length += 1;
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
            current.setNext(newNode);
        }
        length += 1;
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

    /**
     * Removes Node at given index
     * @param x Index of Node to remove
     */
    public void remove(int x){
        if(x == 1){
            head = head.next();
        } else {
            Node current = head;
            for(int i = 2; i < x; i++){
                current = current.next();
            }
            if(x == length){
                current.setNext();
            } else {
                current.setNext(current.next().next());
            }
        }
        length--;
    }

    /**
     *  Remove all Nodes that have a value of x 
     * @param x value to remove from list
     */
    public void removeAll(int x){
        while(head.getVal() == x){
            head = head.next();
            length--;
        }
        Node current = head;
        for(int i = 2; i <= length; i++){
            if(current.next().getVal() == x){
                if(i == length){
                    current.setNext();
                    length--;
                }else{
                    Node temp = current.next().next();
                    current.setNext(temp);
                    length--;
                }
            }
            current = current.next();
        }
    }

    /**
     * Returns Head of List
     * @return  Head Node if it exists
     */
    public Node getHead(){
        if(head != null){
            return head;
        } else {
            return null;
        }
    }
}
