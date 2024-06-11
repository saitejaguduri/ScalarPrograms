package AllPrograms;

import java.util.Map;

public class PalindromeCheckWithoutTemp {

	public static void main(String[] args) {
		String s = "abcba";
		boolean isPalindrome = true;
	    int n = s.length();
		for(int i=0; i<n/2;i++) {
			if(s.charAt(i)!=s.charAt(n-1-i)) {
				isPalindrome  = false;
				break;
			}
		}
		if(isPalindrome) {
			System.out.println(s+ " is a palindrome");
		}
		else {
			System.out.println(s+ " is not a palindrome ");
		}

	}

}
