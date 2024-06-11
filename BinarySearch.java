package AllPrograms;

public class BinarySearch {

	public static int binarySearch(int[] array, int x,int high, int low) {
		
		while(low<=high) {
			int mid = low + (high - low)/2;
			
			if(array[mid] == x ) {
				return mid;
				
			}
			if(array[mid]<x) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
       
		//BinarySearch obj = new BinarySearch();
		
		int[] array = {1,2,3,4,5};
		int x = 2;
		int n = array.length;
        int result =  BinarySearch.binarySearch(array, x,n-1, 0);
       
        if(result == -1) {
        System.out.println("Element not found");
        }
        else {
        	 System.out.println("The index of " +x+ " is : " +result);
        }
        
	}

}
