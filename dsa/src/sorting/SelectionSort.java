package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[]= {3,4,1,2,4556,77};
		selectionSort(arr);
		

	}

	private static void selectionSort(int[] arr) {
		int minIndex = -1;
	
		
		for (int i = 0; i <= arr.length-1; i++) {
			 minIndex=i;
	
			for (int j = i+1; j < arr.length; j++) {
				if(arr[minIndex] >= arr[j]) {
					minIndex=j;
		
				}
			}
			
			int temp= arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;

		}
		
		System.out.println(Arrays.toString(arr));
	}

}
