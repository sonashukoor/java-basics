import java.util.Scanner;


class Rectangle
{
	int length;
	int breadth;
	int area;
	Rectangle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth");
		length = sc.nextInt();
		breadth = sc.nextInt();
	}
	void areaRectangle()
	{
		area = length * breadth;
		System.out.println("Area of rectangle is "+ area);
		System.out.println();
	}
}

class Circle
{
	int radius;
	double area;
	Circle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		radius = sc.nextInt();
	}
	void areaCircle()
	{
		area = Math.PI * (double)radius *(double)radius;
		System.out.println("Area of circle is "+ area);
		System.out.println();
	}
}

class Triangle
{
	double base;
	double height;
	double area;
	Triangle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base length and height");
		base = sc.nextDouble();
		height = sc.nextDouble();
	}
	void areaTriangle()
	{
		area = 0.5 * base * height;
		System.out.println("Area of triangle is "+ area);
		System.out.println();
	}
}

class Trapezoid
{
	double l1;
	double l2;
	double height;
	double area;
	Trapezoid()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lengths of parallel side");
		l1 = sc.nextDouble();
		l2 = sc.nextDouble();
		System.out.println("Enter height");
		height = sc.nextDouble();
	}
	void areaTrapezoid()
	{
		area = 0.5 * (l1 + l2) * height;
		System.out.println("Area of trapezoid is "+ area);
		System.out.println();
	}
}

public class Area
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Find area of\n 1.Rectangle\n 2.Circle\n 3.Triangle\n 4.Trapezoid\n 5.EXIT");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				Rectangle rectangle = new Rectangle();
				rectangle.areaRectangle();
				break;
				case 2:
				Circle circle = new Circle();
				circle.areaCircle();
				break;
				case 3:
				Triangle triangle = new Triangle();
				triangle.areaTriangle();
				break;
				case 4:
				Trapezoid trapezoid = new Trapezoid();
				trapezoid.areaTrapezoid();
				break;
				case 5:
				System.out.println("Thank You!!");
				break;
				default:
				System.out.println("Invalid option. Try again.\n");
				}
		}while(choice != 5);
	}

}
