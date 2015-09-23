package implementation;

import java.util.Scanner;

public class CutTheSticks {
	
	public static void numOfSticks (int [] sticks, int smallest){
		int count = sticks.length;
		int oldcount = count;
		int smallestNext = smallest;
		boolean justOne = false;
		System.out.println(count);
		while(count > 0){
			smallest = smallestNext;
			for (int i = 0; i < sticks.length && count > 0; i++) {
				if(sticks[i] > 0){
					sticks[i] = sticks[i]-smallest;
					if(sticks[i] == 0)
						count --;
					else{
						if(sticks [i] < smallestNext)
							smallestNext = sticks [i];
					}
				}
			}
			if(count < oldcount && count > 0 && !justOne){
				System.out.println(count);
				oldcount = count;
				if(count == 1)
					justOne = true;
			}
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int [] sticks = new int [reader.nextInt()];
		int smallest = (int) Double.POSITIVE_INFINITY;
		for (int i = 0; i < sticks.length; i++) {
			sticks [i] = reader.nextInt();
			if(sticks [i] < smallest)
				smallest = sticks[i];
		}
		numOfSticks(sticks, smallest);
	}

}
