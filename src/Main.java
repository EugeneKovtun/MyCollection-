import java.util.Arrays;

/**
 * Created by eugene on 08.08.17.
 */
public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(8);
        myArrayList.add(4);
        myArrayList.remove(8);
        System.out.println(Arrays.toString(myArrayList.toArray()));
        int[] ints = new int[0];
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("333");
        arrayList.add("444");
        System.out.println(Arrays.toString(arrayList.toArray()));
    }
}
