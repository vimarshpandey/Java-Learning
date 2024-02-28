import java.util.Scanner;

public class array
{
	public static void main(String[] args)
	{
		int[] myarr = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Enter the element number "+(i+1)+": ");
			myarr[i] = scan.nextInt();
			scan.nextLine();
		}
		
		myarr[4] = 100;
		
		printArr(myarr);
		
		scan.close();
	}
	
	static void printArr(int[] arr)
	{
		int size = arr.length;
		
		for(int i = 0; i < size; i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
}