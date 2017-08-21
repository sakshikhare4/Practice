package pkg1;

import java.util.Arrays;

public class SegregateEvenOdd {

	static void segregateEven(int[] arr, int length) {
		int left = 0, right = length - 1;
		while (left < right) {
			while (arr[left] % 2 == 0 && left < right) {
				left++;
			}
			while (arr[right] % 2 == 1 && left < right) {
				right--;
			}
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;

			}
		}

	}
	public static void main(String[] args) {
		int [] arr=new int [] {10,2,45,3,6,18,9,27};
		segregateEven(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
}
