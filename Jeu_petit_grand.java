import java.util.Random;
import java.util.Scanner;

public class Jeu_petit_grand {

    public static void main(String[] args) {
        int a,n,i=0;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        a = r.nextInt(100);
        System.out.println("taper un nombre ");
        //n = sc.nextInt();
        do{
            i++;
            n = sc.nextInt();
            if(n>a)
            System.out.println("Votre nombre est plus petit");
            else if(n<a)
            System.out.println("Votre nombre est plus grand");
            else
            System.out.println("Bravo vous avez trouvé le nombre en "+i+" tentatives");
        }while(n!=a);
        
    }
    
}