package dataStructures;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Java1DArray {

	public static String[] canWin(ArrayList<int[]> container) {
		String[] result = new String[container.size()];
		for (int i = 0; i < container.size(); i++) {
			// case that the jump is actually wider than the length
			if (container.get(i)[(container.get(i)).length - 1] >= (container
					.get(i)).length)
				result[i] = "YES";
			// case that you are not moving m = 0
			else if (container.get(i)[(container.get(i)).length - 1] == 0)
				result[i] = "NO";
			// case of having jump of 1
			else if (container.get(i)[(container.get(i)).length - 1] == 1) {
				boolean found1 = false;
				for (int j = 0; j < (container.get(i)).length - 1; j++) {
					if (container.get(i)[j] == 1) {
						found1 = true;
						break;
					}
				}
				if (found1)
					result[i] = "NO";
				else
					result[i] = "YES";
			} else {
				int jump = container.get(i)[container.get(i).length - 1];
				int length = container.get(i).length - 1;
				int pointing = 0;
				Stack<Integer> currPath = new Stack<Integer>();
				Stack<Integer> visited = new Stack<Integer>(); // always pushing
				currPath.push(0);
				visited.push(0);

				while (!currPath.isEmpty()) {
					if (pointing + jump >= length) {
						result[i] = "YES";
						break;
					} else if (!visited.contains(pointing + jump)
							&& container.get(i)[pointing + jump] == 0) {
						pointing = pointing + jump;
						currPath.push(pointing);
						visited.push(pointing);
					} else {
						if (container.get(i)[pointing + 1] == 0
								&& !visited.contains(pointing + 1)) {
							pointing = pointing + 1;
							currPath.push(pointing);
							visited.push(pointing);
						} else if (pointing - 1 >=0 && container.get(i)[pointing - 1] == 0
								&& !visited.contains(pointing - 1)) {
							pointing = pointing - 1;
							currPath.push(pointing);
							visited.push(pointing);
						} else {
							if (!currPath.isEmpty()){
								pointing = currPath.pop();
								if(pointing == 0){
									if(container.get(i)[1] == 0 && !visited.contains(1)){
										currPath.push(0);
										currPath.push(1);
										visited.push(1);
										pointing = 1;
									}
								}
								if(currPath.isEmpty())
									result[i]="NO";
							}
						}
					}
				}
			}

		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		int numOfTests = read.nextInt();
		int[] trials;
		ArrayList<int[]> container = new ArrayList<int[]>();
		for (int i = 0; i < numOfTests; i++) {
			trials = new int[read.nextInt() + 1];
			int jump = read.nextInt();
			for (int j = 0; j < trials.length - 1; j++) {
				trials[j] = read.nextInt();
			}
			trials[trials.length - 1] = jump;
			container.add(trials);
		}

		String[] output = canWin(container);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
