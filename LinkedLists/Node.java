/**
 * List Node that contains an integer value and a reference to the next Node.
 */
public class Node {
    int val;
    Node next;

    public Node(){
        val = 0;
        next = null;
    }

    public Node(int x){
        val = x;
        next = null;
    }

    public int getVal(){
        return val;
    }

    public Node next(){
        return next;
    }

    public void setNext(){
        next = null;
    }

    public void setNext(Node x){
        next = x;
    }
}
