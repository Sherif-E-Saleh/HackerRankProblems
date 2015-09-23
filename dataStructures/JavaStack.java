package dataStructures;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
	
	public static boolean balancing (String token){
		Stack <Character> checker = new Stack <Character>();
		return isBalanced (token, checker);
	}
	
	public static boolean isBalanced(String token, Stack <Character> container){
		//baseCase
		if(token.length() == 0 && container.isEmpty())
			return true;
		
		//insertion of open braces
		if(token.length() > 0 &&(token.charAt(0) == '(' || token.charAt(0) =='{' || token.charAt(0)=='[')){
			container.push(token.charAt(0));
			return isBalanced (token.substring(1), container);
		}
		else{
			if(token.length() > 0 && !container.isEmpty() &&((token.charAt(0) == ')' && container.peek() == '(') || (token.charAt(0) == ']' && container.peek() == '[') || (token.charAt(0) == '}' && container.peek() == '{'))){
				container.pop();
				return true&&isBalanced(token.substring(1), container);
			}
			else 
				return false;
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ArrayList <String> input = new ArrayList <String>();
	    Scanner reader1 = new Scanner(System.in);
	    String str = reader1.nextLine();
		
	    input.add(str);
	    while(str.length()!=0 && reader1.hasNextLine()){
	    	str = reader1.nextLine();
			input.add(str);
		}
	    for (int i = 0; i < input.size(); i++) {
	    	if(!input.get(i).equals(""))
	    		System.out.println(balancing (input.get(i)));
	 
		} 
	}

}
