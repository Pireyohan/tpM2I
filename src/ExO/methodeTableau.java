package src.ExO;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class methodeTableau {
    public static Scanner lectureclavier = new Scanner(System.in);
    public static Object tabeauVoyelles;

    /************************************************/
    /************************************************/

    public static void remplirTableau(int[] monTableau) {

        for (int i = 0; i < monTableau.length; i++) {

            monTableau[i] = (int) (Math.random() * 7); // on va jusqu'a 99
        }
    }

    /************************************************************************************** */

    // Remplir un tableau avec l'alphabet latin a e i o

    public static void tabeauVoyelles() {
        String[] arrayVoy = { "a,e,i,o" };
        System.out.println(arrayVoy);
    }

    /*
     * 
     * @param Exo 6.3
     */

    public static void tableauNotes(int[] monTableau) {
        System.out.println("could you push notes in terminal ");
        for (int i = 0; i < monTableau.length; i++) {

            monTableau[i] = lectureclavier.nextInt();

        }
        System.out.println(Arrays.toString(monTableau));
    }

    public static void tableauBoucle(int[] monTableau) {

        for (int i = 0; i < monTableau.length; i++) {
            monTableau[i] = i * i;
            System.out.println(monTableau[i]);
        }
    }

    public static void tableauExoSix(int[] tableauNbSix) {
        int k = 0;
        tableauNbSix[0] = 1;
        System.out.println(tableauNbSix[0]);

        for (int i = 0; i < tableauNbSix.length; i++) {

            tableauNbSix[k] = tableauNbSix[k - 1] + 2;
            System.out.println(tableauNbSix[k]);

        }
    }

    public static void tableauExoSixSix(int[] tableauFibo) {
        tableauFibo[0] = 1;
        tableauFibo[1] = 1;
        for (int i = 2; i < tableauFibo.length; i++) {
            tableauFibo[i] = tableauFibo[i - 1] + tableauFibo[i - 2];
        }

    }

    /**
     * Exo 6.7
     * 
     * @param tableauNotes
     * @return
     */
    private static double somme(int[] tableauNotes) {
        int s = 0;
        for (int i = 0; i < tableauNotes.length; i++) {

            s = (s + tableauNotes[i]);
        }
        return s;
    }

    public static double tableauMoyenne(int[] tableauNotes) {

        System.out.println("could you push notes in terminal ");

        for (int i = 0; i < tableauNotes.length; i++) {
            tableauNotes[i] = lectureclavier.nextInt();
        }
        double m = (double) somme(tableauNotes) / tableauNotes.length;
        return m;

    }

    /**
     * Exo 6.8
     * Écrivez un algorithme permettant à l’utilisateur de saisir un nombre
     * quelconque de valeurs,
     * qui devront être stockées dans un tableau. L’utilisateur doit donc commencer
     * par entrer lenombre de valeurs qu’il compte saisir.
     * Il effectuera ensuite cette saisie. Enfin, une fois la saisie terminée,
     * le programme affichera le nombre de valeurs négatives et le nombre devaleurs
     * positives.
     */
    /****************************************************************************** */

    /* 6.9 */
    public static int addition(int[] tableauNote) {
        int s = 0;
        for (int i = 0; i < tableauNote.length; i++) {
            tableauNote[i] = lectureclavier.nextInt();
            s = (s + tableauNote[i]);
        }
        return s;
    }

    /* 6.10 */
    public static int[] add(int[] firstArray, int[] secondArray) {
        int length = firstArray.length < secondArray.length ? firstArray.length : secondArray.length;

        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = firstArray[i] + secondArray[i];
        }
        return result;
    }

    public static int mulSchtroupf(int[] tableauSh1, int[] tableauSh2) {

        int resultBis = 0;
        for (int i = 0; i < tableauSh1.length - 1; i++) {
            for (int j = 0; j < tableauSh2.length - 1; i++) {
                resultBis = resultBis + tableauSh1[i] * tableauSh2[j];
            }
        }
        return resultBis;

    }

    /************************************************************************************************** */
    // 7.1 corrigé
    // Écrivez un algorithme qui permette de saisir un nombre quelconque de valeurs,
    // et qui lesrange au fur et à mesure dans un tableau. Le programme,
    // une fois la saisie terminée, doitdire si les éléments du tableau sont tous
    // consécutifs ou non.

    public static void exercice7_1() {
        int[] tab = { 10, 12, 13, 14, 15 };
        int[] tab1 = { 9, 8, 13, 45, 12 };
        boolean consecutif = true;

        for (int i = 1; i < tab.length; i++) {// boucle qui permet de savoir la différence de taille entre les
                                              // itérations
            if (tab[i - 1] != (tab[i] - 1))
                consecutif = false;
        }
        if (consecutif)
            System.out.println("Tableau consécutif");
        else
            System.out.println("tableau non consécutif");
    }

    /************************************
     * 7.2***************************************
     * On peut utiliser Collections.sort
     */
    public static void exercice7_2() {
        int[] tab = { 8, 4, 14, 26, 22 };

        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] < tab[j]) {
                    int c = tab[i];
                    tab[i] = tab[j];
                    tab[j] = c;
                }
            }
        }
        System.out.println(Arrays.toString(tab));

    }

    public static void exercice7_2BBS() {
        int[] tab = { 8, 4, 14, 26, 22 };
        // Bubble sort
        boolean inverse = true;// booulean vrai

        while (inverse) { // tant que jai inversé des chfiffres
            inverse = false; // Jle mets a false

            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] < tab[i + 1]) { // si ils sont inférieurs je les inverse
                    int c = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = c;
                    inverse = true;
                }
                // i = (i == tab.length - 2) ? 0 : i++; // ternaire

            }
        }
        System.out.println(Arrays.toString(tab));
    }

    /***********************************
     * 7.3**********************************************************************************
     */
    public static void exercice7_3() {
        int[] tab = { 8, 4, 14, 26, 22 };
        int max = tab.length / 2;
        for (int i = 0; i < max; i++) {
            int c = tab[i];
            tab[i] = tab[tab.length - 1 - i];
            tab[tab.length - 1 - i] = c;
        }
        System.out.println(Arrays.toString(tab));
    }

    /*******************************************
     * 7.4*************************************************************************
     */
    public static void indexDelete() {

        LinkedList<Integer> tableauDeBase = new LinkedList<>();
        Scanner tapeClavier = new Scanner(System.in);
        System.out.println("How many number added in this array");
        int tailleTableauBase = tapeClavier.nextInt();

        System.out.println("take your " + tailleTableauBase + "numbers");
        for (int i = 0; i < tailleTableauBase; i++) {
            tableauDeBase.add(tapeClavier.nextInt());
        }
        System.out.println("Voici le tableau dans un premier temps " + tableauDeBase);

        /* Maintenant on cherche a supprimer un élément du temps */
        int indexDelete = 0;
        System.out.println("Which index would you want to remove");
        indexDelete = tapeClavier.nextInt();

        List<Integer> tabTempo = new ArrayList<>();
        for (Integer elements : tableauDeBase) {
            if (elements != tableauDeBase.get(indexDelete))
                tabTempo.add(elements);
        }
        System.out.println(" The next array was" + tabTempo);
        tapeClavier.close();

    }

    public static void exercice7_4() {
        Scanner scan = new Scanner(System.in);

        int[] tab = { 8, 4, 14, 26, 22 };
        System.out.println(Arrays.toString(tab));
        System.out.println("Quel index voulez vous supprimer");
        int indexToRemove = scan.nextInt();

        int[] tmTab = new int[tab.length - 1];
        int j = 0;
        for (int i = 0; i < tab.length; i++) {
            if (i != indexToRemove) {
                tmTab[j] = tab[i];
                j++;
            }
        }
        tab = tmTab;
        System.out.println(Arrays.toString(tab));
        scan.close();
    }

    /************************************
     * 7.5*************************************************************************
     */

    /*
     * Écrivez l'algorithme qui recherche un mot saisi au clavier dans un
     * dictionnaire.
     * Ledictionnaire est supposé être codé dans un tableau préalablement rempli et
     * trié.
     */
    public static void rangerDico() {
        {
            List<String> slist = Arrays.asList("java", "php", "c++", "angular", "sql");
            List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());
            System.out.println("After Sorting: " + sortedList);
        }
    }

    public static void exercice7_5() {
        String[] dictionnaire = { "java", "php", "c++", "angular", "sql" };
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez un mot à rechercher");
        String recherche = scan.next();

        for (int i = 0; i < dictionnaire.length; i++) {
            if (recherche.compareTo(dictionnaire[i]) == 0) {
                System.out.println("Trouvé ! à l'index " + i);
            }
        }

    }

    /*************************************
     * 7.6**************************************************
     */

    public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
        int i = 0, j = 0, k = 0;

        // TRaverse les deux tableaux
        while (i < n1 && j < n2) {
            // Vérifier si l'élément courant du premier
            // tableau est plus petit que l'élément courant
            // du second tableau. Si oui, enregistre le premier
            // élément du premier tableau et incrémente le premier tableau
            // et incrémente l'indice du premier tableau. Sinon, faire de même avec le
            // second tableau
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }

        // Stockez les éléments restants du premier tableau
        while (i < n1)
            arr3[k++] = arr1[i++];

        // Stocker les éléments restants du second tableau
        while (j < n2)
            arr3[k++] = arr2[j++];
        // trier le tableau
        Arrays.sort(arr3);
    }

    public static void exercice7_6() {
        int[] arr1 = { 1, 3, 5, 7 };
        int n1 = arr1.length;
        int[] arr2 = { 5, 1, 8, 6 };
        int n2 = arr2.length;
        int[] arr3 = new int[n1 + n2];
        int j = 0;
        int k = 0;

        for (int i = 0; i < arr3.length; i++) {
            if (j < arr1.length && (k >= arr2.length || arr1[j] < arr2[k])) {
                arr3[i] = arr1[j];
                j++;
            } else {
                arr3[i] = arr2[k];
                k++;
            }

        }
    }
}
