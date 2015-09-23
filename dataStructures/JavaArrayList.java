package dataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		ArrayList <int []>container = new ArrayList<int []>();
		int i = read.nextInt();
		for (int j = 0; j < i; j++) {
			int x = read.nextInt();
			int [] temp = new int [x];
			for (int k = 0; k < temp.length; k++) {
				temp[k]=read.nextInt();
			}
			container.add(temp);
		}
		ArrayList <Object> results = new ArrayList<Object>();
		i = read.nextInt();
		for (int j = 0; j < i; j++) {
			int x = read.nextInt();
			int y = read.nextInt();
			if(y-1 < container.get(x-1).length)
				results.add(container.get(x-1)[y-1]);
			else 
				results.add("ERROR!");
		}
		for (int j = 0; j < results.size(); j++) {
			System.out.println(results.get(j).toString());
		}
	}

}
