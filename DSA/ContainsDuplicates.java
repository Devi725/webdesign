package dsaPrblm;

import java.util.Arrays;

public class ContainsDuplicates {

	public static void main(String[] args) {
		int arr[] = {1,1,1,3,3,4,3,2,4,2};
		Arrays.sort(arr);
		int flag = 0;
		for(int i = 0; i< arr.length;i++) {
			for(int j = i+1 ; j<arr.length;j++) {
				 if(arr[i]==arr[j]) {
					System.out.println(true);
					flag = 1;
					break;
				}
			}
			if(flag==0) break;
		}
		if(flag == 0)
			System.out.println(false);
	}

}
