import java.util.Scanner;

public class Transpose
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter number of rows and columns:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] a = new int[m][n];
		System.out.println("Enter elements:");
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		int[][] b = new int[n][m];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				b[i][j] = a[j][i];
			}
		}
		System.out.println("Transpose is:");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
