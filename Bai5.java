package ex7;

import java.util.*;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so luong mang: ");
        int m=sc.nextInt();
        int[] so=new int[m];
        for(int i=0;i<m;i++)
        {
            System.out.print("Nhap So: ");
            so[i]=sc.nextInt();
        }
        ArrayList<Integer> chan=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            if(so[i]%2==0)
            {
                chan.add(so[i]);
            }
        }
        System.out.println("Cac so chan trong chuoi la: "+chan);
    }
}
