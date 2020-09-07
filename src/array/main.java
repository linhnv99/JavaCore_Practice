package array;

import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		/*
		 * 1.Bubble sort. 2.Quick sort. 3.Simple selection sort. 4.Heap sort. 5.Simple
		 * insertion sort. 6.Shell sort. 7.Merge sort. 8.Radix sort.
		 */
		int[] arr = { 18, 5, 10, 8, 2, 15, 12, 4, 5 };
		bubleSort(arr);

	}

	public static void bubleSort(int[] arr) {
		int tmp = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1 -i ; j++) {
				if(arr[j] > arr[j+1]) {
					tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("Bubble Sort ==> "+Arrays.toString(arr));
	}
}
