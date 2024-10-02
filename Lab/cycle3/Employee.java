import java.util.*;

class EmployeeDemo
{
	String name;
	int age;
	int number;
	String address;
	int salary;
	EmployeeDemo(String name,int age,int number,String address,int salary)
	{
		this.name = name;
		this.age = age;
		this.number = number;
		this.address = address;
		this.salary = salary;
	}
	public void print_Salary()
	{
		System.out.println("Salary is:" + salary);
	}
	void display()
	{
	System.out.println("Name " + name + "\nAge "+ age + "\nPhone "+ number+"\nAddress "+ address+ "\nSalary"+ salary);
	}
}
class Officer extends EmployeeDemo
{
	String specialisation;
	public Officer(String name,int age,int number,String address,int salary,String specialisation)
	{
	super(name,age, number,address,salary);
	this.specialisation = specialisation;
	}
	void display()
	{
		super.display();
		System.out.println("Specialisation "+ specialisation);
	}
}

class Manager extends EmployeeDemo
{
	String department;
	public Manager(String name,int age,int number,String address,int salary, String department)
	{
		super(name,age, number,address,salary);
		this.department = department;
	}
	void display()
	{
		super.display();
	System.out.println("Department "+ department);
	}

}

public class Employee
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter details of Officer one by one:");
	System.out.println(" 1.Name\n 2.Age\n 3.Phone number\n 4.Address\n 5.Salary\n 6.Specialisation");
	String n = sc.nextLine();
	int a = sc.nextInt();
	int nu = sc.nextInt();
	sc.nextLine();
	String ad = sc.nextLine();
	int sal = sc.nextInt();
	sc.nextLine();
	String sp = sc.nextLine();
	Officer o = new Officer(n,a,nu,ad,sal,sp);

	System.out.println("Enter details of Manager one by one:");
	System.out.println(" 1.Name\n 2.Age\n 3.Phone number\n 4.Address\n 5.Salary\n 6.Department");
	String na = sc.nextLine();
	int ag = sc.nextInt();
	int num = sc.nextInt();
	sc.nextLine();
	String add = sc.nextLine();
	int salar = sc.nextInt();
	sc.nextLine();
	String dep = sc.nextLine();
	Manager m = new Manager(na,ag,num,add,salar,dep);
System.out.println("The details are:");
System.out.println("\nOFFICER");
o.display();
System.out.println("\nMANAGER");
m.display();
}
}
