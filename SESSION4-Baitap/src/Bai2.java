import java.util.Scanner;

public class Bai2
{
    public static void main(String[] args)
    {
//        Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
//        Bước 2: Nhập X là số cần chèn
//        Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
//        Bước 4: Nếu index <= -1 và index >= array.length – 1 thì hiển thị không chèn được
//        phần tử vào mảng.
//        Bước 5: Thực hiện chèn phần tử X ở vị trí index vào mảng
//        Bước 6: In ra mảng

        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int[] newArr = new int[arr.length+1];
        System.out.println("Nhập số muốn chèn:");
        int numNew = sc.nextInt();
        System.out.println("Nhập index muốn chèn:");
        int index = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (index == i) {
                newArr[count] = numNew;
                count+=1;
            }
            newArr[count] = arr[i];
            count++;
        }
        for(int item : newArr){
            System.out.print(item+" ");
        }
    }
}
