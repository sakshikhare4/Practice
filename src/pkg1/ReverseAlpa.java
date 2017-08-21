package pkg1;

import java.util.Arrays;

public class ReverseAlpa {

	static boolean isAlpha(char arr) {
		return ((arr >= 'A' && arr <= 'Z') || (arr >= 'a' && arr <= 'z'));
	}

	static void reverse(char[] arr, int n) {
		int left = 0, right = n - 1;
		while (left < right) {
			if (!isAlpha(arr[left])) {
				left++;
			} else if (!isAlpha(arr[right])) {
				right--;
			} else {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;

			}
		}
	}
	public static void main(String[] args) {
		String str="abb!@*nji&";
		char [] ch=str.toCharArray();
		int size=ch.length;
		reverse(ch, size);
		System.out.println(Arrays.toString(ch));
	}
}
