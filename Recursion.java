package dsaPrblm;

public class Recursion {
	static void bck_print(int n) {
		if(n==0) return;
		System.out.print(n+",");
		bck_print(n-1);
		
	}
	static void frd_print(int n) {
				if(n==0) return;
				frd_print(n-1);
				
				System.out.print(n+",");
	}

	public static void main(String[] args) {
		bck_print(5);
        frd_print(5);
	}

}
