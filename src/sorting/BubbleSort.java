package sorting;

public class BubbleSort {

	static void bubbleSorting(int[] arr, int size) {
		int i, j, temp;
		boolean flag = false;
		for (i = 0; i < size; i++) {
			for (j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}

			}
			if (flag != true) {
				break;
			}

		}
		for (int k = 0; k < size; k++) {
			System.out.println(arr[k]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a = { 2, 4, 1, 5, 7, 3, 9, 10 };
		bubbleSorting(a, a.length);
	}
}
