package AllPrograms;

public class PalindromeNumInArray {

	public static boolean isPalindrome(int num) {
		int originalNum = num;
		int reverseNum = 0;
		int rem;
		while(num>0) {
			rem = num % 10;
			reverseNum = (reverseNum * 10) + rem;
			num = num/10;
		}
		return originalNum == reverseNum;
	}
	public static void main(String[] args) {
		
		int[] array = {121,454,334,566,787};
		
		for(int num : array) {
			if(isPalindrome(num)) {
				System.out.println(num);
			}
		}
	}
}
