package dsaPrblm;

public class MajorityElement {

	public static void main(String[] args) {
		//int arr[] = {3,2,3};
		int arr[] = {2,2,1,1,1,2,2};
		int n = arr.length;
		for(int i = 1; i<n; i++) {
			int temp = arr[i];
			int j = i - 1;
			while(j>= 0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j = j -1;	
			}
			arr[j + 1] = temp;
		}
		System.out.println(arr[n-1]);
	}

}
