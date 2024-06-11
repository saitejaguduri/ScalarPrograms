package AllPrograms;

public class TrappingRainWater {

	public static int trap(int[] arr) {
		
		int left = 0, right = arr.length-1;
		int leftMax = 0, rightMax = 0;
		int totalRain = 0;
//		
//		if(arr.length == 0 || arr == null) {
//			return 0;
//		}
		
		while(left<=right) {
			if(leftMax<rightMax) {
				if(arr[left]>leftMax) {
					leftMax = arr[left];
				}
				else {
					totalRain += leftMax-arr[left];
					left++;
				}
			}
			else {
				if(arr[right]>rightMax) {
					rightMax = arr[right];
				}
				else {
					totalRain += rightMax-arr[right];
					right--;
				}
			}
			
		}
		return totalRain;
		
	}
	public static void main(String[] args) {
		
		int[] arr = {4,1,0,2,1,0,4,3,2,1,2,1};
        int result = trap(arr);
        System.out.println("Total wate trapped : " +result);
	}

}
