import java.util.Scanner;

public class Time
{
int min;
int hour;
	static Scanner sc;
	Time()
	{
		System.out.println("Enter in hours and minutes:");
		this.hour = sc.nextInt();
		this.min = sc.nextInt();
	}

	Time(int hours, int minutes)
	{
		this.hour = hours;
		this.min = minutes;
	}
	public void display()
	{
  		System.out.println("Time: " + this.hour + "h " + this.min + "m");
	}
	Time sum(Time x)
	{
		int h = this.hour + x.hour;
		int m = this.min + x.min;
		while(m > 60)
		{
			h = h + 1;
			m = m - 60;
		}
		if(m == 60)
		{
			h = h+1;
			m = 0;
		}
		return (new Time(h, m));
	}

	public static void main (String[] args)
	{
		sc = new Scanner(System.in);
		System.out.println("Enter time 1");
		Time t1 = new Time();
		t1.display();

		System.out.println("\nEnter time 2");
		System.out.println("Enter in hours and minutes");
		int h = sc.nextInt();
		int m = sc.nextInt();
		Time t2 = new Time(h,m);
		t2.display();

		Time t = t1.sum(t2);
		System.out.println("\nTotal time is");
		t.display();
	}
}
