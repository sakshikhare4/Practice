package pkg1;

public class DutchProblem {

	public static void sortArray(int[] arr, int size) {
		int start = 0, mid = 0;
		int pivot = 1;
		int temp;

		while (mid <= size) {
			if (arr[mid] < pivot) {
				temp = arr[start];
				arr[start] = arr[mid];
				arr[mid] = temp;
				++start;
				++mid;
			} else if (arr[mid] > pivot) {
				temp = arr[size];
				arr[size] = arr[mid];
				arr[mid] = temp;
				--size;
			} else {
				++mid;
			}

		}
	}

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 0, 0, 0, 1, 1, 1, 2, 2, 0 };
		int size = a.length;
		sortArray(a, size - 1);
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
