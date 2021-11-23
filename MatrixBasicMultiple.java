public class TwodArray {

public static void main(String[] args) {
	int firstMatrix[][] = { {1,2,3},{4,5,6},{7,8,9} };
	int secondMatrix[][]= { {1,2,3},{4,5,6},{7,8,9} };
	int multiple[][] = new int[3][3];
	int row;
	int column;

//Multiplication
	for(row=0;row<multiple.length;row++)
	{
	for(column=0;column<multiple.length;column++)
	{	 
		multiple[row][column]=0;

		for(int i=0;i<multiple.length;i++)
		{
		multiple[row][column] += firstMatrix[row][i] * secondMatrix[i][column];
		}
	}
	}

//Display
	for(row=0;row<multiple.length;row++)
	{
	for(column=0;column<multiple.length;column++)
	{
	System.out.print(multiple[row][column] + "\t" );
	}
	System.out.println();
	}
}
}

//OUTPUT
30	36	42	
66	81	96	
102	126	150	
