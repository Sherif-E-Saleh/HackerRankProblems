package implementation;

import java.util.Scanner;

public class UtopianTree {
	
	public static int growth (int seasons){
		if(seasons == 0)
			return 1;
		else if(seasons % 2 == 0)
			return 1+growth(seasons-1);
		else
			return 2*growth(seasons-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner reader = new Scanner (System.in);
		int [] tests = new int [reader.nextInt()];
		for (int i = 0; i < tests.length; i++) {
			tests[i] = reader.nextInt();
		}
		for (int i = 0; i < tests.length; i++) {
			System.out.println(growth(tests[i]));
		}
	}

}
