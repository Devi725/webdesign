package dsaPrblm;

public class SortASentence {

	public static void main(String[] args) {
		String word = "sentence4 a3 is2 This1";
		String arr[] = new String[10];
		for(int i = 0;i<word.length();i++) {
			char newChar = word.charAt(i);
			if(newChar>=0&&newChar<=9) {
				arr[i] = String.valueOf(newChar);
				i++;
			}
		}
		for(int i =0;i<10;i++) {
			System.out.print(arr[i]);
		}
		

	}

}
