//____________________________________________________________chakir el ouafi_________________________________________________________________________________________________________________________

import java.util.Scanner;

public class factoriel3 {
	
	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		int d=c.nextInt();
		factoriel3.fact(d);
	}
	
	
	static void fact(int d) {
		int f=1;	
		for (int i=1;i<=d;i++) {
			f=f*i;
		}
		System.out.print(" fact est "+f);
	}

}
