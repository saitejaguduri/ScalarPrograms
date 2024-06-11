package AllPrograms;

public class FindHeavyBallAmong8 {

	
	public static int heavyBall(int[] balls) {
		
		int merge1 = balls[0]+balls[1]+balls[2];
		int merge2 = balls[3]+balls[4]+balls[5];
		
		if(merge1 == merge2) {
			return balls[6]>balls[7] ? balls[6] : balls[7];
		}
		else {
			if(merge1>merge2) {
			   if(balls[0] == balls[1]) {
				return balls[2];
			   }
			   else {
				   return balls[0]>balls[1]? balls[0]:balls[1];
			   }
			}
			else {
				if(balls[3]==balls[4]) {
					return balls[5];
				}
				else {
					return balls[3]>balls[4]? balls[3] : balls[4];
				}
			}
		}		
	}
	public static void main(String[] args) {
		int[] balls = {1,1,1,2,1,1,1,1};
		
		int heavyball = heavyBall(balls);
		System.out.println("Heaviest ball is : "+heavyball);
	}
	

}
