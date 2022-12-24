package in.praveenit;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) { 
		int arr[]= {14,7,4,9,23,45,3,5};
		System.out.print("Before Sorting::");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.print("After Sorting::");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
