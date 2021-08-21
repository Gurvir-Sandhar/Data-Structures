/**
 * Contains main method to run tests for the LinkedList class.
 */
class Main {
    public static void main(String[] args){

        LinkedList myList = new LinkedList();

        myList.add(5);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(5);
        myList.add(8);
        myList.add(5);
        myList.print();
        myList.removeAll(5);
        myList.print();
    }
}