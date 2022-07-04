package src.Projet;

import java.util.*;

public class LigneComptable {
    public double valeur;
    public String date;
    public String motif;
    public String mode;

    public void creerLigneComptable() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entrer la valeur à créditer (+) ou débitez (-)");
        valeur = scan.nextDouble();
        System.out.println("Date de l'opération [jj/mm/an]");
      //  date = Lire.S();
        System.out.println("Entrer le motif [S(alaire), L(oyer), A(limentation), D(ivers)");
        motif = scan.next();
        System.out.println("Entre le mode [C(B), N(° Cheque), V(irement)");
        mode = scan.next();
    
    }
    public void afficherLigne(){
        if (valeur>0)
            System.out.println("Débitez : "+valeur);
            else
            {
                System.out.println("Crediter : "+valeur);
                System.out.println("le : "+ date+ " motif : "+ motif+ " mode : "+ mode);
            }
        
    }
}
