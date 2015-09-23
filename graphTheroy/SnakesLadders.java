package graphTheroy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SnakesLadders {
	
	public static ArrayList < ArrayList <Integer>> graph(int [][] ladders, int [][] snakes){
		ArrayList <ArrayList <int []>> graph = new ArrayList <ArrayList<int []>>(); //main graph
		HashMap <Integer, Integer> index = new HashMap <Integer, Integer>();
		index.put(1, 0);
		int x = (snakes[0].length + ladders[0].length)+2;
		for (int i = 0; i < x; i++) {
			ArrayList<int[]> temp1 = new ArrayList<int []>();
			graph.add(temp1);
		}
		x = Integer.max(ladders[0].length, snakes[0].length);
		int [] temp;
		int row = 1;
		for (int i = 0; i < x; i++) {
			//connect the start to the beginnings of the ladders
			if(i < ladders[0].length){	
				temp = new int [2];
				temp[0] = ladders[0][i];
				int dist = (ladders[0][i]-1)/6;
				if(ladders[0][i]%6 > 0)
					dist++;
				temp [1] = dist;
				graph.get(0).add(temp);
				temp = new int [2];
				temp[0] = ladders[1][i];
				temp[1] = 0;
				graph.get(row).add(temp);	// connect each ladder's beginning to its end at cost 0
				index.put(ladders[0][i], row); 
				row++;
			}
			//connect the start to the mouthes of the snakes 
			if(i < snakes[0].length){
				temp = new int [2];
				temp[0] = snakes[0][i];
				int dist = (snakes[0][i]-1)/6;
				if(snakes[0][i]%6 > 0)
					dist++;
				temp [1] = dist;
				graph.get(0).add(temp);
				temp = new int [2];
				temp[0] = snakes[1][i];
				temp[1] = 0;
				graph.get(row).add(temp);	// connect each snake's mouth to its tail at cost 0
				index.put(snakes[0][i], row); 
				row++;
			}
		}
		//connect the ladder's ends to the board end
		index.put(100, graph.size()-1);
		for (int i = 0; i < x; i++) {
			if(i < ladders[0].length){
				temp = new int [2];
				
			}
		}
		return null;
		
	}
	
	
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		int numOfTests = reader.nextInt();
		ArrayList <int [][]> laddersAndSnakes = new ArrayList <int[][]>();
		for (int i = 0; i < numOfTests; i++) {
			int numofLadders = reader.nextInt();
			int [][] ladders = new int[2][numofLadders];
			for (int j = 0; j < numofLadders; j++) {
				ladders [0][j] = reader.nextInt();
				ladders [1][j] = reader.nextInt();
			}
			laddersAndSnakes.add(ladders);
			int numOfSnakes = reader.nextInt();
			int [][] snakes = new int [2][numOfSnakes];
			for (int j = 0; j < numOfSnakes; j++) {
				snakes[0][j] = reader.nextInt();
				snakes[1][j] = reader.nextInt();
			}
			laddersAndSnakes.add(snakes);
		}
		
		PriorityQueue <Integer> q = new PriorityQueue<Integer> (100, 
			new Comparator<Integer>(){
				public int compare(Integer a, Integer b){
					return b-a;
				}
		});
		
		q.add(4);
		q.add(2);
		q.add(1);
		q.add(5);
		
		while (!q.isEmpty()){
			System.out.println(q.poll());
		}
	}

}
