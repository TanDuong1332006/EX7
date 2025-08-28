package ex7;

import java.util.*;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so luong phan tu muon nhap: ");
        int pt=sc.nextInt();
        ArrayList<Integer> ds=new ArrayList<>();
        for(int i=0;i<pt;i++)
        {
            System.out.println("Nhap phan tu thu "+(i+1)+" : ");
            ds.add(sc.nextInt());
        }
        for(int i=ds.size()-1;i>=0;i--)
        {
            if(ds.get(i)>50)
            {
                ds.remove(i);
            }
        }
        System.out.println("Phan tu sau khi xu li: "+ds);
    }
}
