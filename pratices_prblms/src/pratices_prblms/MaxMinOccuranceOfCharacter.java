package pratices_prblms;

public class MaxMinOccuranceOfCharacter {

	public static void main(String[] args) {
		String str = "Tit for tat is a proverb";
		int freq[] = new int[str.length()];
		char minChar = str.charAt(0), maxChar = str.charAt(0);
		int i=0, j, max, min;
		char string[] = str.toCharArray();
		int n = string.length-1;
		for(i = 0; i<=n;i++) {
			freq[i] = 1;
			for(j=i+1;i<=n;j++) {
				 char newChar = str.charAt(i);
				 	if(newChar >= 'a' && newChar <= 'z') {
				 		if(string[i] == string[j]  && string[i] != '0') {
				 			freq[i]++;
				 			string[j]='0';
				 		}
				}
			}
		}
		min = max = freq[0];
		for(i=0;i<=freq.length-1;i++) {
			if(min>freq[i] && freq[i]!='0') {
				min = freq[i];
				minChar = string[i];
			}
			if(max<freq[i]) {
				max=freq[i];
				maxChar = string[i];
			}
		}
		System.out.println("maximum occurring character: "+ maxChar + " minimum occuring character: " + minChar);
	}

}
