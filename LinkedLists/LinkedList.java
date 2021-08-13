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
        } else {
            Node current = head;
            while(current.next() != null){
                current = current.next();
            }
            current.addNext(x);
        }
    }

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
