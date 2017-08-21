package sorting;

public class QuickSort {

	int partition(int [] a,int low,int high) {
		int pivot=a[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(a[j]<pivot) {
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[high];
		a[high]=temp;
		return i+1;
	}
	
	
	void sort(int arr[], int low,int high) {
		if(low<high) {
			int pi=partition(arr, low, high);
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
	}
	
	void printSortedArray(int [] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int [] arr= {10,7,8,9,1,5};
		int size=arr.length;
		QuickSort obj=new QuickSort();
		obj.partition(arr, 0, size-1);
		obj.printSortedArray(arr);
		
	}
}
