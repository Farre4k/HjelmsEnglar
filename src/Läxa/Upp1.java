package Läxa;

public class Upp1 {
	
	public static void main(String[] args) {
		
	int[] num = new int[] {5, 5, 1, 10, 20, 21};
	
	System.out.println(summering(num));
	
	
	}
	
	public static int summering(int[] num) {
		
		int summa = 0;
		
		for (int i = 0; i < num.length; i++) {
			
			summa += num[1];
			
		}
		return summa;
		
	}

}