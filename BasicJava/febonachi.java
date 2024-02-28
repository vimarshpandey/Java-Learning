public class febonachi
{
    public static void main(String[] args)
    {
        // 1, 1, 2, 3, 5, 8, 13
        int first = 1;
        int second = 1;
        for(int i = 0; i < 15; i++)
        {
            int a = first+second;
            first = second;
            second = a;
            System.out.println(a+" ");
        }
    }    
}
