import java.util.Scanner;

class ZeroSaleException extends Exception
{
	public ZeroSaleException(String message)
	{
		super(message);
	}
}

class Salesman
{
	String name;
	int code;
	int amount;
	int commission;

	int sales(int amount)
	{
		if(amount<2000)
		{
			commission = 8;
		}
		else if(amount >= 2000)
		{
			if(amount <= 5000)
				commission = 10;
			else
				commission = 12;
		}
		return commission;
	}
}

public class SalesmanDemo
{
	public static void main(String [] args)
	{
		Scanner sc =  new Scanner(System.in);
		Salesman s = new Salesman();
		System.out.println("Enter the name, salesman code, sales amount  respectively:");
		s.name = sc.nextLine();
		s.code = sc.nextInt();
		try
		{
		s.amount = sc.nextInt();
		if(s.amount <= 0)
		{
			throw new ZeroSaleException("Zero sales.");
		}
		s.commission = s.sales(s.amount);
		System.out.println("\nDeatails are: "+"\nName: "+s.name +"\nSalesman Code: "+ s.code +"\nSales amount: "+ s.amount +"\nCommission: "+ s.commission + "%");
		}
		catch(ZeroSaleException e)
		{
			System.out.println("Invalid!! " + e.getMessage());
		}
	}
}
