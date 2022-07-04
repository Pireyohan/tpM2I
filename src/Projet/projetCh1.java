package src.Projet;

import java.util.Scanner;

public class projetCh1 {

    public static void main(String[] args) {

        // Variables
        byte choix;
        char typeCpte = '\0';
        double val_courante = 0.0, taux = 0.0;
        long numeroCpte = 0, numeroLu = 0;
        Scanner scan = new Scanner(System.in);

        do {
            choix = menuPrincipal();
            switch (choix) {
                case 1:
                    do {
                        // Option 1
                        System.out.println("Types possible de comptes:");
                        System.out.println("C(courant), J(oint),E(pargne) ");
                        typeCpte = scan.next().charAt(0);
                    } while (typeCpte != 'C' && typeCpte != 'J' && typeCpte != 'E'); // Permet d'identifier la lettre
                                                                                     // rentré
                                                                                     // au clavier
                    System.out.print("Numero du compte :");
                    numeroCpte = scan.nextLong();
                    System.out.print("Premiere valeur creditee  :");
                    val_courante = scan.nextDouble();
                    // Si compte épargne
                    if (typeCpte == 'E') {
                        System.out.print("Taux de placement :     ");
                        taux = scan.nextDouble();
                    }
                    break;
                case 2:
                    // Option 2
                    System.out.println("Quel compte souhaitez vous afficher");
                    numeroLu = scan.nextLong();
                    if (numeroLu == numeroCpte) {
                        afficherCpte(numeroCpte, typeCpte, taux, val_courante);
                    } else {
                        // Sinon il affiche qu'il ne connait pas ce compte
                        System.out.println("Le système ne connait pas le compte " + numeroLu);
                    }
                    break;

                case 3:
                    // Option3 option non programmée
                    System.out.println("option non programmée");
                    break;

                case 4:
                    // Option4 le programme termine son exécution
                    sortir();
                    break;

                case 5:
                    // Option 5 le programme affiche une ligne d'explication pour chaque option
                    alAide();
                    break;
                default:
                    System.out.println("Cette option n'existe pas");

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
