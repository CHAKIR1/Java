import java.util.Scanner;

public class Carre_Cube {

    public static void main(String[] args) {
		int a,b,c=0;
		Scanner sc = new Scanner(System.in);
        System.out.println("taper un nombre");
        a = sc.nextInt();
        b = a * a;
        c = b * a;
        System.out.println("le carre de "+a+" est "+b);
        System.out.println("le cube de "+a+" est "+c);
	}
}