import java.util.Scanner;

public class String_Nom {

    public static void main(String[] args) {
		String nom;
        Scanner sc =new Scanner(System.in);
        System.out.println("taper votre nom");
        nom = sc.nextLine();
        System.out.println("\nBienvenue "+nom);
	}
}