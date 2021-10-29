public class Main {
    public static void main(String[] args) {
        int[] list = {-39,-12,-7,-1,0,4,5,8,10,17,18,21,30,33,41,56,77}; //sorted data
        BinarySearch obj = new BinarySearch();
        System.out.println(obj.search(list, -1)); //expect 3
        System.out.println(obj.search(list, 18)); //expect 10
    }

}
