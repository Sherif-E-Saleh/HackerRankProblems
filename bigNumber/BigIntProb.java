package bigNumber;
import java.util.*;
import java.math.BigInteger;

public class BigIntProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		BigInteger i = new BigInteger(read.nextLine());
		BigInteger j = new BigInteger(read.nextLine());
		
		BigInteger sum = i.add(j);
		System.out.println(sum);
		BigInteger mul = i.multiply(j);
		System.out.println(mul);

	}

}
