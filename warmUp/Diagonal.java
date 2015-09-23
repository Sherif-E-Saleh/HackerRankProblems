package warmUp;

import java.util.Scanner;

public class Diagonal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		int numOfLines = read.nextInt();
		int [][] elements = new int [numOfLines][numOfLines];
		for (int i = 0; i < numOfLines; i++) {
			for (int j = 0; j < elements.length; j++) {
				elements [i][j]=read.nextInt();
			}
		}
		int westEast = 0;
		for (int i = 0; i < elements.length; i++) {
			westEast = westEast + elements[i][i];
		}
		int eastWest =0;
		for (int i = 0; i < elements.length/2; i++) {
			eastWest = eastWest + elements[i][(elements.length-1)-i];
			eastWest = eastWest + elements[(elements.length-1)-i][i];
		}
		if(numOfLines%2 != 0)
			eastWest = eastWest+elements[elements.length/2][elements.length/2];
		
		System.out.println(Math.abs(eastWest - westEast));
	}

}
