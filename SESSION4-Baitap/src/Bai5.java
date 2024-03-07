public class Bai5
{
    public static void main(String[] args)
    {
        // Tim phan tu nho nhat trong mang
         int [] array ={2,3,4,5,6,7,8,9,10};
         int min = array[0];
        for (int i = 1; i < array.length; i++)
        {
           if (array[i]<min)
           {
               min = array [i];
           }
        }
        System.out.println(min);
    }
}
