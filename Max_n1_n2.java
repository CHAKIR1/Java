import java.util.Scanner;

public class Max_n1_n2 {

    public static void main(String[] args) {
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer deux nombres");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        if (n1>n2){
            System.out.println(n1+" est le maximum nombre");
        }
        else{
            System.out.println(n2+" est le maximum nombre");
        }
	}
}