package ex7;

import java.util.*;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong so nguyen muon nhap: ");
        int n=sc.nextInt();
        int[] nguyen=new int[n];
        ArrayList moi=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            System.out.print("Nhap so thu "+(i+1)+" : ");
            nguyen[i]=sc.nextInt();
            if(!moi.contains(nguyen[i]))
            {
                moi.add(nguyen[i]);
            }
        }
        System.out.print("Chuoi sau khi thay doi la: ");
        for(int i=0;i<moi.size();i++)
        {
            System.out.print(moi.get(i)+" ");
        }
    }
}
