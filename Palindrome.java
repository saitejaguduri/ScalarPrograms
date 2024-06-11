package AllPrograms;

public class Palindrome {

	public static void main(String[] args) {
		int num = 121, temp, sum = 0;
		int rem;
		temp = num;
		while(num>0) {
			rem = num%10;
			sum = (sum*10)+rem;	
			num = num/10;
		}
       if(temp == sum){
    	   System.out.println("It is a palidrome number");
       }
       else {
    	   System.out.println("It is not a palindrome number");
       }
	}

}
