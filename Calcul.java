import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) {
        int a,b,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("taper les deux nombres");
        a = sc.nextInt();
        b = sc.nextInt();
        char o;
        //Scanner scn =new Scanner(System.in);
        System.out.println("taper un operation");
        o = sc.next().charAt(0);
        if(o == '+'){
            s = a+b;
			System.out.println(a+" "+o+" "+b+" = "+s);
        }
		else if(o =='-'){
			s = a-b;
			System.out.println(a+" "+o+" "+b+" = "+s);
		}
		else if(o =='*'){
			s = a*b;
			System.out.println(a+" "+o+" "+b+" = "+s);
		}
		else if(o =='/'){
			s = a/b;
			System.out.println(a+" "+o+" "+b+" = "+s);
		}
		else{System.out.println("error");}
        
    }

    
}
