package bigNumber;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class BigDecimalProb {
	
	public static void quicksort (ArrayList <BigDecimal> input){
		quicksort (input, 0, input.size()-1);
	}
	
	public static void quicksort (ArrayList <BigDecimal> input, int left, int right){
		int index = partition (input, left, right);
		if (left < index - 1) {
			quicksort(input, left, index - 1);
		}
		if (right > index) {
			quicksort(input, index, right);
		}
	}
	
	public static int partition (ArrayList <BigDecimal> input, int left, int right){
		BigDecimal pivot = input.get((left+right)/2);
		while(left <= right){
			while (input.get(left).compareTo(pivot)<0)
				left++;
			while (input.get(right).compareTo(pivot)>0)
				right--;
			if(left<=right){
				swap(input, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
	
	public static void swap (ArrayList <BigDecimal> input, int left, int right){
		BigDecimal temp = new BigDecimal (0);
		temp = input.get(left);
		input.set(left, input.get(right));
		input.set(right, temp);	
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		double numOfLines = (double)read.nextInt();
		
		ArrayList <BigDecimal> container = new ArrayList<BigDecimal>();
		for (int i = 0; i < numOfLines; i++) {
			container.add(read.nextBigDecimal());
		}
		String digits = ".";
		for (int i = 0; i < 300; i++) {
			digits = digits +"#";
		}
		quicksort (container);
		DecimalFormat x = new DecimalFormat (digits);
		
		for (int i = container.size()-1; i >= 0; i--) {
			if(container.get(i).doubleValue() < (1) && container.get(i).doubleValue() >0)
				System.out.println(x.format(container.get(i)));
			else
				System.out.println(container.get(i));
		}
		
	}

}
