package AllPrograms;

import java.util.Arrays;

public class SumOfLargest3Numbers {

	
	public static void main(String[] args) {
		int[] array = {10,2,4,3,6,9};
		for(int i = 0;i<array.length;i++) {
			for(int j=0; j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] =array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted array is");
		for(int sort : array) {
			System.out.print(sort+ " ");
		}
		System.out.println();
		int sum = 0;
		int n = array.length-1;
		System.out.print("Sum of largest three numbers are : ");
		if(n>=3) {
			sum +=  array[n-2]+array[n-1]+array[n];
			System.out.println(sum);
		}
		

	}

}
