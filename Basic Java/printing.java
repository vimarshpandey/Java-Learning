import java.util.Scanner;

public class printing
{

	public static void main(String[] args)
	{
		int age = 21;
		System.out.println("Hii there");
		System.out.println();
		System.out.println("How are you");
		System.out.println();
		System.out.println("I am vimarsh");
		System.out.println();
		System.out.println("And I am " + age + " years old.");
		System.out.println();
		
		// code for table printing
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		for(int i = 0; i < 11; i++)
		{
			System.out.println(num +" X "+ i +" = "+ num*i);
		}
		
		scan.close();
	}

}