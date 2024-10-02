class Employee
{
	void display()
	{
		System.out.println("Name of the class is Employee");
	}
	public void calcSalary()
	{
		System.out.println("Salary is 10000");
	}
}

class Engineer extends Employee
{
	@Override
	public void calcSalary()
	{
		System.out.println("Salary is 20000");
	}
}

public class EmployeeDemo
{
	public static void main(String[] agrs)
	{
		Employee em = new Engineer();
		em.display();
		em.calcSalary();
	}
}
