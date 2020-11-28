import java.util.Scanner;

public class Serie3 {
    public static void main(String[] args) {
        int a,b,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("taper le premiere nombre");
        a = sc.nextInt();
        char o;
        //Scanner scn =new Scanner(System.in);
        System.out.println("taper un operation");
        o = sc.next().charAt(0);
        System.out.println("taper la deuieme nombre");
        b = sc.nextInt();
        
        if(o == '+'){
            s = a+b;
            System.out.println("s = "+a+" + "+b+" = "+s);
        }
        else if(o == '-'){
            s = a - b;
            System.out.println("s = "+a+" - "+b+" = "+s);
        }
        else if(o == '*'){
            s = a * b;
            System.out.println("s = "+a+" * "+b+" = "+s);
        }
        else if(o == '/'){
            s = a / b;
            System.out.println("s = "+a+" * "+b+" = "+s);
        }
        else{
            System.out.println("error");
        }
        
        
    }

    
}
