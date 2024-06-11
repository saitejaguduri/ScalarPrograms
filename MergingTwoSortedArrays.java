package AllPrograms;

public class MergingTwoSortedArrays {

	public static int[] merge(int[] a1, int[] a2) {
		
		int n1 = a1.length, n2 = a2.length;
		int[] a3 = new int[n1+n2];
		int i=0,j=0,k=0;
		
		while(i<n1 && j<n2) {
			if(a1[i]<=a2[j]) {
				a3[k++] = a1[i++];	
			}
			else {
				a3[k++]= a2[j++];
			}
		}
		while(i<n1) {
			a3[k++] = a1[i++];
		}
		while(j<n2) {
			a3[k++] = a2[j++];
		}
		return a3;
			
	}
	
	public static void main(String[] args) {
		int[] a1 = {1,3,5};
		int[] a2 = {2,4,6};
	
		int[] merged = merge(a1,a2);
		
		for(int num : merged) {
			System.out.println(num);
		}
	}

}
