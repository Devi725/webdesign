package pratices_prblms;

public class SeperateEvenOdd {

	public static void main(String[] args) {
		int[] arr = {1,3,2,5,9,6,4,7};
		int evenSize = 0, oddSize=0;
		int arrNewSize = evenSize + oddSize;
		int[] arrNew = new int[arrNewSize];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2==0)
				evenSize++;//https://bit.ly/100spartans
			else
				oddSize++;
		}
		int[] evenArr = new int[evenSize];
		int[] oddArr = new int[oddSize];
		for(int i=0,j=0,k=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				evenArr[j++] = arr[i];
			else
				oddArr[k++] = arr[i];
		}
		for(int i=0, j=0;i<evenSize;i++) {
			arrNew[i]=evenArr[j];
		}
		for(int i=0,k=0;i<oddSize;i++) {
			arrNew[evenSize+i]=oddArr[k];
		}
		for(int i=0;i<arrNewSize;i++) {
        	System.out.println(arrNew[i]);
        }
	}

}
