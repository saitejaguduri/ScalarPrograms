package AllPrograms;

public class FindTwoSum {

	public static void main(String[] args) {
	
		int[] array = {8,7,5,1,8};
	    for(int i = 0; i<array.length;i++) {
	    	for(int j=i+1;j<array.length;j++) {
	    		if(array[i]+array[j]==9) {
	    			System.out.println(i+ " " +j);
	    		}
	    		
	    	}
	    }
	 
	}

}
