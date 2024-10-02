import java.util.Scanner;

public class Bitwise
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers:");
	int a = sc.nextInt();
	int b = sc.nextInt();

	System.out.println("Perform\n1. Bitwise AND\n2. Bitwise OR\n3. Bitwise NOT\n4. XNOR\n5. left shift\n6. right shift");
	int choice = sc.nextInt();
	System.out.println("Output:");
	switch(choice)
	{
		case 1:
		System.out.println(a&b);
		break;
		case 2:
		System.out.println(a|b);
		break;
		case 3:
		System.out.println(~a +" and "+ ~b);
		break;
		case 4:
		System.out.println(a^b);
		break;
		case 5:
		System.out.println("Shift by:");
		int n = sc.nextInt();
		System.out.println(a<<n);
		System.out.println(b<<n);
		break;
		case 6:
		System.out.println("Shift by:");
		int m = sc.nextInt();
		System.out.println(a>>m);
		System.out.println(b>>m);
		break;
	}
	}
}
