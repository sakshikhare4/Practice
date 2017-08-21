package pkg1;

public class SortZero {

	public static void main(String[] args) {

		int[] a = { 0, 0, 1, 1, 2, 0, 0, 2, 2 };
		int count_zero = 0;
		int count_one = 0;
		int count_two = 0;

		int size = a.length;
		for (int i = 0; i < size; i++) {
			if (a[i] == 0) {
				count_zero++;

			} else if (a[i] == 1) {
				count_one++;
			} else if (a[i] == 2) {
				count_two++;
			}
		}
		int z=0;
		while(count_zero!=0) {
			a[z]=0;
			count_zero--;
			z++;
		}
		while(count_one!=0) {
			a[z]=1;
			count_one--;
			z++;
			
		}
		while(count_two!=0) {
			a[z]=2;
			count_two--;
			z++;
		}
		for(int i=0;i<size;i++) {
			System.out.print(a[i]);
		}
	}
}
