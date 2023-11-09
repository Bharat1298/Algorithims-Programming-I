import java.util.Scanner;

public class Lab1_Class {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Starting Balance
		System.out.println("Initial Balance: ");
		double balance = input.nextDouble();

		//Monthly Interest Rate
		System.out.println("Interest Rate: ");
		double interest = 1 + (input.nextDouble() / 12) / 100;

		//Monthly Withdrawal Amount
		System.out.println("Withdrawl Amount: ");
		int withdrawl = input.nextInt();

		int years;

		for(years = 0; balance > 0; years++){
		    balance *= interest;
		    balance -= withdrawl;
		}

		return years;
	}

}
