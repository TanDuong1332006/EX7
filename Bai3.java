package ex7;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] csn=new int[]{1,2,3,4,5,5,4,3,2,1};
        System.out.print("Nhap so can tim: ");
        int sct=sc.nextInt();
        int dem=0;
        for(int i=0;i<csn.length;i++)
        {
            if(sct==csn[i])
            {
                dem++;
            }
        }
        System.out.println("So lan xuat hien cua "+sct+" la "+dem);
    }
}
