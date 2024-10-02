import java.util.Scanner;

public class MatrixMul
{
	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter order of 1st matrix:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] a = new int[m][n];
		System.out.println("Enter order of 2nd matrix:");
		int p = sc.nextInt();
		int q = sc.nextInt();
		int[][] b = new int[p][q];
		System.out.println("Enter elements of 1st matrix:");
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter elements of 2nd matrix:");
		for(int i = 0; i < p; i++)
		{
			for(int j = 0; j < q; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		if(n == p)
		{
			int[][] c = new int[m][q];
			for(int i = 0; i < m; i++)
			{
				for(int j = 0; j < q; j++)
				{
					c[i][j] = 0;
					for(int k = 0; k < n; k++)
					{
						c[i][j] += a[i][k] * b[k][j];
					}
				}
			}
	  		System.out.println("Multiplied matrix is:");
			for(int i = 0; i < m; i++)
			{
				for(int j = 0; j < q; j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Multiplication not possible");
		}

	}
}
