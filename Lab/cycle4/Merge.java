import java.io.*;

class Merge
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader f1 = new BufferedReader(new FileReader("file1.txt"));
		BufferedReader f2 = new BufferedReader(new FileReader("file2.txt"));
		PrintWriter f3 = new PrintWriter("file3.txt");
		String line;
		line = f1.readLine();
		while(line != null)
		{
			f3.println(line);
			line = f1.readLine();
		}

		line = f2.readLine();
		while(line != null)
		{
			f3.println(line);
			line = f2.readLine();
		}
		f1.close();
		f2.close();
		f3.close();
	}
}
