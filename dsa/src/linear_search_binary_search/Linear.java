package linear_search_binary_search;


//
//In the context of searching for an element in a sorted array, there are important differences in the speed of each of the methods you've used: linear search and binary search (both iterative and recursive). Let's go through them:
//
//1. Linear Search:
//Time Complexity: O(n)
//How it works: Linear search checks every element of the array sequentially until it finds the target or reaches the end.
//Speed: For a small array, linear search can be quite fast. However, as the size of the array increases, the time taken increases linearly.
//2. Binary Search (Iterative):
//Time Complexity: O(log n)
//How it works: Binary search splits the array into two halves in each step and eliminates one half from further consideration, drastically reducing the number of elements that need to be checked.
//Speed: This is much faster than linear search for large arrays, as it reduces the search space logarithmically. It only requires log(n) comparisons for a sorted array.
//3. Binary Search with Recursion:
//Time Complexity: O(log n) (same as iterative binary search)
//How it works: It works just like the iterative version but uses recursion instead of loops to divide the array.
//Speed: The speed is identical to the iterative binary search since both have the same time complexity. However, recursion can introduce overhead due to the function calls and stack management, which might make it slightly slower for very large arrays compared to the iterative version.
//Which is faster?
//For small arrays: Linear search might perform similarly or even faster in practice since it avoids the overhead of recursion or splitting the array. However, as the array size increases, the efficiency of binary search becomes more noticeable.
//
//For large arrays: Binary search (whether iterative or recursive) will definitely be faster, because its time complexity is logarithmic (O(log n)) compared to the linear search's linear time complexity (O(n)).
//
//Conclusion:
//For smaller arrays: The performance difference between linear search and binary search is minimal.
//For larger arrays: Binary search (either iterative or recursive) is much faster than linear search due to its O(log n) time complexity.


public class Linear {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		int target = 6;
//		int arr[]= new int[100000000];
//		int target = 400;
		
		int result = linearSearch(arr, target);
		if(result!=-1) {			
			System.out.println("Element found at index linear search: " +result);
		} else {
			System.out.println("Element not found linear search: "+ result);
		}
		
		int result1 = binarySearch(arr, target);
		if(result1!=-1) {			
			System.out.println("Element found at index binary search: " +result1);
		} else {
			System.out.println("Element not found binary search: "+ result1);
		}
		
		int result2 = binarySearchWithRecursion(arr, target, 0, arr.length-1);
		if(result2!=-1) {			
			System.out.println("Element found at index binarySearchWithRecursion: " +result2);
		} else {
			System.out.println("Element not found binarySearchWithRecursion: "+ result2);
		}
		

	}

	private static int binarySearchWithRecursion(int[] arr, int target, int start, int end) {
	if(start <= end) {		
		int mid = (start+end)/2;
		if(arr[mid]==target) {
			return mid;
		} else if(arr[mid] > target) {
			return binarySearchWithRecursion(arr, target, start, mid-1);
		} else {
			return binarySearchWithRecursion(arr, target, mid+1, end);
		}
	}
		return -1;
	}

	private static int binarySearch(int[] arr, int target) {
		int step =0;
		if(target > arr[arr.length-1] ) {
			System.out.println("The number of steps loop linear search : "+ step);
			return -1;
		}
		
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = (start+end)/2;
			step++;
			if(arr[mid]==target) {
				System.out.println("The number of steps loop binary search : "+ step);
				return mid;
			} else if(arr[mid]> target) {
				end = mid-1;
			} else {
				start=mid+1;
			}
		}
		
		System.out.println("The number of steps loop binary search : "+ step);
				
		return -1;
	}

	private static int linearSearch(int[] arr, int target) {
		int step =0;
		for (int i = 0; i < arr.length; i++) {
			step++;
			if(arr[i]==target) {
				System.out.println("The number of steps loop linear search : "+ step);
				return i;
			}
		}
		
		System.out.println("The number of steps loop linear search : "+ step);
		return -1;
	}

}
