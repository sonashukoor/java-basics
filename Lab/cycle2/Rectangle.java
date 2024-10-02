import java.util.Scanner;

public class Rectangle
{
	int length;
	int breadth;
	int area;
	int perimeter;
	static Scanner sc;
	Rectangle()
	{
		System.out.println("Enter length and breadth");
		this.length = sc.nextInt();
		this.breadth = sc.nextInt();
	}
	Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public void area()
	{
		this.area = this.length * this.breadth;
  		System.out.println("Area is " + area);
	}
	public void perimeter()
	{
		this.perimeter = 2 * (this.length + this.breadth);
		System.out.println("Perimeter is " + perimeter);
	}
	public int sameArea(Rectangle r)
	{
		if(this.area == r.area)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void main (String[] args)
	{
		sc = new Scanner(System.in);
		System.out.println("Enter details of 1st rectangle");
		Rectangle obj1 = new Rectangle();
		obj1.area();
		obj1.perimeter();

		System.out.println("Enter details of 2nd rectangle");
		System.out.println("Enter length and breadth");
		int l = sc.nextInt();
		int b = sc.nextInt();
		Rectangle obj2 = new Rectangle(l,b);
		obj2.area();
		obj2.perimeter();
		int result = obj2.sameArea(obj1);
		if(result == 1)
		{
			System.out.println("Areas are same");	
		}
		else
		{
			System.out.println("Areas are not same");	
		}
	}
}
