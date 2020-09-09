package array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		/*
		 * 1.Bubble sort. 2.Quick sort. 3.Simple selection sort.
		 */
		int[] a = { 6, 15, 10, 8, 4, 9, 1 };
//		bubleSort(a);
//		quickSortMiddle(a, 0, a.length - 1);
//		quickSortFirst(a, 0, a.length - 1);
		selectionSort(a);
	}

//	1.Bubble Sort
	private static void bubleSort(int[] a) {
		int tmp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					tmp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = tmp;
				}
			}
		}
		System.out.println("Bubble Sort ==> " + Arrays.toString(a));
	}

//	2.Quick Sort
	private static void quickSortMiddle(int[] a, int left, int right) {
		if (left < right) {
			int i = left;
			int j = right;
			int k = (left + right) / 2;
			int pivot = a[k];
			while(i <= j) {
				while(a[i] < pivot)
					i++;
				while(a[j] > pivot)
					j--;
				if(i <= j) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
					i++;
					j--;
				}
			}
			quickSortMiddle(a, left, j);
			quickSortMiddle(a, i, right);
		}
		System.out.println(Arrays.toString(a));
	}

	private static int partition(int[] a, int left, int right) {
		int pivot = a[left];
		int i = left;
		int j = right;
		while (i < j) {
			while (i < j && a[j] >= pivot) {
				j--;
			}
			a[i] = a[j];
			while (i < j && a[i] <= pivot) {
				i++;
			}
			a[j] = a[i];
		}
		a[i] = pivot;
		return i;
	}

	private static void quickSortFirst(int[] a, int left, int right) {
		if (left < right) {
			int pivot = partition(a, left, right);
			System.out.println(pivot);
			quickSortFirst(a, left, pivot - 1);
			quickSortFirst(a, pivot + 1, right);
		}
		System.out.println(Arrays.toString(a));
	}
//	3.Simple selection sort
	private static void selectionSort(int[] a) {
		for(int i = 0; i < a.length; i++) {
			int pos = i;
			int min = a[pos];
			for(int j = i + 1; j < a.length; j++) {
				if(a[j] < min) {
					min = a[j];
					pos = j;
				}
			}
			a[pos] = a[i];
			a[i] = min;
		}
		System.out.println("Selection Sort => "+ Arrays.toString(a));
	}
}
