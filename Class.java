public class Verre {
    String matiere;
    String boissant;
    int capacite;
    int capacitemax;
    
    void afficher_les_info(){
        System.out.println("la matier de ce verre est "+matiere);
        System.out.println("la boissant de ce verre est "+boissant);
        System.out.println("la capacite de ce verre est "+capacite);
        System.out.println("la capacitemax de ce verre est "+capacitemax+"\n\n");
    }
    
    void vider_verre(){
        capacite-=5;
    }
    
    void remplir_verre(){
        capacite+=10;
    }
}
public class Class {
    
    public static void main(String[] args) {
        Verre verre = new Verre();
        verre.matiere = "Bois";
        verre.boissant = "Eau";
        verre.capacite = 30;
        verre.capacitemax = 50;
        verre.afficher_les_info();
        verre.remplir_verre();
        verre.afficher_les_info();
        verre.vider_verre();
        verre.afficher_les_info();
    }
    
}

