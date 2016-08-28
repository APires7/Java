package trabOrdenacao;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LES listE = new LES();
		LDE listD = new LDE();

		int account = 0;
		double balance = 0;
		BankAccount bankA = new BankAccount(account, balance);
		CCLDE cclde = new CCLDE(account, balance);

		Scanner input = new Scanner(System.in);
		Random random = new Random();
		long initialTime, finalTime;

		int opt;

		do {
			System.out.println("1 Insertion Sort(LES)");
			System.out.println("2 Bubble Sort(LES)");
			System.out.println("3 Merge Sort(LES)");
			System.out.println("4 Quick Sort(LES)");
			System.out.println("5 Insertion Sort(LDE)");
			System.out.println("6 Bubble Sort(LDE)");
			System.out.println("7 Merge Sort(LDE)");
			System.out.println("8 Quick Sort(LDE)");
			System.out.print("Choose one option to order LES/LDE: ");
			opt = input.nextInt();
			switch (opt) {
			case 1:
				for (int i = 0; i < 200; i++) {
					account = random.nextInt(1001);
					balance = random.nextInt(1001);
					bankA = new BankAccount(account, balance);
					listE.add(bankA);
				}
				initialTime = System.currentTimeMillis();
				System.out.println(listE.insertionSort(listE).toString());
				finalTime = System.currentTimeMillis();
				System.out.println("Time: " + (finalTime - initialTime) / 1000d + "\n");
				break;
			case 2:
				for (int i = 0; i < 200; i++) {
					account = random.nextInt(1001);
					balance = random.nextInt(1001);
					bankA = new BankAccount(account, balance);
					listE.add(bankA);
				}
				initialTime = System.currentTimeMillis();
				System.out.println(listE.bubbleSort(listE).toString());
				finalTime = System.currentTimeMillis();
				System.out.println("Time: " + (finalTime - initialTime) / 1000d + "\n");
				break;
			case 3:
				for (int i = 0; i < 200; i++) {
					account = random.nextInt(1001);
					balance = random.nextInt(1001);
					bankA = new BankAccount(account, balance);
					listE.add(bankA);
				}
				initialTime = System.currentTimeMillis();
				listE.mergeSort(listE);
				finalTime = System.currentTimeMillis();
				System.out.println(listE.toString() + (finalTime - initialTime) / 1000d);
				break;
			case 4:
				for (int i = 0; i < 200; i++) {
					account = random.nextInt(1001);
					balance = random.nextInt(1001);
					bankA = new BankAccount(account, balance);
					listE.add(bankA);
				}
				initialTime = System.currentTimeMillis();
				listE.quickSort(listE, 0, listE.maxSize - 1);
				finalTime = System.currentTimeMillis();
				System.out.println(listE.toString() + (finalTime - initialTime) / 1000d);
				break;
			case 5:
				break;
			case 6:
				for (int i = 0; i < 200; i++) {
					account = random.nextInt(1001);
					balance = random.nextInt(1001);
					cclde = new CCLDE(account, balance);
					listD.add(cclde);
				}
				initialTime = System.currentTimeMillis();
				listD.bubbleSort();
				finalTime = System.currentTimeMillis();
				System.out.println(listD.toString() + (finalTime - initialTime) / 1000d);
				break;
			}
		} while (opt != 9);
	}
}

