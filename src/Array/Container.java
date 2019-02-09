package Array;

import java.util.Scanner;

public class Container {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		int [] array = new int [7];
		System.out.println("Enter numbers:");
		for (int i = 0; i<array.length; i++) {
				array[i] = input.nextInt();
			}
		for (int j = 0; j <array.length; j++) {
			System.out.println(array[j]);
			input.close();
		}
	}
}

