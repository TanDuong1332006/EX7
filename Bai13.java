package ex7;

import java.util.*;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("So luong muon nhap vao mang 1: ");
        int a=sc.nextInt();
        int[] a1=new int[a];
        for(int i=0;i<a;i++)
        {
            System.out.println("Nhap so thu "+(i+1)+" : ");
                    a1[i]=sc.nextInt();
        }
        System.out.println("So luong muon nhap vao mang 2: ");
        int b=sc.nextInt();
        int[] b1=new int[b];
        for(int i=0;i<b;i++)
        {
            System.out.println("Nhap so thu "+(i+1)+" : ");
            b1[i]=sc.nextInt();
        }
        Arrays.sort(a1);
        Arrays.sort(b1);
        int[] gop=new int[a+b];
        int i=0,j=0,k=0;
        while(i<a&&j<b)
        {
            if(a1[i]<=b1[j])
            {
                gop[k++]=a1[i++];
            }
            else
            {
                gop[k++]=b1[j++];
            }
        }
        while(i<a)
        {
            gop[k++]=a1[i++];
        }
        while(j<b)
        {
            gop[k++]=b1[j++];
        }
        System.out.println("Mang sau khi gop va sap xep la: "+Arrays.toString(gop));
    }
}
