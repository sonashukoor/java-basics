abstract class Shape
{
	abstract void numberOfSides();
}

class Rectangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("Rectangle has 4 sides");
	}
}

class Triangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("Triangle has 3 sides");
	}
}

class Hexagon extends Shape
{
	void numberOfSides()
	{
		System.out.println("Hexagon has 6 sides");
	}
}

public class ShapeDemo
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Hexagon h = new Hexagon();
		r.numberOfSides();
		t.numberOfSides();
		h.numberOfSides();
	}
}

