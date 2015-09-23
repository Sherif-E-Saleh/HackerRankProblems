package dataStructures;

import java.util.*;

public class JavaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> phoneBook = new HashMap<String, String>();
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		int numOfContacts = Integer.parseInt(read.nextLine());
		for (int i = 0; i < numOfContacts; i++)
			phoneBook.put(read.nextLine(), read.nextLine());
		String input = "";
		while(read.hasNext()){
			input = read.nextLine();
			if(phoneBook.containsKey(input))
				System.out.println(input+"="+phoneBook.get(input));
			else 
				System.out.println("Not found");
		}
		input = read.nextLine();
		if(phoneBook.containsKey(input))
			System.out.println(input+"="+phoneBook.get(input));
		else 
			System.out.println("Not found");
	}

}
