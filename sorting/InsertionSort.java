package sorting;

import java.util.Scanner;

public class InsertionSort {
	
	public static void insertionSort(int [] array){
		for (int i = 1; i < array.length; i++) {
			if(array[i] < array[i-1]){
				insert(i, array);
			}
			for (int j = 0; j < array.length; j++) {
				System.out.print( array [j]+" ");
			}
			System.out.println();
		}
	}
	public static void insert (int place, int [] input ){
		for (int i = place-1; i >= 0; i--) {
			if(input[i] > input[i+1]){
				int temp = input[i];
				input[i] = input[i+1];
				input[i+1] = temp;
			}
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
