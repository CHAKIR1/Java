//package factoriel;

import java.util.Scanner;

public class Factoriel {

    public static void main(String[] args) {
        int n,a;
        int i = 1;
        //i != 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("taper le nombre n ");
        n = sc.nextInt();
        a=n;
        while(i<a){
            n = n * i;
            i++;
        }
        System.out.println("la factoriel de  "+a+"  est : "+n);
    }
    
}
