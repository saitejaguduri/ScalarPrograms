package AllPrograms;

public class FindTargetIn2DArray {

	public static boolean findTarget(int[][] arr, int target) {
		
		int i = 0, j =arr[0].length-1;
		while(i< arr.length && j>=0) {
			if(target == arr[i][j]) {
				return true;
			}
			else if(target < arr[i][j]){
				j--;
			}
			else {
				i++;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		int[][] arr = {{1,4,7,11},{2,5,8,12},{9,12,34,54}};
		int target = 45;
		boolean result = findTarget(arr,target);
		System.out.println(result);
	}

}
