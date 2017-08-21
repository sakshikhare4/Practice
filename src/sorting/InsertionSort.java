package sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 4, 8, 9, 1 };
		int i,j,key;
		int size=arr.length;
		for(i=1;i<size;i++) {
			key=arr[i];
			j=i-1;
			while(j>=0 && key<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for(int k=0;k<size;k++) {
			System.out.println(arr[k]);
		}
	}
}
