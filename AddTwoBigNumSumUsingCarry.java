package AllPrograms;

public class AddTwoBigNumSumUsingCarry {

	public static String sumOfTwoNumbers(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		if( s1.length()==0 || s2.length()==0) {
			return "Null strings are not accepted";
		}
		if(s1.length()<s2.length()) {
			String temp = s1;
			s1 = s2;
			s2 = temp;
		}
		
		int n1 = s1.length()-1, n2 = s2.length()-1;  //we need to declare and initialize n1 and n2 after if block bcz the lengths will change if we swap s1 and s2
		
		while(n1>=0 || n2>=0) {
             int a = (n1>=0) ? s1.charAt(n1)-'0' : 0; //this will convert char to int
             int b = (n2>=0) ? s2.charAt(n2)-'0' : 0;
             int sum = a+b+carry;
             sb.insert(0, sum%10);
             carry = sum/10;
             
             n1--;
             n2--;    
		}
		if(carry>0) {
			sb.insert(0, carry);
		}
		return sb.toString();
		

	}
	public static void main(String[] args) {
		String s1 = "54";
		String s2 = "9685342";
		String sum = sumOfTwoNumbers(s1,s2);
		System.out.println("Sum is : " +sum);
		
	}

}
