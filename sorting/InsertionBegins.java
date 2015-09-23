package sorting;

import java.util.Scanner;

public class InsertionBegins {

	public static void insertionSort (int [] input){
		int temp = input[input.length-1];
		for (int i = input.length-1; i >= 0 ; i--) {
			if(i !=0 &&input[i-1]>=temp)
				input[i] = input[i-1];
			else{
				input[i] = temp;
				break;
			}
			for (int j = 0; j < input.length; j++) {
				System.out.print(input[j]+" ");
			}
			System.out.println();
		}
		for (int j = 0; j < input.length; j++) {
			System.out.print(input[j]+" ");
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner (System.in);
		int [] test = new int [reader.nextInt()];
		for (int i = 0; i < test.length; i++) {
			test [i] = reader.nextInt();
		}
		insertionSort(test);

	}

}
