package sorting;

import java.util.Arrays;



//**Selection Sort** is a simple sorting algorithm that works by repeatedly selecting the smallest (or largest) element from the unsorted portion of the array and swapping it with the first unsorted element. This process is repeated until the entire array is sorted.
//
//### How it works:
//1. Start with the first element as the minimum.
//2. Scan the remaining unsorted elements to find the smallest element.
//3. Swap the smallest element found with the first unsorted element.
//4. Move the boundary between the sorted and unsorted parts of the array one element to the right.
//5. Repeat the process until all elements are sorted.
//
//### Example:
//For the array `{64, 25, 12, 22, 11}`, Selection Sort will work like this:
//
//1. Find the smallest element (`11`), swap it with the first element → `{11, 25, 12, 22, 64}`
//2. Find the smallest element from the remaining unsorted portion (`12`), swap it with the second element → `{11, 12, 25, 22, 64}`
//3. Find the smallest element from the remaining unsorted portion (`22`), swap it with the third element → `{11, 12, 22, 25, 64}`
//4. Finally, the array is sorted as `{11, 12, 22, 25, 64}`.
//
//### Time Complexity:
//- **Best, Average, and Worst Case:** O(n²), where *n* is the number of elements.
//
//### Key Points:
//- **In-place:** No extra space is required.
//- **Unstable:** It may change the relative order of equal elements.
//- **Simple:** Easy to implement but not efficient for large datasets compared to algorithms like Merge Sort or Quick Sort.

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
