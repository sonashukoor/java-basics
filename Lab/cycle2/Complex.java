import java.util.Scanner;

public class Complex
{
	double real;
	double imaginery;
	static Scanner sc;
	Complex()
	{
		System.out.println("Enter real and imaginary part:");
		this.real = sc.nextDouble();
		this.imaginery = sc.nextDouble();
	}
	Complex(double re, double im)
	{
		real = re;
		imaginery = im;
	}
	public void display()
	{
  		System.out.println("Complex Number: " + this.real + " + " + this.imaginery + "i");
	}
	Complex sum(Complex x)
	{
		double r = this.real + x.real;
		double i = this.imaginery + x.imaginery;
		return (new Complex(r, i));
	}

	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		System.out.println("First complex number");
		Complex c1 = new Complex();
		c1.display();
		System.out.println("\nSecond complex number");
		Complex c2 = new Complex();
		c2.display();
		Complex c = c1.sum(c2);
		System.out.println("\nSum: ");
		c.display();
	}
}
