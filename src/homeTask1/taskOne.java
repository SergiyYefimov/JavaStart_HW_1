package homeTask1;

import java.util.Scanner;

public class taskOne {
	public static void main(String[] args) {
		int mass[];
		mass = new int[5];
		int x = 10000;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		for (int i = 0; i < 5; i++) {
			mass[i] = (number / x);
			mass[i] = mass[i] % 10;
			x /= 10;
			System.out.println(mass[i]);
		}
		input.close();
	}

}
