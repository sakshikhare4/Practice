package pkg1;

public class RotateArray {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,6};
		int size=arr.length;
		int z=2;
		while((z-1)>=0) {
			z--;
		}
		for(int i=0;i<size-2;i++) {
			arr[i]=arr[i+1];
		}
		for(int k=0;k<size-1;k++) {
			System.out.println(arr[k]);
		}
		
	}
}
