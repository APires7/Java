package contaBancaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int opc, account;
		double balance;
		CC ac;
		LESO list = new LESO(5);

		do {
			System.out.println("1 - New Account");
			System.out.println("2 - Deposit");
			System.out.println("3 - Cash Out");
			System.out.println("4 - Remove Account");
			System.out.println("5 - Exit");
			opc = input.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Number Account: ");
				account = input.nextInt();
				System.out.println("Balance: ");
				balance = input.nextDouble();
				ac = new CC(account, balance);
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				System.out.println("Number Account: ");
				account = input.nextInt();
				list.removeAccount(account);		
				break;
			case 5:
				break;

			}
		} while (opc <= 5);
	}
}
