package src.ExO;

import java.util.Scanner;


/**
 * <p>
 * CECI EST LE JEU DU SHIFUMI
 * </p>
 * 
 * @author Yohan Pire
 * @version 1.0
 * @param monchoix
 * 
 */
public class shifumi {

    public static Scanner lectureclavier = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Entre votre choix ( 1 pierre, 2 papier, 3 ciseaux)");

        int monchoix = lectureclavier.nextInt();
        int choixdelordi = (int) Math.random() * 3;

        System.out.println("Vous avez choisi " + monchoix);
        while (monchoix == choixdelordi) {

            System.out.println("recommencer");
        }

        switch (choixdelordi) { // ce sont les choix de lordi
            case 0: // l'ordi en case 0 a choisit => 1 perre , il y a un décalage -1 sur la lecture
                System.out.println("Lordi a choisi la pierre"); // case 0 lordi choisit Pierre
                break;
            case 1:
                System.out.println("Lordi a choisi le papier");
                break;
            case 2:
                System.out.println("Lordi a choisi les ciseaux");
                break;
            default:
                System.out.println("Donnée incorecte, recommencer");
        }
        while (monchoix == choixdelordi) {

            System.out.println("recommencer");
            return;
        }

        if (monchoix == 1) { // pierre
            switch (choixdelordi) { // random entre pierre papier ciseaux
                case 0:
                    System.out.println("Egalite"); // lordi lui a choisit pierre donc exequo
                    break;
                case 1:
                    System.out.println("Gagner"); // lordi lui a choisit papier donc il gagne
                    break;
                case 2:
                    System.out.println("Perdu");
                    break;
                default:
                    System.out.println("Donnée incorecte, recommencer");
            }
        }
        if (monchoix == 2) {
            switch (choixdelordi) {
                case 0:
                    System.out.println("Gagner");
                    break;
                case 1:
                    System.out.println("Egalité");
                    break;
                case 2:
                    System.out.println("Perdu");
                    break;
                default:
                    System.out.println("Donnée incorecte, recommencer");
            }
        }
        if (monchoix == 3) {
            switch (choixdelordi) {
                case 0:
                    System.out.println("Perdu");
                    break;
                case 1:
                    System.out.println("Gagner");
                    break;
                case 2:
                    System.out.println("Egalité");
                    break;
                default:
                    System.out.println("Donnée incorecte, recommencer");
            }
        }
        /*****************************************
         * CORRECTION
         ***************************************/
        int choixJ = 0;
        int choixIA = 0;
        int scoreJ = 0;
        int scoreIA = 0;
        char continuer = 'O';

        while (continuer == 'O') {
            for (int i = 0; i < 3; i++) {
                System.out.println("Que voulez vous jouer ");
                choixJ = lectureclavier.nextInt();
                choixIA = (int) (Math.random() * 3);

                if ((choixJ == 0 && choixIA == 2) || (choixJ == 1 && choixIA == 0) || (choixJ == 2 && choixIA == 1)) {
                    System.out.println("Win");
                    scoreJ++;

                } else if (choixJ == choixIA) {
                    System.out.println("egalité");

                } else {
                    System.out.println("perdu");
                    scoreIA++;
                }
            }
            System.out.println("Voulez vous continuer");
            continuer = lectureclavier.next().charAt(0);

        }
        System.out.println("score final" + scoreIA + " : " + scoreJ);
    }
}
