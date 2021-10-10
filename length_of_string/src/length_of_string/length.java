package length_of_string;

import java.util.Scanner;

public class length {

	public static void main(String[] args) {
		String name;
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println("enter the name: ");
		name = scan.nextLine();
		if(name.length()<4) {
			System.out.println("size of name is short");
			
		}
		
		else {
		
		System.out.println("size of name is long");
		}
		scan.close();

	}

}
