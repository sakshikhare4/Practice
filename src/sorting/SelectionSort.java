package sorting;

public class SelectionSort {

	static void selectionSort(int[] a, int size) {
		int i, j, min, temp;

		for (i = 0; i < size - 1; i++) {
			min = i;
			for (j = i + 1; j < size; j++) {
				if (a[j] < a[min]) {
					min = j;
				}

			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for(int k=0;k<size;k++) {
			System.out.print(a[k]+ " ");
		}
	}

	public static void main(String[] args) {
		int [] arr= {2,1,4,6,5,9,7,8};
		int size=arr.length;
		selectionSort(arr, size);
		
	}
}
