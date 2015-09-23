package strings;

import java.util.*;

public class JavaStrings {
	
	public static String minSub (String sub, String input, int length){
		//base
		if(input.length()<length)
			return sub;
		//recursive
		else{
			if(sub.compareTo(input.substring(0, length))<=0)
				return minSub(sub, input.substring(1), length);
			else
				return minSub(input.substring(0, length), input.substring(1), length);
		}
	}
	public static String maxSub (String sub, String input, int length){
		//base
		if(input.length()<length)
			return sub;
		//recursive
		else{
			if(sub.compareTo(input.substring(0, length))>=0)
				return maxSub(sub, input.substring(1), length);
			else
				return maxSub(input.substring(0, length), input.substring(1), length);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner read = new Scanner (System.in);
		String str = read.nextLine();
		int subLength = Integer.parseInt(read.nextLine());
		System.out.println(minSub(str.substring(0, subLength),str.substring(1), subLength));
		System.out.println(maxSub(str.substring(0, subLength),str.substring(1), subLength));
	}

}
