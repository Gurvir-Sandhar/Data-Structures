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

    public Node(int x, Node y){
        val = x;
        next = y;
    }

    public int getVal(){
        return val;
    }
}
