package pkg1;

import java.util.Arrays;

public class Segreagate0n1 {

	static void segregate(int[] arr, int size) {
		int left = 0, right = size - 1;
		while (left < right) {
			while (arr[left] == 0 && left < right) {
				left++;
			}
			while (arr[right] == 1 && left < right) {
				right--;
			}
			if (left < right) {
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
	}

	public static void main(String[] args) {
		int [] a = new int[] {1,1,1,1,0,0,1,0,0,0,1,1};
		segregate(a, a.length);
		
		System.out.println(Arrays.toString(a));
	}
}