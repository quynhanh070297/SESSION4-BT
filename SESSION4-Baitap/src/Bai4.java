public class Bai4
{
    public static void main(String[] args)
    {
            // Tim phan tu lon nhat trong mang 2 chieu;
       int [][] array;
        array = new int[][]{
                {1,2,3,4},
                {5,7,3,4},
                {1,2,3,9},

};
        int max = array[0][0];
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if ( array[i][j]> max)
                {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
