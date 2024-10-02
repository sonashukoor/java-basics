import java.io.*;
import java.util.*;

class Number
{
	public static void main(String [] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file to be counted:");
		String file = sc.nextLine();
		BufferedReader f1 = new BufferedReader(new FileReader(file));
		String line;
		int lineCount = 0, wordCount = 0, charCount = 0;
		while((line = f1.readLine()) != null)
		{
			lineCount++;
			StringTokenizer token = new StringTokenizer(line, " ");
			while(token.hasMoreTokens())
			{
				String word = token.nextToken();
				wordCount++;
				charCount = charCount + word.length();
			}
		}
		
		f1.close();
		System.out.println("Line Count: "+lineCount+"\nWord Count: "+wordCount+"\nCharacter Count: "+charCount);
	}
}
