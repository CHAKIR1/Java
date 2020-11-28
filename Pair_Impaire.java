import java.util.Scanner;

public class Pair_Impaire {

    public static void main(String[] args) {
		int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre entier");
        x = sc.nextInt();
        if(x%2==0){
            System.out.println("le nombre x = "+x+" est paire");
        }
        else{
            System.out.println("le nombre x = "+x+" est impaire");
        }
	}
}