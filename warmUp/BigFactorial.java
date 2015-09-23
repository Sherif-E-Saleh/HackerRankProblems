package warmUp;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
	
	public static BigInteger fact(int num){
		BigInteger one = BigInteger.valueOf(1);
		BigInteger number = BigInteger.valueOf(num);
		return factorial(number, one);
	}
	public static BigInteger factorial(BigInteger number, BigInteger one){
		if(number.intValue() == 0)
			return (one);
		else
			return number.multiply(factorial(number.subtract(one), one));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		System.out.println(fact(read.nextInt()).toString());
	}

}
