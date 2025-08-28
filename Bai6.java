package ex7;

import java.util.*;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int tong=0;
        ArrayList<Integer> gan=new ArrayList<>();
        do
        {
            
            System.out.println("Nhap so: ");
            n=sc.nextInt();
            if(n!=-1)
            {
            gan.add(n);
            tong+=n;
            }
        }while(n!=(-1));
        System.out.println("Cac so da nhap la: ");
        for(int i=0;i<gan.size();i++)
        {
            System.out.println(gan.get(i));
        }
        System.out.println("Tong la: "+tong);
    }
}
