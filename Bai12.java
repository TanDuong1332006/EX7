package ex7;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chuoi van ban: ");
        String mang=sc.nextLine();
        mang=mang.toLowerCase();
        int[] dem=new int[26];
        for(int i=0;i<mang.length();i++)
        {
            char c=mang.charAt(i);
            if(c>='a'&&c<='z')
            {
                dem[c-'a']++;
            }
        }
        System.out.println("Ket Qua: ");
        for(int i=0;i<26;i++)
        {
            if(dem[i]>0)
            {
                System.out.println((char)(i+'a')+" : "+dem[i]);
            }
        }
    }
}
