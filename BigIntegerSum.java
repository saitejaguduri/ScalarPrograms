package AllPrograms;

import java.math.BigInteger;

public class BigIntegerSum {

	public static void main(String[] args) {
		String s1 = "345678765434567865";
		String s2 = "4533457878990875";
		
		BigInteger a = new BigInteger(s1);
		BigInteger b = new BigInteger(s2);
		
		System.out.println(a.add(b));
	}

}
