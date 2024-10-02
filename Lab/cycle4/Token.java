import java.io.*;
import java.util.*;

class Token
{
	public static void main(String [] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line of number to be added:");
		String line = sc.nextLine();
		StringTokenizer token = new StringTokenizer(line, " ");
		int sum = 0;
		System.out.println("The numbers are:");
		while(token.hasMoreTokens())
		{
			String i = token.nextToken();
			int num = Integer.parseInt(i);
			System.out.println(num);
			sum =  sum + num;
		}
		System.out.println("Sum: "+sum);
	}
}

