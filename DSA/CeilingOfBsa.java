package dsaPrblm;

public class CeilingOfBsa {
	 public static int ceiling(int array[] , int target) {
		 int low = 0; 
		 int high = array.length-1; 
		 while(low<=high) {
			 int mid = (low + high)/2; 
			 /*if((target+1)== array[mid]) { 
				 return array[mid]; */
				 if(target < array[mid]) { 
					 high = mid - 1;
				 }else { 
					 low = mid +1;
				 } 
		 		} 
		 		return array[low];
		 		} 
	 public static int flooring(int array[] , int target) {
		 int low = 0; 
		 int high = array.length-1; 
		 while(low<=high) {
			 int mid = (low + high)/2; 
			 /*if((target+1)== array[mid]) { 
				 return array[mid]; */
				 if(target < array[mid]) { 
					 high = mid - 1;
				 }else { 
					 low = mid +1;
				 } 
		 		} 
		 		return array[high];
		 		} 

	public static void main(String[] args) {
		int array[] = {2,3,5,6,9,11,13,15};
		int target = 10;
		int ceiling = ceiling(array, target);
		int flooring = flooring(array, target);
		System.out.println("ceiling of target "+ceiling + " flooring of target " +flooring);
	}

}
