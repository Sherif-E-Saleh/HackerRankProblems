package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class SherlockAnagrams {
	
//	public static int howManyPairs (String anagram){
//		HashMap <String, Integer> map = new HashMap <String, Integer>();
//		int starter = 0;
//		int start_inside = 1;
//		int length = anagram.length();
//		int tracer = length-1;
//		int trace_inside = tracer-1;
//		
//		while (starter < length-1){
//			if(anagram.charAt(starter) == anagram.charAt(tracer)){
//				if(map.containsKey(anagram.substring(starter, starter+1)))
//					map.put(anagram.substring(starter, starter+1), map.get(anagram.substring(starter, starter+1))+1);
//				else
//					map.put(anagram.substring(starter, starter+1),1);
//				if(anagram.charAt(start_inside)==anagram.charAt(trace_inside)){
//				while (anagram.charAt(start_inside)==anagram.charAt(trace_inside) && (start_inside < length && trace_inside > 0)){
//					
//					if(map.containsKey(anagram.substring(starter, start_inside+1)))
//						map.put(anagram.substring(starter, start_inside+1), map.get(anagram.substring(starter, start_inside+1))+1);
//					else
//						map.put(anagram.substring(starter, start_inside+1), 1);
//					
//					if(map.containsKey(anagram.substring(Math.min(start_inside, trace_inside), Math.max(start_inside, trace_inside))))
//						map.put(anagram.substring(Math.min(start_inside, trace_inside), Math.max(start_inside, trace_inside)), map.get(anagram.substring(Math.min(start_inside, trace_inside), Math.max(start_inside, trace_inside)))+1);
//					else
//						map.put(anagram.substring(Math.min(start_inside, trace_inside), Math.max(start_inside, trace_inside)), 1);
//					start_inside++;
//					trace_inside--;
//					if(start_inside > length-1 || trace_inside < 0)
//						break;
//				}
//				}
//				else{
//					if(map.containsKey(anagram.substring(starter, tracer+1)))
//						map.put(anagram.substring(starter, tracer+1), map.get(anagram.substring(starter, tracer+1))+1);
//					else 
//						map.put(anagram.substring(starter, tracer+1), 1);
//
//				}
//			}
//				tracer--;
//				if(tracer == starter){
//					tracer = length-1;
//					trace_inside = tracer-1;
//					starter ++;
//					start_inside = starter +1;
//				}
//				else{
//					start_inside = starter +1;
//					trace_inside = tracer-1;
//				}
//	}
//		int count = 0;
//		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
//		while (it.hasNext()){
//			@SuppressWarnings("rawtypes")
//			Map.Entry pair = (Map.Entry)it.next();
//			count = count + Math.abs((int) pair.getValue());
//			it.remove();
//		}
//		return count;
//	}
	
	public static boolean isAnagrams (String str1, String str2){
		char [] temp1 = str1.toCharArray();
		char [] temp2 = str2.toCharArray();
		Arrays.sort(temp1);
		Arrays.sort(temp2);
		if(Arrays.equals(temp1, temp2))
			return true;
		else 
			return false;
	}
	
	public static int anagramicPairs (String input){
		HashMap <String, Integer> map = new HashMap <String, Integer>();
		int anchor = 0;
		int pointer = anchor+1;
		int tokenLength = 0;
		
		while(tokenLength < input.length()){
			while(anchor+tokenLength < input.length()){
				String temp1 = input.substring(anchor, anchor+tokenLength+1);
				while(pointer+tokenLength < input.length()){
					String temp2 = input.substring(pointer, pointer+tokenLength+1);
					if(isAnagrams(temp1, temp2)){
						if(map.containsKey(temp1))
							map.put(temp1, map.get(temp1)+1);
						else
							map.put(temp1, 1);
					}
					pointer++;
				}
				anchor++;
				pointer = anchor+1;
			}
			tokenLength++;
			anchor = 0;
			pointer = anchor+1;
		}
		int count = 0;
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()){
			@SuppressWarnings("rawtypes")
			Map.Entry pair = (Map.Entry)it.next();
			count = count + Math.abs((int) pair.getValue());
			it.remove();
		}
		return count;
	}
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner (System.in);
		String [] tests = new String [Integer.parseInt(reader.nextLine())];
		for (int i = 0; i < tests.length; i++) {
			tests [i] = reader.nextLine();
		}
		for (int i = 0; i < tests.length; i++) {
			System.out.println(anagramicPairs(tests[i]));
		}
	}

}
