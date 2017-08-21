package pkg1;

public class MinMaxArray {

	static void minMax(int [] arr) {
	//	int min=arr[0];
	//	int max=arr[0];
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int size=arr.length;
		for(int i=0;i<size;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			else if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Minimum "+min);
		System.out.println("Maximum "+max);
	}
	
	
	public static void main(String[] args) {
		int [] arr=new int [] {1,2,3,100,-1,4,5,6};
		minMax(arr);
	}
}
