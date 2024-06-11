package AllPrograms;

public class FactorialNumber {

	public static void main(String[] args) {
		int num =6	 , fact = 1;
		for(int i=1; i<=num; i++) {
			fact = fact*i;		
			//System.out.println("The factorial of "+num+ " is " +fact);
			//if we print here it will show 1 2 6 24 120 all multiplications one by one
		}
		System.out.println("The factorial of "+num+ " is " +fact);
		
		

	}

}
