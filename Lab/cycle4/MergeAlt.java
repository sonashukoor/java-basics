
import java.io.*;

class MergeAlt
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader f1 = new BufferedReader(new FileReader("file1.txt"));
		BufferedReader f2 = new BufferedReader(new FileReader("file2.txt"));
		PrintWriter f3 = new PrintWriter("file3.txt");
		String line1 = f1.readLine();
		String line2 = f2.readLine();
		while(line1 != null && line2 != null)
		{
			f3.println(line1);	
			f3.println(line2);
			line1 = f1.readLine();
			line2 = f2.readLine();
		}	

		line1 = f1.readLine();
		while(line1 != null)
		{
			f3.println(line1);
			line1 = f1.readLine();
		}
		line2 = f2.readLine();
		while(line2 != null)
		{
			f3.println(line2);
			line2 = f2.readLine();
		}
		f1.close();
		f2.close();
		f3.close();
	}
}
