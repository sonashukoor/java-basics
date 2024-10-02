import java.util.Scanner;

public class Quad
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter coefficients:");
	float a = sc.nextFloat();
	float b = sc.nextFloat();
	float c = sc.nextFloat();
	float d = b*b - 4*a*c;
	if(d >= 0)
	{
		float x = (-b + (float)Math.sqrt(d))/(2*a); //sqrt gives double
		float y = (-b - (float)Math.sqrt(d))/(2*a);
		System.out.println("The roots are " + x + " and " + y);
	}
	else
	{
		float x = -b/(2*a);
		float y = (float)Math.sqrt(-d)/(2*a);
		System.out.println("The roots are " + x + "+i "+ y + " and " + x + "-i "+ y);
	}
	}
}


