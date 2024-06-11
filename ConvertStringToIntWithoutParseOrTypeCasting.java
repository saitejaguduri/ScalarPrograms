package AllPrograms;

public class ConvertStringToIntWithoutParseOrTypeCasting {

	public static void main(String[] args) {
		String s = "234456";
		System.out.println(s);
		int converted = stringToInt(s);
		System.out.println("Converted number is : " +converted);
		

	}
	public static int stringToInt(String s) {
		
		int result = 0;
		
		for(int i =0; i<s.length();i++) {
			int value = s.charAt(i)-'0';   //this will convert character to int
			result = (result*10) +value;
		}
		return result;
	}

}
