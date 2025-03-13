package sorting;

import java.util.Arrays;


//Merge Sort is a classic divide-and-conquer algorithm for sorting an array or list. It works by recursively dividing the array into two halves, sorting each half, and then merging the sorted halves back together in the correct order.
//
//Here’s a high-level breakdown of how Merge Sort works:
//
//Steps:
//Divide: If the list has more than one element, split the list into two halves.
//Conquer: Recursively sort each half.
//Combine: Merge the two sorted halves back together to produce the final sorted list.
//Key Concepts:
//Merging: The merging process combines two sorted lists into one sorted list. This is done by repeatedly comparing the first elements of both lists and adding the smaller element to the result, continuing until all elements have been processed.
//Time Complexity:
//Best, Average, and Worst Case: O(n log n), where n is the number of elements in the list. The n comes from the merging process (which takes linear time), and the log n comes from the recursive splitting of the list into halves.
//Space Complexity:
//O(n), because you need extra space to store the left and right halves of the list during the merge process.


public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {111,3,6,2,4,9, 1};
		int low=0;
		int high = arr.length-1;
		mergedSort(arr,low, high);
		System.out.println(Arrays.toString(arr));

	}

	private static void mergedSort(int[] arr, int low, int high) {
		
		if(low<high) {
			int mid=(low+high)/2;
			mergedSort(arr, low, mid);
			mergedSort(arr, mid+1, high);
			
			merge(arr, low, mid, high);
			
			
		}
		
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		// TODO Auto-generated method stub
//		System.out.println("Arrays "+Arrays.toString(arr));
//		System.out.println("Low "+low +" Mid "+ mid +" high "+ high);
		int n1= mid -low +1;
		int n2= high-mid;
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];
		for(int x =0; x<n1;x++) {
			leftArray[x]=arr[low+x];
		}
		for(int x =0; x<n2;x++) {
			rightArray[x]=arr[mid+1+x];
		}
		int i=0,j=0,k=low;
		while(i< n1 && j < n2) {
			if(leftArray[i] <= rightArray[j]) {
				arr[k]= leftArray[i];
				i++;
			} else {
				arr[k]= rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k]= leftArray[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]= rightArray[j];
			j++;
			k++;
		}
		
	}

}
