
package ex7;
import java.util.*;
public class Bai1 {
        public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
            System.out.print("Nhap vao so danh sach so nguyen: ");
            int ngay=sc.nextInt();
            int[] ng=new int[ngay];
            for(int i=0;i<ngay;i++)
            {
                System.out.println("So thu "+(i+1)+": ");
                ng[i]=sc.nextInt();
            }
            Arrays.sort(ng);
            System.out.println("So nguyen lon nhat la: "+ng[0]);
            System.out.println("SO nguyen nho nhat la: "+ng[ng.length-1]);
        }
}

