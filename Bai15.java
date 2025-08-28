package ex7;
import java.util.*;
public class Bai15 {
    public static ArrayList<String> arrayToArrayList(String[] arr)
    {
        ArrayList<String> list=new ArrayList<>();
        for(String s:arr)
        {
            list.add(s);
        }
        return list;
    }
    public static String[] arrayListToArray(ArrayList<String> list)
    {
        return list.toArray(new String[list.size()]);
    }
    public static void main(String[] args) {
        String[] arr={"Ann","Bob"};
        ArrayList<String> list=arrayToArrayList(arr);
        System.out.println("Array->ArrayList: "+list);
        ArrayList<String> list2=new ArrayList<>();
        list2.add("Charle");
        list2.add("David");
        String[] arr2=arrayListToArray(list2);
        System.out.println("ArrayList->Array: "+Arrays.toString(arr2));
    }
}
