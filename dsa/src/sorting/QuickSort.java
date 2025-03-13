package sorting;

import java.util.Arrays;

//
//Quick Sort is a highly efficient sorting algorithm and is based on the Divide and Conquer strategy. It works by selecting a pivot element from the array and partitioning the other elements into two sub-arrays, according to whether they are smaller or greater than the pivot. The sub-arrays are then sorted recursively.
//
//Steps of Quick Sort:
//Choose a pivot element from the array. There are various strategies to pick the pivot:
//
//Pick the first element.
//Pick the last element.
//Pick the middle element.
//Pick a random element (for better performance in practice).
//Partition the array around the pivot:
//
//Rearrange the array such that elements smaller than the pivot go to the left and elements greater than the pivot go to the right.
//Recursively sort the sub-arrays (elements on the left of the pivot and elements on the right of the pivot).
//
//Base case: The recursion ends when the sub-array has one or zero elements, meaning the array is sorted.
//
//Time Complexity:
//Best and Average Case: O(n log n), where n is the number of elements in the array.
//Worst Case: O(n²), which happens when the pivot is always the smallest or largest element (for example, in a sorted array or when the pivot is not well chosen).
//However, Quick Sort is often faster than Merge Sort in practice due to lower overheads, and its worst-case can be avoided with good pivot selection techniques (e.g., random pivot or median-of-three).
//
//Space Complexity:
//O(log n) for the recursion stack in the average case.
//O(n) in the worst case (when recursion depth becomes O(n))


//[5, 3, 6, 1, 4, 2]
//        |
//    Pivot 2
//        |
//----------------------------------
//|                                |
//[1] (sorted)                  [6, 5, 4, 3]
//                     |
//                  Pivot 3
//                     |
//   ----------------------------
//   |                          |
//[5, 4]                    [6] (sorted)
//   |
//Pivot 4
//   |
//-------------------
//|                 |
//[5] (sorted)        [] (empty)


public class QuickSort {

	public static void main(String[] args) {
		
		int arr[]= {5,3,6,1,4,2};
		
		int low=0;
		int high=arr.length-1;
		quickSort(arr, low, high);
		System.out.println(Arrays.toString(arr));

	}

	private static void quickSort(int[] arr, int low, int high) {
//		System.out.println(Arrays.toString(arr));
		for(int i =low; i<high;i++) {
			if(low<high) {
				int pivot= partition(arr, low, high);
				System.out.println("PIVOT "+ pivot);
				quickSort(arr, pivot+1, high);
				quickSort(arr, low, pivot-1);
			}
			
		}
		
		
		
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		
		for(int j = low; j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j]=temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1]= arr[high];
		arr[high]=temp;
		return i+1;
	}

}
