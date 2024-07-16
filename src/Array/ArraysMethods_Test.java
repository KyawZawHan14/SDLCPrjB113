package Array;

import java.util.Arrays;

public class ArraysMethods_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int A[] = {11,20,30,44,50};
		 System.out.println(Arrays.binarySearch(A, 30));// binarysearch method
		 int B[] = Arrays.copyOf(A, 6);
		 System.out.println();
		 B[5] = 1;
		 System.out.println("Before sorting :");
		 System.out.println(Arrays.toString(B));
		 Arrays.sort(B);
		 System.out.println("After sorting :");
		 System.out.println(Arrays.toString(B));
		 System.out.println(Arrays.equals(A, B));
		 Arrays.fill(B, 1, 3, 5);
		 System.out.println(Arrays.toString(B));
		 
 	}

}
