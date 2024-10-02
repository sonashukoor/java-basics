class Staff{
int code;
String name;
Staff(int code, String name)
{
	this.code = code;
	this.name = name;
}
void display()
{
	System.out.println("Code " + code +"\nName " + name);
}
}

class Faculty extends Staff{
String department;
String subject;
String researchArea;
Faculty(int code, String name, String department, String subject, String researchArea){
super(code, name);
this.department = department;
this.subject = subject;
this.researchArea = researchArea;
}
void display()
{
	super.display();
	System.out.println("Department "+department+"\nSubject "+subject+"\nResearch Area "+ researchArea);
}
}

class Officer extends Staff{
String rank;
String grade;
Officer(int code, String name, String rank, String grade){
super(code, name);
this.rank = rank;
this.grade = grade;
}
void display()
{
	super.display();
	System.out.println("Rank "+rank+"\nGrade "+grade);
}
}

class Typist extends Staff{
String office;
String speed;
Typist(int code, String name,String office, String speed)
{
super(code, name);
this.office = office;
this.speed = speed;
}
}

class Permanent extends Typist{
int salary;
Permanent(int code, String name,String office, String speed, int salary){
super(code, name, office, speed);
this.salary = salary;
}
void display()
{
	super.display();
	System.out.println("Office "+office+"\nSpeed "+speed+"\nSalary "+salary);
}
}

class Casual extends Typist{
int wage;
Casual(int code, String name,String office, String speed, int wage){
super(code, name, office, speed);
this.wage = wage;
}
void display()
{
	super.display();
	System.out.println("Office "+office+"\nSpeed "+speed+"\nDaily wage "+wage);
}
}

public class Inherit{
	public static void main(String[] args){
		Faculty f = new Faculty(87, "Lala", "CS", "LS", "jl");
		Officer o = new Officer(310, "Res", "Major", "B");
		Permanent p = new Permanent(76, "Jose", "Top", "medium", 20000);
		Casual c = new Casual(523, "Sai", "Lower", "fast", 2000);
		System.out.println("Faculty details:");
		f.display();
		System.out.println("\nOfficer details:");
		o.display();
		System.out.println("\nPermanent Typist details:");
		p.display();
		System.out.println("\nCasual Typist details:");
		c.display();
	}
}
