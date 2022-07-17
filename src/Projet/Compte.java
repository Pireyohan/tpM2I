package src.Projet;

import java.util.*;

public class Compte {
    // Les variables caractérisant un compte sont déclarées comme variables de
    // classe
    public String typeCpte;
    public double val_courante, taux;
    public String numeroCpte;
    public LigneComptable ligne;
    public int nbLigneRéel;

    public void creerCpte() {
        Scanner lectureClavier = new Scanner(System.in);
        char tmp;
        do {
            System.out.print("Type du compte [Types possibles :");
            System.out.print("C(ourant), J(oint), E(pargne)] :");
            tmp = lectureClavier.next().charAt(0);
        } while (tmp != 'C' && tmp != 'J' && tmp != 'E');
        switch (tmp) {
            case 'C':
                typeCpte = "Courant";
                break;
            case 'J':
                typeCpte = "Joint";
                break;
            case 'E':
                typeCpte = "Epargne";
                break;
        }
        System.out.print("Numéro du compte : ");
        numeroCpte = lectureClavier.next();
        if (typeCpte.equalsIgnoreCase("Epargne")) {
            System.out.print("Taux de placement :     ");
            taux = lectureClavier.nextDouble();
        }
        System.out.print("Valeur initiale du compte : ");
        val_courante = lectureClavier.nextDouble();
        nbLigneRéel = 0;
        lectureClavier.close();
    }

    public void creerLigne() {
        ligne = new LigneComptable();
        ligne.creerLigneComptable();
        nbLigneRéel = 1;
        val_courante = val_courante + ligne.valeur;
    }

    public void afficherCpte() {
        System.out.println("Le compte n° : " + numeroCpte + " est un compte " + typeCpte);
        if (typeCpte.equalsIgnoreCase("Epargne"))
            System.out.println(" dont le taux est  " + taux);
        if (nbLigneRéel > 0)
            ligne.afficherLigne();
        System.out.println("Valeur courante : " + val_courante);
    }
}
