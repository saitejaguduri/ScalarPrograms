package AllPrograms;

public class NumeroNameTransformation {

	
	static int reducedCount = 0;
	public static String numero(String s) {
		
		if(s == null || s.length()<=1) {
			return s;
		}
		
		int n = s.length();
		char firstChar = s.charAt(0);
		char lastChar = s.charAt(n-1);
		int distBtwFirstnLast = n-2-reducedCount;
		
		if(distBtwFirstnLast < 0) {
			distBtwFirstnLast = 0;
		}
		
		String result = firstChar + String.valueOf(distBtwFirstnLast) + lastChar;
		
		reducedCount++;
		
		return result;	
	}
	
	public static void main(String[] args) {
		String s = "India";
       System.out.println(numero(s));
       System.out.println(numero(s));
       System.out.println(numero(s));
       System.out.println(numero(s));
       System.out.println(numero(s));
	}

}


