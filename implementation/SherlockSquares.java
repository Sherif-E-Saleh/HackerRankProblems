package implementation;

import java.util.Scanner;

public class SherlockSquares {

	public static int squares(int a, int b) {
		int result = 0;
		int i = a;
		while (i <= b){
			if(i % Math.sqrt(i) == 0){
				result ++;
				i = (int)(Math.pow(Math.sqrt(i)+1, 2));
			}
			else 
				i++;
		}
		
		return result;
	}
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner (System.in);
		int [] tests = new int [reader.nextInt()*2];
		for (int i = 0; i < tests.length; i++) {
			tests [i] = reader.nextInt();
		}
		for (int i = 0; i < tests.length-1; i=i+2) {
			System.out.println(squares (tests[i], tests[i+1]));
		}

	}

}
