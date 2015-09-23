package dataStructures;
import java.util.*;

public class Java2DArray {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner read = new Scanner (System.in);
		String line = read.nextLine();
		String [] row = line.split(" ");
		int [][] matrix = new int [line.split(" ").length][line.split(" ").length];
		for (int i = 0; i < matrix.length; i++) {
			if(i == 0)
				row = line.split(" ");
			else 
				row = read.nextLine().split(" ");
			for (int j = 0; j < matrix.length; j++) {
				matrix [i][j] = Integer.parseInt(row[j]);
			}
		}
		
		int val = (int)Double.NEGATIVE_INFINITY;
				
		for (int i = 0; i < matrix.length-2; i++) {
			for (int j = 0; j < matrix.length-2; j++) {
				int temp = matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+matrix[i+1][j+1]+matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];
				if(temp > val){
					val = temp;
				}
			}
		}
		System.out.println(val);
			
		}
		
		

	}


