import java.util.Scanner;
public class IT24101396Lab3Q1A {
	public static void main(String[] args)
	{
	double price, kilograms, total;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the price of 1Kg of rice: ");
	price = input.nextDouble();
	System.out.print("Enter the number of kilograms you want to buy: ");
	kilograms = input.nextDouble();
	
	total = price * kilograms;
	
	System.out.println("The total amount is: " + total);
	}
	}
	
	
	