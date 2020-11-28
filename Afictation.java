import java.util.Scanner;

public class Afictation {

    public static void main(String[] args) {
		int a,b,c= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("taper le nombre a");
        a = sc.nextInt();
        System.out.println("taper le nombre b");
        b = sc.nextInt();
        System.out.println("les nombre avant permutation est :");
        System.out.println("a = "+a+"\nb = "+b);
        System.out.println("les nombre après permutation est :");
        c = a;
        a = b;
        b = c;
        System.out.println("a = "+a+"\nb = "+b);
	}
}