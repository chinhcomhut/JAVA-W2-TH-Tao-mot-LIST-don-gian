public class MyListTest {
    public static void main(String[] args) {
        Mylist<Integer> integerMylist = new Mylist<>();
        integerMylist.add(1);
        integerMylist.add(2);
        integerMylist.add(3);
        integerMylist.add(3);
        integerMylist.add(4);
        System.out.println("element 4: "+integerMylist.get(4));
        System.out.println("element 1: "+integerMylist.get(1));
        System.out.println("element 2: "+integerMylist.get(2));
        integerMylist.get(6);
        System.out.println("element 6:"+integerMylist.get(6));
        integerMylist.get(-1);
        System.out.println("element -1"+integerMylist.get(-1));
    }
}
