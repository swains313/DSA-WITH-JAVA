package sorting;

import java.util.Arrays;



//**Bubble Sort** is a simple sorting algorithm that repeatedly steps through the list of elements, compares adjacent items, and swaps them if they are in the wrong order. This process is repeated until the list is sorted.
//
//### Key points about Bubble Sort:
//- **Time Complexity:** O(n²) in the worst and average cases, where *n* is the number of elements.
//- **Best Case:** O(n) if the array is already sorted (with an optimized version).
//- **Stable:** It doesn't change the relative order of elements with equal values.
//- **In-place:** It sorts the array without requiring additional space.
//
//### How it works:
//1. Compare the first two elements of the array. If the first element is greater than the second, swap them.
//2. Move to the next pair of adjacent elements and repeat the comparison and swap if necessary.
//3. After one complete pass, the largest element is "bubbled" to the end.
//4. Repeat the process for the remaining unsorted elements, each time ignoring the last sorted element.
//5. Continue until the array is sorted.
//
//### Example:
//For the array `{3, 1, 4, 2}`, Bubble Sort will work like this:
//- Compare 3 and 1, swap them → `{1, 3, 4, 2}`
//- Compare 3 and 4, no swap → `{1, 3, 4, 2}`
//- Compare 4 and 2, swap them → `{1, 3, 2, 4}`
//- Second pass: `{1, 2, 3, 4}` (array sorted).

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[]= {100,-1,52,3,4,2,6};
		bubbleSort(arr);
		

	}

	private static void bubbleSort(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < (arr.length- 1)-i; j++) {
				int fIndex= j;
				int sIndex=j+1;
				int first = arr[fIndex];
				
				int second = arr[sIndex];
				if(first > second) {
					arr[fIndex] = second;
					arr[sIndex]=first;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
