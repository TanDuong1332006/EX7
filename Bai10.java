package ex7;

import java.util.*;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so luong phan tu mang 1: ");
        int a1=sc.nextInt();
        int[] a=new int[a1];
        for(int i=0;i<a1;i++)
        {
            System.out.print("Nhap so thu "+(i+1)+" cua mang 1: ");
            a[i]=sc.nextInt();
        }
        System.out.println("Nhap so luong phan tu mang 2: ");
        int b1=sc.nextInt();
        int[] b=new int[b1];
        for(int i=0;i<b1;i++)
        {
            System.out.println("Nhap so thu "+(i+1)+" cua mang 2: ");
            b[i]=sc.nextInt();
        }
        int n1=a.length;
        int n2=b.length;
        int[] gan=new int[n1+n2];
        for(int i=0;i<n1;i++)
        {
            gan[i]=a[i];
        }
        for(int i=0;i<n2;i++)
        {
            gan[n1+i]=b[i];
        }
        System.out.println("Mang sau khi noi: "+Arrays.toString(gan));

    }
}
