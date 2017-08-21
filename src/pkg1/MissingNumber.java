package pkg1;

public class MissingNumber {

	static int missing(int[] arr, int n) {
		int total_sum = (n * (n + 1)) / 2;
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			total_sum-=arr[i];
		}
		return total_sum;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 9 };
		System.out.println(missing(arr, 9));
	}
}
