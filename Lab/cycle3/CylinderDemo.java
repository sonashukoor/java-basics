
import java.util.Scanner;

interface Operations
{
	double PI = 3.14;
	double area();
	double volume();
}

class Cylinder implements Operations
{
	double height, radius;
	Cylinder(double r, double h)
	{
		this.radius = r;
		this.height = h;
	}
	public double area()
	{
	 	return(2 * PI * radius * (radius + height));
	}
	public double volume()
	{
	 	return(PI * radius * radius * height);
	}
}

public class CylinderDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of cylinder");
		int cr = sc.nextInt();
		System.out.println("Enter height of cylinder");
		int ch = sc.nextInt();
		Cylinder cy = new Cylinder(cr,ch);
		System.out.println("Cylinder area is " + cy.area() + " and volume is " + cy.volume());
	}
}
