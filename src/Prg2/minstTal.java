package Prg2;

import java.util.Scanner;

public class minstTal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 2; i++) {
			int tal = input.nextInt();
			if (tal < min) {
				min = tal;
			}
		}
		System.out.println("MIN: " + min);
	}

}
