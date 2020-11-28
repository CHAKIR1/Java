import java.util.Scanner;

public class Methode {
    static int n1,n2;
    public static void main(String[] args) {
        lire();
        additionneur(n1, n2);
    }
    public static void additionneur(int n1,int n2){
        int somme;
        somme = n1 + n2;
        System.out.println("la somme entre "+n1+" et "+n2+" est : "+somme);
    }
    public static void lire(){
        //int n3,n4;
        Scanner sc = new Scanner(System.in);
        System.out.println("taper deux nombre ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
    }
    
    
}
