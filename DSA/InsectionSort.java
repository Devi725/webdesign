package dsaPrblm;

public class InsectionSort {

	public static void main(String[] args) {
		int arr[] = {4,13,6,12,50,15};
		int n = arr.length;
		for(int i = 1; i<n; i++) {
			int temp = arr[i];
			int j = i - 1;
			while(j>= 0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j = j -1;	
			}
			arr[j + 1] = temp;//
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
