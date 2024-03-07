import java.util.Scanner;

public class Bai1
{
    public static void main(String[] args)
    {

        //Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
        //Bước 2: Nhập X là phần tử cần xoá
        //Bước 3: Tìm X xem có xuất hiện trong mảng không. Nếu xuất hiện chỉ ra vị trí của X.
        //Giả sử vị trí này là: index_del
        //Bước 4: Thực hiện xoá phần tử X khỏi mảng
        //Duyệt mảng từ vị trí cần xoá (index_del) đến cuối mảng (array.length-1)
        //- Gán phần tử ở vị trí index cho phần tử ở vị trí index + 1
        //Bước 5: Kết thúc duyệt mảng. In ra mảng.


        int [] arayy = {1,3,4,5,7,9,19};
        System.out.println("Nhap phan tu muon xoa");
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int indexDel = -1;
        for (int i = 0; i < arayy.length; i++)
        {
            if (x == arayy[i])
            {
                for ( indexDel= i;indexDel < arayy.length-1 ; indexDel++)
                {
                    arayy[indexDel] = arayy[indexDel+1];
                }
                arayy[arayy.length-1] =0;
                break;
            }
        }
        for (int i = 0; i < arayy.length; i++)
        {
            System.out.println(arayy[i]);
        };

    }
}
