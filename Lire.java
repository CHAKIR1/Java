import java.util.Scanner;
public class Lire {
    public static void main(String[] args) {
        String nom,prenom;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nom SVP");
        nom = sc.nextLine();
        System.out.println("Entrez un prenom SVP");
        prenom = sc.nextLine();
        System.out.println("Votre nom est : "+nom);
        System.out.println("Votre prenom est : "+prenom);
    }
}
