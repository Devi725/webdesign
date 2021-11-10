package dsaPrblm;

import java.util.ArrayList;

public class ArrayIntoArrayList {

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,9,9,5,6,7,7,8,14,9,7,6};
		ArrayList<Integer> arrList = new ArrayList<>();
		for(int i = 0 ; i<arr.length ; i++) {
			if(!arrList.contains(arr[i])) {
				arrList.add(arr[i]);
			}
		}
		for(Integer val: arrList) {
			System.out.println(val);
		}
	}

}
