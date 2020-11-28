import java.util.Scanner;

public class Puissance {

    public static void main(String[] args) {
        
        int n,s=1,p;
        Scanner sc = new Scanner(System.in);
        System.out.println("taper un nombre ");
        n = sc.nextInt();
        System.out.println("taper la puissance de ce nombre") ;
        p = sc.nextInt();
        for(int i=0;i<p;i++){
            s = s * n;
            //i++;
        }
        System.out.println(n+"^"+p+" = "+s);
    }
    
}