interface P
{
int a = 1;
void method();
}

interface P1 extends P
{
int b = 2;
}

interface P2 extends P
{
int c = 3;
}

interface P12 extends P1, P2
{
int d = 4;
void methodp12();
}

class Q implements P12
{
	public void method()
	{
		System.out.println("Constant in P "+a);
	}
	public void methodp1()
	{
		System.out.println("Constant in P1 "+b);
	}
	public void methodp2()
	{
		System.out.println("Constant in P2 "+c);
	}
	public void methodp12()
	{
		System.out.println("Constant in P12 "+d);
	}
}

public class Interface
{
	public static void main(String[] args)
	{
		Q obj = new Q();
		obj.method();
		obj.methodp1();
		obj.methodp2();
		obj.methodp12();
	}
}
