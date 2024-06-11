package AllPrograms;

public class FactorialNumberUsingRecursion {

	public static int factorial(int num) {
		if(num ==0|| num==1) {
			return 1;
		}
		else {
			return num * factorial(num-1);
		}	
	}
	
	public static void main(String[] args) {
		int num = 5;
        System.out.println(factorial(num));
	}

}
