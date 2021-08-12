public class LinkedList {
    Node head;
    
    public LinkedList(){
        head = null;
    }

    public LinkedList(Node x){
        head = x;
    }

    public void add(Node x){
        if(head == null){
            head = x;
        }
    }

    public void add(int x){
        if(head == null){
            head = new Node(x);
        }
    }

    public void print(){
        System.out.println(head.getVal());
    }
}
