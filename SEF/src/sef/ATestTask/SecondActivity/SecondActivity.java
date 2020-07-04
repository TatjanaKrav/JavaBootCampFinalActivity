package sef.ATestTask.SecondActivity;
import java.util.Scanner;

// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		try {
		
		Calculator mycalculator = new Calculator();
		
		Scanner in = new Scanner(System.in);
		int choose = 0;
		int a, b;
		double a1, b1;
		System.out.println("Please choose the option to perform action");
		System.out.println("getSum - type1\ngetDifference - type 2\ngetProduct - type 3\ngetQuotient - type 4");
		
		choose = in.nextInt();
		in.nextLine();
		
		switch(choose) {
		case 1: //getSum
			System.out.println("Insert number1:");
			a = in.nextInt();
			in.nextLine();
			
			System.out.println("Insert number2:");
			b = in.nextInt();
			in.nextLine();
			
			int sum = mycalculator.getSum(a, b);
			System.out.println("The result is: " + sum);
			
		break;
		
		case 2: //getDifference
			System.out.println("Insert number1:");
			a = in.nextInt();
			in.nextLine();
			
			System.out.println("Insert number2:");
			b = in.nextInt();
			in.nextLine();
			
			int diff = mycalculator.getDifference(a, b);
			System.out.println("The result is: " + diff);
			
		break;
		
		case 3: //getProduct
			System.out.println("Insert number1:");
			a1 = in.nextInt();
			in.nextLine();
			
			System.out.println("Insert number2:");
			b1 = in.nextInt();
			in.nextLine();
			
			double prod = mycalculator.getProduct(a1, b1);
			System.out.println("The result is: " + prod);
			
		break;
		
		case 4: //getQuotient
			System.out.println("Insert number1:");
			a1 = in.nextInt();
			in.nextLine();
			
			System.out.println("Insert number2:");
			b1 = in.nextInt();
			in.nextLine();
			
			if(b1 == 0) {
				System.out.println("Can not divide by 0");
			}else {
				double quot = mycalculator.getQuotient(a1, b1);
				System.out.println("The result is: " + quot);
			}
		break;
		}
		in.close();	
	} catch(Exception e ){
		System.out.println("Only numbers can be inserted");
	}

}
}
