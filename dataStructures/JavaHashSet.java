package dataStructures;

import java.util.*;

public class JavaHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet <String> home = new HashSet<String>();
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		int numOfinputs = Integer.parseInt(read.nextLine());
		String pairs = "";
		for (int i = 0; i < numOfinputs; i++) {
			pairs = read.nextLine().replaceAll(" ", ",");
			if(!home.contains(pairs))
				home.add(pairs);
			System.out.println(home.size());		
		}
		
		

	}

}
