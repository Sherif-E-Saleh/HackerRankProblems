package implementation;

import java.util.HashSet;
import java.util.Scanner;

public class GoT {
	
	public static boolean anagram(String str){
		HashSet <Character> group = new HashSet<Character>();
		while(str.length() > 0){
			if(!group.contains(str.charAt(0)))
				group.add(str.charAt(0));
			else
				group.remove(str.charAt(0));
			str = str.substring(1);
		}
		if(group.size() == 1 || group.isEmpty())
			return true;
		else 
			return false;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner reader = new Scanner (System.in);
		if(anagram(reader.nextLine()))
			System.out.println("YES");
		else
			System.out.println("NO");
		

	}

}
