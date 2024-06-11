package AllPrograms;

public class ClimbingStairs {

	public static int climbStair(int n) {
		if(n<=1) {
			return 1;
		}
		
		int[] step = new int[n+1];  //n+1 bcz we included 0 step as well that indicates that we need to go from 0 to n 
		step[0] = 1;
		step[1] = 1;
		for(int i = 2; i<=n;i++){
			step[i] = step[i-1]+step[i-2];
			
		}
		return step[n] ;
	}
	
	public static void main(String[] args) {
		int n = 10;
		System.out.println(climbStair(n));
	}

}
