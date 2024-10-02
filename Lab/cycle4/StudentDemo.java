import java.util.Scanner;

class AgeException extends Exception
{
	public AgeException(String message)
	{
		super(message);
	}
}

class Student
{
	int roll_no;
	String name;
	int age;
	String course;
}

public class StudentDemo
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("Enter the roll number, name, age and course of a student respectively:");
		s.roll_no = sc.nextInt();
		sc.nextLine();
		s.name = sc.nextLine();
		try
		{
			s.age = sc.nextInt();
			if(s.age < 15 || s.age > 21)
				throw new AgeException("Age should be in between 15 and 21");
		
		sc.nextLine();
		s.course = sc.nextLine();
		System.out.println("The details of student " + s.name + " are:\n Roll no: "+ s.roll_no + "\n Age: " + s.age + "\n Course: " + s.course);
		}
		catch(AgeException e)
		{
			System.out.println("Exception!! " + e.getMessage());
		}
	}
}
