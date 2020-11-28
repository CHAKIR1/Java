import java.util.Scanner;

public class Susrcharge {
    static int n1,n2,n5;
    static float n3,n4;
    public static void main(String[] args) {
        lire1(); 
        int x = additionneur(n1, n2);
        lire2(); 
        double y = additionneur(n3, n4);
        lire3(); 
        int z = additionneur(n1, n2,n5);
        print(x,y,z);
        
        
    }
    public static  void lire1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("taper deux nombre entier");
        n1= sc.nextInt();
        n2= sc.nextInt();
    }
    public static  void lire2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("taper deux nombre réele");
        n3= sc.nextFloat();
        n4= sc.nextFloat();
    }
    public static  void lire3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("taper trois nombre entier");
        n1= sc.nextInt();
        n2= sc.nextInt();
        n5= sc.nextInt();
    }
    public static int additionneur(int n1,int n2){
        int somme;
        somme = n1+n2;
        return somme;
    }
    public static float additionneur(float n1,float n2){
        float somme;
        somme = n1+n2;
        return somme;
    }
    public static int additionneur(int n1,int n2,int n5){
        int somme;
        somme = n1+n2;
        return somme;
    }
    public static void print(int x,double y,int z){
        System.out.println("la somme de deux nombre entier  est :"+x);
        System.out.println("la somme de deux nombre réele  est :"+y);
        System.out.println("la somme de trois nombre entier  est :"+z);
    }
    
}