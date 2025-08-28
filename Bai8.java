package ex7;

import java.util.*;

public class Bai8 {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Nhap vao 5 so nguyen: ");
        int n;
        int[] temps=new int[5];
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            System.out.print("So nguyen thu "+(i+1)+" : ");
            n=sc.nextInt();
            temps[i]=n;
        }
        Arrays.sort(temps);
            System.out.println("Mang sau khi sap xep: "+Arrays.toString(temps));
       }
}
