import java.util.Scanner;
public class IT24101396Lab3Q2{
	public static void main(String[] args)
	{
	double otamaount, othours, hourlyrate, monsalary, totsalary;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the monthly salary: ");
	monsalary = input.nextDouble();
	System.out.print("Enter the number of OT hours: ");
	othours = input.nextDouble();
	System.out.print("Enter the OT hourly rate: ");
	hourlyrate = input.nextDouble();
	
	otamaount = othours * hourlyrate;
	totsalary = monsalary + otamaount;
	
	System.out.println("The total salary including OT is: " +totsalary);
	}
	}