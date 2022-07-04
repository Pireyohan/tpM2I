package src.exercices.correction;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import org.checkerframework.common.returnsreceiver.qual.This;

public class ExoRPG {
    static BasicItem[] availableItems = new BasicItem[10];
    static Arme[] availableWeapons = new Arme[9];
    static Armure[] availableArmors = new Armure[9];

    static Personnage[] monsters = new Personnage[5];
    static Scanner scan;

    public static void main(String[] args) {

        Personnage link = new Personnage("Link");
        // Personnage[] monstres = new Personnage[2]; // on crée un tableau avec deux
        // cases

        //ArrayList<PotionSoin> listPotion = new ArrayList<PotionSoin>(); // Faire une liste de potion pour l'inventaire check
        

        link.setPv(100);
        link.setForce(10);

        // monstres[0] = new Personnage("Slim", 25, 3);
        // monstres[0].setArmor(new Armure("aucune", 15));
        // monstres[0].setEquipedWeapon(new Arme("Crachat", 2, 0.1f));
        // System.out.println(monster.get(1));

        // monstres[1] = new Personnage("Smogogo", 30, 6);
        // monstres[1].setArmor(new Armure("Thorax d'acier", 15));
        // monstres[1].setEquipedWeapon(new Arme("Buée", 10, 0.05f));

        // Affichage , quel heros vous incarnez
        // System.out.println("Vous incarnez le héros suivant : " + paul);

        // Arme epee = new Arme("Epée rouillée", 10, 0.2f);
        // Arme dague = new Arme("Dague en fer", 15, 0.25f);
        // Arme kick = new Arme("Kick in head", 30, 0.5f);

        // Armure carton = new Armure("Cartons scotchés", 10);
        // Armure acier = new Armure("Cuirrasse", 20);
        // Armure titane = new Armure("Cotte titane", 50);

        // /* Mon perso que je stuff */
        // link.ajouterItem(dague);

        // dague.equip(link);
        // link.setArmor(carton);
        // link.setEquipedWeapon(epee);

        /* Mes monstres que je stuff */
        // monster.get(0).ajouterItem(dague);
        // dague.equip(monster.get(0));
        // monster.get(1).ajouterItem(epee);
        // epee.equip(monster.get(1));
        // monster.get(2).ajouterItem(kick);
        // kick.equip(monster.get(2));

        // Boucle qui permet de lancer le combat entre JeanPaul et monstre
        // for (Personnage personnage : monstres) {
        // combattre(paul, personnage);
        // }
        System.out.println("Voici le début du jeu ");
        System.out.println("Vous incarnez le héros suivant : " + link);
        // System.out.println("vous allez rencontrer"+ );
        System.out.println(" 1: Attaquer");
        System.out.println(" 2: Utiliser Potion (x)");

        Scanner selection = new Scanner(System.in);
        int action = selection.nextInt();

        while (link.getPv() != 0) {
            if (action == 1) {

                // Boucle qui permet de lancer le combat entre Link et monstre
                for (Personnage personnage : monsters) {
                    combattre(link, personnage);
                }

            } else if (action == 2 && link.pv < (link.pv) / 2) {
                // take potion

            } else {
                // on retape une des commandes proposée
                System.out.println("Sélectionner une des actions disponible");
                selection.nextInt();
            }
        }
        System.out.println(link + " est mort , vous avez perdu ");

    }

    public static void combattre(Personnage p1, Personnage p2) {
        int i = 0;
        while (p1.getPv() > 0 && p2.getPv() > 0) {
            if (i % 2 == 0) {
                System.out.println("Choisissez la prochaine action : ");
                System.out.println("1 : Attaquer");
                System.out.println("2 : Utliser une potion");
                int decision = scan.nextInt();
                switch (decision) {
                    case 1:
                        p1.attaquer(p2);
                        break;
                    case 2:
                        int j = 0;
                        int nbPotions = 0;
                        for (BasicItem item : p1.getInventaire()) {
                            if (item instanceof PotionSoin) {
                                System.out.println(j + " : " + item.getNom());
                                nbPotions++;
                            }
                            j++;
                        }
                        // TODO gÃ©rer Ã§a mieux
                        if (nbPotions == 0)
                            p1.attaquer(p2);
                        else {
                            System.out.println("Quelle potion souhaitez vous utiliser ?");
                            int potionAUtiliser = scan.nextInt();
                            while (!(p1.getInventaire().get(potionAUtiliser) instanceof Consommable))
                                potionAUtiliser = scan.nextInt();

                            PotionSoin potion = (PotionSoin) (p1.getInventaire().get(potionAUtiliser));
                            potion.consommer(p1);
                            p1.retirerItem(potion);
                        }
                        break;
                    default:
                        p1.attaquer(p2);
                }
            } else
                p2.attaquer(p1);
            i++;
        }

        System.out.println("Le vainqueur est : " + ((p1.getPv() > 0) ? p1 : p2));
    }

    public static BasicItem[] initInventaire() {
        BasicItem[] monInventaire = new BasicItem[5];
        return monInventaire;
    }

    public static void generateDungeon() {
        String[] noms = new String[] { "Gobelin", "Orc", "Troll", "Elfe", "FantÃ´me" };
        String[] adj = new String[] { "peureux", "prÃ©tentieux", "stupide", "passionnÃ©", "pessimiste", "idÃ©aliste",
                "gigantesque", "courageux", "Ã¢gÃ©", "jaune", "violet", "vert", "endurant", "prÃ©voyant", "vigilant",
                "volontaire", "communiste", "de droite", "en marche", "Ã©colo" };

        for (int i = 0; i < monsters.length; i++) {
            monsters[i] = new Personnage(
                    noms[(int) (Math.random() * noms.length)] + " " + adj[(int) (Math.random() * adj.length)],
                    (int) (i + 1 * Math.random() * 30), (int) (i + 1 * Math.random()));
            System.out.println("Monstre : " + monsters[i]);

            monsters[i].setArmor(availableArmors[(int) (Math.random() * i)]);
        }
    }

    public static void createItems() {
        for (int i = 0; i < 4; i++) {
            availableItems[i] = new PotionSoin("Potion" + (1 + i) * 5 + "PV");
            ((PotionSoin) availableItems[i]).setPvRendu((i + 1) * 5);
        }
        String[] types = new String[] { "Papier", "Bois", "Cuivre", "Fer", "Or", "Diamond", "Ether", "Divin",
                "Legend" };
        for (int i = 0; i < 9; i++) {
            availableArmors[i] = new Armure("Armure de " + types[i]);
            availableArmors[i].setDefense((int) (Math.random() * 5 * (i + 1)));
        }
        for (int i = 0; i < 9; i++) {
            availableWeapons[i] = new Arme("Epée de " + types[i]);
            availableWeapons[i].setDegats((int) Math.random() * 5 * (i + 1));
            availableWeapons[i].setCritique((float) Math.random() * 5 * (i + 1) / 100);
        }
    }

    // Affichage pour donner le vainqueur du combat
    // System.out.println("Le vainqueur est : " + ((p1.getPv() > 0) ? p1 : p2));
}