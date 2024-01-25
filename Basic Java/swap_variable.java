public class swap_variable
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 10;
        int temp;
        System.out.println("Before Swapping: \na: "+a+"\nb: "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping: \na: "+a+"\nb: "+b);
    }    
}