import java.util.Scanner;
public class IT24101396Lab3Q4 {
	public static void main(String[] args)
	{
	int amount,notes, coins;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a five-digit number: ");
	amount = input.nextInt();
	
	int number1 = amount/10000;
	amount=amount%10000;
	
	int number2 = amount/1000;
	amount=amount%1000;
	
	int number3 = amount/100;
	amount=amount%100;
	
	int number4 = amount/10;
	amount=amount%10;
	
	int number5 = amount/1;
	amount=amount%1;
	
	System.out.println(number1+"\t" +number2+"\t" +number3+ "\t" +number4+ "\t" +number5);
	}
	}