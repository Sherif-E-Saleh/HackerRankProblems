package warmUp;

import java.util.Scanner;

public class BigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner read = new Scanner (System.in);
		int numOfLines = read.nextInt();
		int [] elements = new int [numOfLines];
		for (int i = 0; i < numOfLines; i++) {
			elements [i] = read.nextInt();
		}
		Long result = (long) 0;
		for (int i = 0; i < elements.length; i++) {
			result = result + elements [i];
		}
		
		System.out.println(result);

	}

}
