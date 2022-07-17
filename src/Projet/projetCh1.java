package src.Projet;

import java.util.Scanner;

public class projetCh1 {

    public static void main(String[] args) {
        byte choix = 0;
        String numeroLu = "";
        Compte C = new Compte();
        Scanner lectureClavier = new Scanner(System.in);
        do {
            choix = menuPrincipal();
            switch (choix) {
                case 1:
                    C.creerCpte();
                    break;
                case 2:
                    // demande à l'utilisateur de saisir le numero du compte à afficher
                    System.out.print("Quel compte souhaitez vous afficher ? : ");
                    numeroLu = lectureClavier.next();
                    // verifie que le numero du compte existe,
                    if (numeroLu.equalsIgnoreCase(C.numeroCpte))
                        C.afficherCpte();
                    else
                        System.out.println("Le systeme ne connait pas le compte " + numeroLu);
                    break;
                case 3:
                    // option 3, creer une ligne comptable
                    System.out.print("Pour quel compte souhaitez vous creer une ligne ? : ");
                    numeroLu = lectureClavier.next();
                    if (numeroLu.equalsIgnoreCase(C.numeroCpte))
                        C.creerLigne();
                    else
                        System.out.println("Le systeme ne connait pas le compte " + numeroLu);
                    break;
                case 4:
                    // option 4, le programme termine son execution
                    sortir();
                    break;
                case 5:
                    alAide();
                    break;
                default:
                    System.out.println("Cette option n'existe pas ");
            }
        } while (choix != 4);
    }

    public static byte menuPrincipal() {
        // Menu principal
        byte tmp;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Créer un compte");
        System.out.println("2. Afficher un compte");
        System.out.println("3. Creer une ligne comptable");
        System.out.println("4.Sortir");
        System.out.println("5. De l'aide");
        System.out.println();
        System.out.println("Votre choix: ");
        tmp = scan.nextByte();
        return tmp;

    }

    public static void sortir() {
        System.out.println("Au revoir à bientot");
        System.exit(0);
    }

    public static void alAide() {
        System.out.println("Option 1. Pour créer un compte Courant entrer C ");
        System.out.println("          Pour créer un compte Joint entrer J ");
        System.out.println("          Pour créer un compte Epargne entrer E");
        System.out.print("          Puis, entrer le numéro du compte, et");
        System.out.println(" sa première valeur creditee ");
        System.out.println("          Dans le cas d'un compte epargne, entrer le taux ");
        System.out.println("Option 2. Le systeme affiche les données du compte choisi ");
        System.out.println("Option 3. Ecrire une ligne comptable");
        System.out.println("Option 4. Pour quitter le programme");
        System.out.println("Option 5. Pour afficher de l'aide");

    }

    public static void afficherCpte(long num, char type, double taux, double val) {

        System.out.println("Le compte n°" + num + "est un compte");// si le numéro de compte
        // existe
        if (type == 'C')
            System.out.println("courant");
        else if (type == 'J')
            System.out.println("joint");
        else if (type == 'E') {
            System.out.println("Epargne dont le taux est " + taux);
        }

        System.out.println("Premiere valeure creditée" + val);

    }

}
