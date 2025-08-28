package ex7;

import java.util.*;

public class Bai9 {
    public static void swap(int[] arr,int idx1,int idx2)
    {
        int tam=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=tam;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap phan tu thu "+(i+1)+" : ");
            arr[i]=sc.nextInt();
    }
        System.out.println("Nhap chi so 1: ");
        int idx1=sc.nextInt();
        System.out.println("Nhap chi so 2: ");
        int idx2=sc.nextInt();
        swap(arr,idx1,idx2);
        System.out.println("Mang sau khi hoan doi: "+Arrays.toString(arr));
    }
}
