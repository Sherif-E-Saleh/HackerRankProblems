package warmUp;

import java.util.Scanner;

public class Staircase {
	
	public static void plot (int height){
		int level = 1;
		while (level <= height){
			for (int i = 0; i < height - level; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < level; i++) {
				System.out.print("#");
			}
			System.out.println();
			level++;
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		plot(read.nextInt());
	}

}
