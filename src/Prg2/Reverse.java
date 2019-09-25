package Prg2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] arr = {"people","beautiful","hello"};
	      List<String> medd = Arrays.asList(arr);      
	      Collections.reverse(medd);
	      String[] reversed = medd.toArray(arr);
	      System.out.println(Arrays.toString(reversed));
		
	}

}
