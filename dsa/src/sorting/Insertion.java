package sorting;

import java.util.Arrays;


//**Insertion Sort** is a simple sorting algorithm that builds the final sorted array one element at a time. It works by taking each element from the unsorted portion of the array and inserting it into the correct position within the sorted portion.
//
//### How it works:
//1. Start with the second element (the first element is considered sorted).
//2. Compare the current element with the elements in the sorted portion (to its left).
//3. Shift all larger elements one position to the right to make space for the current element.
//4. Insert the current element into its correct position.
//5. Repeat the process for the next element until the entire array is sorted.
//
//### Example:
//For the array `{5, 2, 9, 1, 5, 6}`, Insertion Sort will work like this:
//
//- Start with `2`, compare it with `5`, and swap → `{2, 5, 9, 1, 5, 6}`
//- Next, `9` is already in the correct position → `{2, 5, 9, 1, 5, 6}`
//- For `1`, shift `9`, `5`, and `2` → `{1, 2, 5, 9, 5, 6}`
//- Continue inserting `5` and `6` into their correct positions → `{1, 2, 5, 5, 6, 9}`
//
//### Time Complexity:
//- **Best Case:** O(n) (if the array is already sorted).
//- **Average and Worst Case:** O(n²), where *n* is the number of elements.
//
//### Key Points:
//- **In-place:** No extra space required.
//- **Stable:** Doesn't change the relative order of equal elements.

public class Insertion {

	public static void main(String[] args) {
		
		int arr[]= {2,1,22,3,5,6,1};
		insertionSort(arr);

	}

	private static void insertionSort(int[] arr) {
		
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while( j >= 0 && arr[j] >= key) {
				System.out.println(j);
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
