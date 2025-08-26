package ex7;
import java.util.*;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> congViec=new ArrayList<>();
        int chon;
        do
        {
            System.out.println("===Quan Ly Cong Viec===");
            System.out.println("1.Them Cong Viec");
            System.out.println("2.Xem Danh Sach Cong Viec");
            System.out.println("3.Xoa Cong Viec");
            System.out.println("0.Thoat");
            chon=sc.nextInt();
            sc.nextLine();
            switch (chon)
                    {
                case 1:
                    System.out.println("Them Cong Viec");
                    String cv=sc.nextLine();
                    congViec.add(cv);
                    System.out.println("Da Them Cong Viec");
                    break;
                case 2:
                    if(congViec.isEmpty()){
                        System.out.println("Cong Viec Trong");
                    }else
                    {
                        System.out.println("Danh Sach Cong Viec");
                        for(int i=0;i<congViec.size();i++)
                        {
                            System.out.println(i+". "+congViec.get(i));
                        }
                    }
                    break;
                case 3:
                    if(congViec.isEmpty())
                    {
                        System.out.println("Cong Viec Trong Khong The Xoa");
                    }
                    else
                    {
                        System.out.println("Nhap vi tri cong viec muon xoa: ");
                        int viTri=sc.nextInt();
                        if(viTri>=0&&viTri<congViec.size())
                        {
                            String xoa=congViec.remove(viTri);
                            System.out.println("Da Xoa: "+xoa);
                        }else
                        {
                            System.out.println("Vi tri khong hop le");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Moi thu lai");
                    }
        }while (chon!=0);
    }
}
