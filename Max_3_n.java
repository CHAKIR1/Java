import java.util.Scanner;

public class Max_3_n {

    public static void main(String[] args) {
		double f,g,h,max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre réele");
        f = sc.nextDouble();
        System.out.println("Entrer un nombre réele");
        g = sc.nextDouble();
        System.out.println("Entrer un nombre réele");
        h = sc.nextDouble();
        max = f;
        if(f < g){
            max = g;
        }
        if(h > max){
            max = h;
        }
        System.out.println("\n"+max+" est le maximum nombre");
        
	}
}