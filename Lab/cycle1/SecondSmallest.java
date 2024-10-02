import java.util.Scanner;

public class SecondSmallest
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of terms:");
	int n = sc.nextInt();
	int[] a = new int[n];
	if(n < 3)
	{
		System.out.println("Not possible.");
		return;
	}
	System.out.println("Enter terms:");
	for(int i = 0; i < n; i++)
	{
		a[i] = sc.nextInt();
	}
	int smallest, secondSmall;
	if(a[0] < a[1])
	{
		smallest = a[0];
		secondSmall = a[1];
	}
	else
	{
		smallest = a[1];
		secondSmall = a[0];
	}
	for(int i = 2; i <a.length; i++)
	{
		if(a[i] < smallest)
		{
			secondSmall = smallest;
			smallest = a[i];
		}
		else if(a[i] < secondSmall)
		{
			secondSmall = a[i];
		}
	}
	System.out.println("Second smallest is " + secondSmall);
	}
}
