//____________________________________________________________chakir el ouafi_________________________________________________________________________________________________________________________

package exo;
//23 creation 
 class mp {
	public mp(char c ,double b) {
		p=c;
		 o=b;
	}
	public void affich() { 
		System.out.print("le noms du point "+ p +" son abscisse" + o+"\n");
	}
	public void transtate(double db) {
		o=o+db;
		
	}
	char p;
	double o;
	}
 
public class point {

	public static void main(String [] args) {
	mp g=new mp('j',9.0);
	g.affich();
	g.transtate(8.0);
	g.affich();
	
	
	}
	
}
	
