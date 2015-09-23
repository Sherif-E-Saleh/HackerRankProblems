package search;

import java.util.Scanner;

public class sherlockandArray {
	
	public static String caseSolving (int [] input, int right_sum){
		int left_sum = 0;
		right_sum = right_sum - input[0];
		boolean result = false;
		if(left_sum == right_sum)
			result = true;
		else{
			for (int i = 1; i < input.length; i++) {
				left_sum = left_sum + input[i-1];
				right_sum = right_sum - input[i];
				if(left_sum == right_sum){
					result = true;
					break;
				}	
			}
		}
		if(result)
			return "YES";
		else
			return "NO";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		int testCases = read.nextInt();
		int [] temp;
		int right_sum = 0;
		String out = "";
		for (int i = 0; i < testCases; i++) {
			temp = new int [read.nextInt()];
			for (int j = 0; j < temp.length; j++) {
				temp [j] = read.nextInt();
				right_sum = right_sum + temp[j];
			}
			out = out+caseSolving(temp,right_sum)+"\n";
			right_sum = 0;
		}
		System.out.println(out);
	}

}
