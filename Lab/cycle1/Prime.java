import java.util.Scanner;

public class Prime
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number:");
	int n = sc.nextInt();
	if(n == 1)
	{
		System.out.println("Neither prime nor composite");
	}
	else if(n == 2)
	{
		System.out.println("Prime");
	}
	else
	{
		int i = 2;
		int flag = 0;
		while(i <= n/2)
		{
			if(n % i == 0)
			{
				flag = 1;
				break;
			}
			i++;
		}
		if(flag == 1)
		{
			System.out.println("Not prime");
		}
		else
		{
			System.out.println("Prime");
		}
	}
	}
}
