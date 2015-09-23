package warmUp;

import java.util.ArrayList;
import java.util.Scanner;

public class SherlockDecent {

	public static ArrayList<String> watson (int num){
		ArrayList <String> result = new ArrayList <String>();
		while (num >= 1){
			if(num == 1 || num == 2 || num ==4 || num == 7){
				 result.add("-1");
				 break;
			}
			else if(num == 5){
				result.add("33333");
				break;
			}
			else if(num == 10){
				result.add("33333");
				num = num/2;
			}
			else{
				result.add("555");
				num = num - 3;
			}
		}
		return result;
	}
	public static void print (ArrayList <String> input){
		if(input.get(0).equals("-1"))
			System.out.println(-1);
		else{
				for (int i = 0; i < input.size(); i++) {
					System.out.print(input.get(i));
				}
				System.out.println();
			}
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int [] numOfTests = new int [reader.nextInt()];
		for (int i = 0; i < numOfTests.length; i++) {
			numOfTests [i] = reader.nextInt();
		}
		for (int i = 0; i < numOfTests.length; i++) {
			print(watson(numOfTests[i]));
		}
	}

}
