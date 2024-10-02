import java.io.*;
import java.util.*;		

class Real
{
	public static void main(String [] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the real number file:");
		String file = sc.nextLine();
		BufferedReader reader =  new BufferedReader(new FileReader(file));
		int i = 0, j= 0;
		double s = 0;
		int A[] = new int[50];
		String x;
		while((x = reader.readLine()) != null)
		{
			A[i] = Integer.parseInt(x);
			s = s+A[i];
			j = i;
			i++;
		}
		int min =  A[0], max = A[0];
		for(i = 0; i<=j; i++)
		{
			if(A[i] < min)
			{
			min = A[i];
			}
			if(A[i] > max)
			{
			max =  A[i];
			}
		}
		System.out.println("Sum: "+s+"\nMax: "+max+"\nMin: "+min+"\nAverage: "+(s/j)+"\nRange: "+min+ " to "+max);
	}
}
