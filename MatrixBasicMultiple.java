public class MatrixBasicMultiple {

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
		multiple[row][column] = firstMatrix[row][column] * secondMatrix[row][column];
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
1	4	9	
16	25	36	
49	64	81	
