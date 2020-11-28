import java.util.Scanner;
public class Operation {
    public static void main(String[] args) {
        int a,b,s,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("taper le nombre a");
        a = sc.nextInt();
        System.out.println("taper le nombre b");
        b = sc.nextInt();
        s = a + b;
        System.out.println("la somme de deux nombre "+a+" et "+b+" est "+s);
        s = a - b;
        System.out.println("la différence entre "+a+" et "+b+" est "+s);
        s = a * b;
        System.out.println("le produit de deux nombre "+a+" et "+b+" est "+s);
        s = a / b;
        System.out.println("le quotient de deux nombre "+a+" et "+b+" est "+s);
        r = a%b;
        System.out.println("le reste de la division entre "+a+" et "+b+" est "+r);
        
       
    }
    
}