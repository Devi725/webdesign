package dsaPrblm;

public class BubbleSort {
	
	public static void main(String[] args) {
		int arr[] = {2,5,1,0,8,3};
		int n = arr.length;
		boolean swapped = false;
		for(int i =0;i<n-1;i++) {
			swapped = false;
			for(int j = 0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped == false) break;
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i] + " ");
		}
		
		

	}

}
