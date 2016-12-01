/**
 * This class contains practice problem methods that use 2D arrays
 * @author Ethan Chung
 * @version 7.0
 */
public class exercises
{
	/**
	 * Main method calls upon methods that use 2D arrays
	 * @param args  String array
	 */
	public static void main(String[] args)
	{
		int[][] grid1 = buildSquare();
		
		//this method allows the user to choose the side length
		int[][] grid2 = buildSquare(8);
		
		printArray(grid1);
		printArray(grid2);
	}
	
	/**
	 * This method builds a 4 x 4 2d int array by calling upon the other buildSquare method
	 * that takes in a param for side length
	 * @return grid  the 4 x 4 2D int array
	 */
	public static int[][] buildSquare()
	{
		int[][] grid = buildSquare(4);
		return grid;
	}
	
	/** 
	 * This method has the same name as the previous method in order to intentionally overload.
	 * This method but will be used if a parameter is passed in during the main method, since
	 * this method takes in the sidelength, whereas the above method does not take in any params.
	 * This method creates a 2D array that is made according to the inputted side length
	 * @param side  the number of rows and columns in the 2D array
	 * @return grid  the 2D int array now containing the necessary int values
	 */
	public static int[][] buildSquare(int side)
	{
		int[][] grid = new int[side][side];
		int counter = 1; 
		for (int row = 0; row < grid.length; row++)
		{
			for (int column = 0; column < grid[row].length; column++)
			{
				grid[row][column] = counter; 
				counter++;
			}
		}
		return grid; 
	}
	
	/**
	 * This method takes in a 2D int array and prints it out cleanly
	 * @param arr  the 2D int array to be printed
	 */
	public static void printArray(int[][] arr)
	{ 
		int lengthArr = arr.length;
		System.out.println(); 
		for (int row = 0; row < lengthArr; row++)
		{
			System.out.print("|"); 
			for (int column = 0; column < arr[row].length; column++)
			{
				if (arr[row][column] < 10)
					System.out.print(arr[row][column] + " |"); 
				else
					System.out.print(arr[row][column] + "|"); 
			}
			System.out.println(); 	
		}	
	}
}