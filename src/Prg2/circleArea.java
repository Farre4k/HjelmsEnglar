package Prg2;

import java.util.Scanner;

public class circleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r;
		double pi = 3.14, area;
		Scanner s = new Scanner(System.in);
		System.out.println("Skriv radien av circeln!");
		r = s.nextInt();
        area = pi * r * r;
        System.out.println("Cirkelns area:"+area);
	}

}
