import java.util.Scanner;

public class MatrixMultiple {
	
	static Scanner sc = new Scanner(System.in);

	static 
	{
		System.out.println("Enter array size");
	}
	static int array_size = sc.nextInt();

	static int array1[][] = new int[array_size][array_size];
	static int array2[][] = new int[array_size][array_size];
	static int multiple[][] = new int[array_size][array_size];

	public static void main(String[] args) {

		System.out.println("Enter array1 value");

		for (int row = 0; row < array1.length; row++) 
		{
			for (int column = 0; column < array1.length; column++) 
			{
				array1[row][column] = sc.nextInt();
			}
		}

		System.out.println("Enter array2 value");

		for (int row = 0; row < array2.length; row++) 
		{
			for (int column = 0; column < array2.length; column++) 
			{
				array2[row][column] = sc.nextInt();
			}
		}

		for (int row = 0; row < multiple.length; row++) 
		{
			for (int column = 0; column < multiple.length; column++) 
			{
				multiple[row][column] = array1[row][column] * array2[row][column];
			}
		}

		System.out.println("Multiplication of array1 & array2");
		for (int row = 0; row < multiple.length; row++) 
		{
			for (int column = 0; column < multiple.length; column++) 
			{
				System.out.print(multiple[row][column] + "\t");
			}
			System.out.println();
		}
	}
}

//OUTPUT
Enter array size
2
Enter array1 value
2
3
4
5
Enter array2 value
2
3
4
5
Multiplication of array1 & array2
4   9
16 25