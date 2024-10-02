import java.io.*;
import java.util.*;		

class PoemNumber
{
	public static void main(String [] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file to be number:");
		String inp = sc.nextLine();
		System.out.println("Enter the file to be created:");
		String out = sc.nextLine();
		BufferedReader f1 = new BufferedReader(new FileReader(inp));
		PrintWriter f2 = new PrintWriter(out);
		String line = f1.readLine();
		int i = 1;
		while(line != null)
		{
			f2.println(i + ": " +line);
			line = f1.readLine();
			i++;
		}
		f1.close();
		f2.close();
	}
}
