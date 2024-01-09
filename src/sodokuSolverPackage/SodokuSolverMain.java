package sodokuSolverPackage;

public class SodokuSolverMain 
{
	
	private static final int GRID_SIZE = 9;
	
	
	
	public static void main(String[] args) 
	{
		int[][] board = {
		        {7, 0, 2, 0, 5, 0, 6, 0, 0},
		        {0, 0, 0, 0, 0, 3, 0, 0, 0},
		        {1, 0, 0, 0, 0, 9, 5, 0, 0},
		        {8, 0, 0, 0, 0, 0, 0, 9, 0},
		        {0, 4, 3, 0, 0, 0, 7, 5, 0},
		        {0, 9, 0, 0, 0, 0, 0, 0, 8},
		        {0, 0, 9, 7, 0, 0, 0, 0, 5},
		        {0, 0, 0, 2, 0, 0, 0, 0, 0},
		        {0, 0, 7, 0, 4, 0, 2, 0, 3} 
		      };
		
		
		printBoard(board);

		if(solveBoard(board))
		{
			System.out.println("Solved Successfully!!");
		}
		else
		{
			System.out.println("Unsolvable board");
		}
		
		printBoard(board);
		
	}

	private static void printBoard(int[][] board) 
	{
		for(int r = 0; r < 9; r++)
		{
			if(r % 3 == 0 && r != 0)
			{
				System.out.println("-----------");
			}
			for(int c = 0; c < 9; c++)
			{
				if(c % 3 == 0 && c != 0)
				{
					System.out.print("|");
				}
				System.out.print(board[r][c]);
			}
			System.out.println();
		}
		
	}

	private static boolean isNumberInRow(int[][] board, int num, int row)
	{
		for(int i = 0; i < GRID_SIZE; i++)
		{
			if(board[row][i] == num)
			{
				return true;
			}
		}
		return false;
	}
	
	private static boolean isNumberInColumn(int[][] board, int num, int column)
	{
		for(int i = 0; i < GRID_SIZE; i++)
		{
			if(board[i][column] == num)
			{
				return true;
			}
		}
		return false;
	}
	
	private static boolean isNumberInBox(int[][] board, int num, int row, int column)
	{
		int localBoxRow = row - row % 3;
		int localBoxColumn = column - column % 3;
		
		for(int i = localBoxRow; i < localBoxRow + 3; i++)
		{
			for(int j = localBoxColumn; j < localBoxColumn + 3; j++)
			{
				if(board[i][j] == num)
				{
					return true;
				}
			}
		}
		return false;
		
	}
	
	private static boolean isValidPlacement(int[][] board, int num, int row, int column)
	{
		return !(isNumberInRow(board, num, row)) && 
				!(isNumberInColumn(board, num, column)) && 
				!(isNumberInBox(board, num, row, column));
	}
	
	private static boolean solveBoard(int[][] board)
	{
		for(int row = 0; row < 9; row++)
		{
			for(int col = 0; col < 9; col++)
			{
				if(board[row][col] == 0)
				{
					for(int numToTry = 1; numToTry <= 9; numToTry++)
					{
						if(isValidPlacement(board, numToTry, row, col))
						{
							board[row][col] = numToTry;
							
							if(solveBoard(board))
							{
								return true;
							}
							else
							{
								board[row][col] = 0;
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}
	
	
	
	
}
