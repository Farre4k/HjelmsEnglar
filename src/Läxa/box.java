package Läxa;

import java.util.ArrayList;

public class box {
	
	private static ArrayList<Object> Farre = new ArrayList<Object>();

	public static void add(Object a) {
		
		Farre.add(a);
		
	}
	public static ArrayList<Object> returnera(){
		return Farre;
	}
}
