package strings;

import java.util.*;

public class Tokenization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		String sentence = read.nextLine();

		// checking for special chars !,?.\_'@

		sentence = sentence.trim();

		if (sentence.equals(" ")||sentence.equals("")){
			sentence = "";
			System.out.println(sentence.length());
		}
		else {
			/*
			if (sentence.contains("!"))
				sentence = sentence.replaceAll("\\!", " ");
			if (sentence.contains(","))
				sentence = sentence.replaceAll("\\,", " ");
			if (sentence.contains("?"))
				sentence = sentence.replaceAll("\\?", " ");
			if (sentence.contains("."))
				sentence = sentence.replaceAll("\\.", " ");
			if (sentence.contains("\\"))
				sentence = sentence.replaceAll("\\", " ");
			if (sentence.contains("_"))
				sentence = sentence.replaceAll("\\_", " ");
			if (sentence.contains("'"))
				sentence = sentence.replaceAll("\\'", " ");
			if (sentence.contains("@"))
				sentence = sentence.replaceAll("\\@", " ");
*/
			String[] container = sentence.split("[!,?.\\_'@\\s+]+");
			System.out.println(container.length);
			for (int i = 0; i < container.length; i++) {
				System.out.println(container[i]);
			}
		}

	}

}
