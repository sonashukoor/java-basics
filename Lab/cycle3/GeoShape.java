import java.util.Scanner;

interface Area
{
	double calArea();
}

interface Volume
{
	double calVol();
}

abstract class Shape implements Area
{
	String name;
	Shape(String n)
	{
		this.name = n;
	}
	public String getName()
	{
	return name;
	}
}

class Circle extends Shape implements Area
{
	double radius;
	Circle(double r, String n)
	{
		super(n);
		this.radius = r;
	}
public double calArea()
{
	return (Math.PI * radius * radius);
}
}

class Square extends Shape implements Area
{
	double side;
	Square(double s, String n)
	{
		super(n);
		this.side = s;
	}
	public double calArea()
	{
		return (side * side);
	}
}

class Cylinder extends Circle implements Volume
{
	double height;
	Cylinder(double h, double r, String n)
	{
		super(r,n);
		this.height = h;
	}
	public double calVol()
	{
		return (Math.PI * radius * radius * height);
	}
}

class Sphere extends Circle implements Volume
{
	Sphere(double r, String n)
	{
		super(r,n);
	}
	public double calVol()
	{
		return ((4/3) * Math.PI * Math.pow(radius,3));
	}
}

class Cube extends Square implements Volume
{
	Cube(double s, String n)
	{
		super(s,n);
	}
	public double calVol()
	{
		return (Math.pow(side ,3));
	}
}

class Glome extends Sphere
{
	Glome(double r, String n)
	{
		super(r,n);
	}
	public double calVol()
	{
		return (0.5 * Math.PI * Math.PI * Math.pow(radius,5));
	}
}

public class GeoShape
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		int choice, cont;
		do{
		System.out.println("MENU\n Area of\n 1.Circle\n 2.Square\n\n Volume of\n 3.Cylinder\n 4.Sphere\n 5.Cube\n 6.Glome\n");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
			System.out.println("Enter radius of circle");
			int c_r = sc.nextInt();
			Circle c = new Circle(c_r, "Circle");
			System.out.println(c.getName() +" area: " + c.calArea());	
			break;

			case 2:
			System.out.println("Enter length of square");
			int sq_s = sc.nextInt();
			Square sq = new Square(sq_s, "Square");
			System.out.println(sq.getName() +" area: " + sq.calArea());
			break;

			case 3:
			System.out.println("Enter radius of cylinder");
			int cy_r = sc.nextInt();
			System.out.println("Enter height of cylinder");
			int cy_h = sc.nextInt();
			Cylinder cy = new Cylinder(cy_h, cy_r, "Cylinder");
			System.out.println(cy.getName() +" volume: " + cy.calVol());
			break;

			case 4:
			System.out.println("Enter radius of sphere");
			int sp_r = sc.nextInt();
			Sphere sp = new Sphere(sp_r,"Sphere");
			System.out.println(sp.getName() +" volume: " + sp.calVol());
			break;

			case 5:
			System.out.println("Enter length of cube");
			int cu_s = sc.nextInt();
			Cube cu = new Cube(cu_s,"Cube");
			System.out.println(cu.getName() +" volume: " + cu.calVol());
			break;

			case 6:
			System.out.println("Enter radius of glome");
			int g_r = sc.nextInt();
			Glome g = new Glome(g_r,"Glome");
			System.out.println(g.getName() +" volume: " + g.calVol());
			break;

			default:
			System.out.println("Invalid!!");
		}
		System.out.println("Do another operation?");	
		cont = sc.nextInt();
		}while(cont == 1);
	}
}
