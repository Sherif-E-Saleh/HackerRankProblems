package warmUp;

import java.math.BigDecimal;
import java.util.Scanner;

public class Plus_Minus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner read = new Scanner (System.in);
		double numOfLines = (double)read.nextInt();
		double positive = 0;
		double negative = 0;
		double zeros = 0;
		for (int i = 0; i < numOfLines; i++) {
			int temp = read.nextInt();
			if(temp > 0)
				positive++;
			else if (temp < 0)
				negative++;
			else
				zeros++;
		}
		
		Double positiveRes = new Double((double) (positive/numOfLines));
		BigDecimal showPos = new BigDecimal(positiveRes).setScale(3, BigDecimal.ROUND_HALF_UP);
		System.out.println(showPos);
		
		Double negativeRes = new Double((double) (negative/numOfLines));
		BigDecimal showNeg = new BigDecimal(negativeRes).setScale(3, BigDecimal.ROUND_HALF_UP);
		System.out.println(showNeg);
		
		Double zerosRes = new Double((double) (zeros/numOfLines));
		BigDecimal showZ = new BigDecimal(zerosRes).setScale(3, BigDecimal.ROUND_HALF_UP);
		System.out.println(showZ);
		
	}

}
