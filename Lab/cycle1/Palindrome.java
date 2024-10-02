import java.util.Scanner;

public class Palindrome
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter word:");
		String str = sc.nextLine();
		str = str.toLowerCase();
		int i = 0, n = str.length();
		int j = n-1;
		for(i = 0; i < n/2; i++)
		{
			if(str.charAt(i) != str.charAt(j))
			{
				System.out.println("Not a palindrome!");
				return;
			}
			j--;
		}
		System.out.println("It is a palindrome.");
	}
}
