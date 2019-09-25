package Prg2;
import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int summa = 0;
		
		for (int i = 0; i < arr.length; i++) {
			summa = summa + arr[i];
		}
		System.out.println("summa: " + summa);
		
	}

}
