package ex7;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap So Luong So Nguyen Muon Nhap: ");
        int n=sc.nextInt();
        int[] gan=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("So Nguyen Thu "+(i+1)+" : ");
            gan[i]=sc.nextInt();
        }
        for(int i=0;i<gan.length/2;i++)
        {
            int tam=gan[i];
            gan[i]=gan[gan.length-1-i];
            gan[gan.length-1-i]=tam;
        }
        System.out.print("Bien sau khi doi gia tri: ");
        for(int i=0;i<gan.length;i++)
        {
            System.out.print(gan[i]+" ");
        }
    }
}