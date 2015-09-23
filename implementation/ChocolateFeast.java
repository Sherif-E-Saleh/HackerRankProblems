package implementation;

import java.util.Scanner;

public class ChocolateFeast {
	
	public static int bought (int n, int c, int m){
		int result = 0;
		if(n >= c)
			result = n/c;
		int basicResult = result;
		if(basicResult >= m){
			if(basicResult - m*(basicResult/m) >= m)
				result = result + basicResult/m + basicResult%m;
			else
				result = result + basicResult/m;
			if (basicResult%m + basicResult/m >= m){
				int temp = basicResult;
				while (temp >= m){
					result = result + ((temp%m) + (temp/m))/m;
					temp = temp/m;
				}
			}
		}
		return result;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int [] tests = new int [reader.nextInt()*3];
		for (int i = 0; i < tests.length; i++) {
			tests [i] = reader.nextInt();
		}
		for (int i = 0; i < tests.length-2; i= i+3) {
			System.out.println(bought(tests[i], tests[i+1], tests[i+2]));
		}
	}
}
