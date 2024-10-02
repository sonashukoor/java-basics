import java.util.*;

public class Account
{
	String name;
	int acnum;
	int iniAmount;
	String address;
	String accType;
	int balance;
	static Scanner sc;

	Account(String n, int no, int iam)
	{
	name = n;
	acnum = no;
	balance = iniAmount = iam;
	}
	Account(String n, int no, String ad, String t, int b)
	{
	this.name = n;
	this.acnum = no;
	address = ad;
	accType = t;
	balance = b;
	}
	public void display(Account a)
	{
		System.out.println("\n *Account holder name :" + a.name +"\n *Initial Amount :" + a.iniAmount+"\n *Account number :" +a.acnum+"\n *Address :"+a.address+"\n *Account Type :" +a.accType+"\n *Current Amount" + a.balance);
	}
	public int deposit(Account a)
	{
		System.out.println("Enter amount to be deposited");
		int dep = sc.nextInt();
		System.out.println("Enter 3 digit PIN:");
		int pin = sc.nextInt();
		if(pin == 001)
		{
			return (a.balance + dep);
		}
		else if(pin == 002)
		{
			return(a.balance + dep);	
		}
		else
		{
		System.out.println("Wrong Pin!!");
		return 1;
		}
	}
	public int withdraw(Account a)
	{
		System.out.println("Enter amount to be withdrawn");
		int dep = sc.nextInt();
		System.out.println("Enter 3 digit PIN:");
		int pin = sc.nextInt();
		if(pin == 001)
		{
			return (a.balance - dep);
		}
		else if(pin == 002)
		{
			return(a.balance - dep);	
		}
		else
		{
		System.out.println("Wrong Pin!!");
		return 1;
		}
	}
	public void getBalance(int g)
	{
		System.out.println("Enter 3 digit PIN:");
		int pin = sc.nextInt();
		if(pin == 001)
		{
			System.out.println("Balance: "+g);
		}
		else if(pin == 002)
		{
			System.out.println("Balance: "+g);
		}
	}

	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		int a;
		System.out.println("Account 1");
		System.out.println("ENTER: \n *Account holder name\n *Account number\n *Initial Amount");
		String x = sc.nextLine();
		int y = sc.nextInt();
		int z = sc.nextInt();
		sc.nextLine();
		Account a1 = new Account(x,y,z);

		System.out.println("Account 2");
		System.out.println("ENTER: \n *Account holder name\n *Account number\n *Address\n *Account Type\n *Current Amount");
		String m = sc.nextLine();
		int n = sc.nextInt();
		sc.nextLine();
		String o = sc.nextLine();
		String p = sc.nextLine();
		int q = sc.nextInt();
		Account a2 = new Account(m,n,o,p,q);

		int l, choice;
		do
		{
		System.out.println("MENU\n1.Deposit\n2.Withdraw\n3.Get Balance\n4.Display\n5.EXIT");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Choose account 1 or 2?");
				a = sc.nextInt();
				if(a == 1)
				{
				a1.balance = a1.deposit(a1);
				}
				else if(a == 2)
				{
				a2.balance = a2.deposit(a2);
				}
				else
				{
				System.out.println("Error!");
				}
			break;

			case 2:
				System.out.println("Choose account 1 or 2?");
				a = sc.nextInt();
				if(a == 1)
				{
				a1.balance = a1.withdraw(a1);
				}
				else if(a == 2)
				{
				a2.balance = a2.withdraw(a2);
				}
				else
				{
				System.out.println("Error!");
				}
				break;

			case 3:
				System.out.println("Choose account 1 or 2?");
				a = sc.nextInt();
				if(a == 1)
				{
				a1.getBalance(a1.balance);
				}
				else if(a == 2)
				{
				a2.getBalance(a2.balance);
				}
				else
				{
				System.out.println("Error!");
				}
				break;
			case 4:
				System.out.println("Choose account 1 or 2?");
				a = sc.nextInt();
				if(a == 1)
				{
				a1.display(a1);
				}
				else if(a == 2)
				{
				a2.display(a2);
				}
				else
				{
				System.out.println("Error!");
				}
				break;
			default:
			System.out.println("****");
			}
			System.out.println("Continue?");
			l = sc.nextInt();
		}
		while(l==1);
		System.out.println("\nTHANK YOU!");
	}
}
