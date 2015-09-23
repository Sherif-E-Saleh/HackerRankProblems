package strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//import com.google.common.collect.Multimap;

public class MakeAnagrams {
	
	public static int anagram (String str1, String str2){
		HashMap <Character, Integer> map = new HashMap <Character, Integer>();
		for (int i = 0; i < str1.length(); i++) {
			if(map.containsKey(str1.charAt(i)))
				map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
			else
				map.put(str1.charAt(i), 1);
		}
		for (int i = 0; i < str2.length(); i++) {
			if(map.containsKey(str2.charAt(i)))
				map.put(str2.charAt(i), map.get(str2.charAt(i))-1);
			else 
				map.put(str2.charAt(i), -1);
		}
		int count = 0;
		Iterator<Entry<Character, Integer>> it = map.entrySet().iterator();
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
		Scanner reader = new Scanner(System.in);
		System.out.println(anagram(reader.nextLine(), reader.nextLine()));
		}

}
