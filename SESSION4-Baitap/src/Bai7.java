public class Bai7
{
    public static void main(String[] args)
    {
        // Tinh tong duong cheo chinh trong mang hai chieu;
        int [][] arr = {
                {1,2,3},
                {1,2,3},
                {1,2,3},
        };

        int col = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col];
        }
        System.out.println("Tổng các số ở cột " + col + " là: " + sum);
    }

}


