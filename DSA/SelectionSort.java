package dsaPrblm;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {2,3,1,0,5,6,7};
		int n = arr.length;
		for(int i = 0 ;i<n-1;i++) {//i=1
			int min_index = i;//1,2
			for(int j = i+1;j<n;j++) {//j=2,3
				if(arr[j]<arr[min_index])
					min_index = j;
			}
			int temp = arr[min_index];//temp=0
			arr[min_index] = arr[i];//2
			arr[i] = temp;//0
			}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
