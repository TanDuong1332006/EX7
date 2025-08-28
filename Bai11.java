package ex7;

import java.util.*;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so luong so nguyen muon nhap: ");
        int n=sc.nextInt();
        int[] duyet=new int[n];
        int max1=duyet[0];
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            System.out.print("Nhap so thu "+(i+1)+" : ");
            duyet[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(max1<duyet[i])
            {
                max1=duyet[i];
            }
        }
        System.out.print("So lon nhi la: ");
        for(int i=0;i<n;i++)
        {   
            if(max2<duyet[i]&&duyet[i]<max1)
            {
                max2=duyet[i];
            }
        }
                    System.out.println(max2);
    }
}
