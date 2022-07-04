// package src.ExoObjectProduit;

// public class main1 {
//     public static void main(String[] args) {

//         Produit liste[] = new Produit[5];
//         // ArrayList<Produit> maliste= new ArrayList<Produit>();
//         // La creation du produit en passant en argument le code du produit
//         Produit produit1 = new Produit("produit100");
//         Produit produit2 = new Produit("produit101");

//         // La mise à jour des la dénomination , en passant en argument une chaine de
//         // caractères
//         // produit1.setDenomination("crayon de papier");
//         // produit2.setDenomination("Crayon de couleur");

//         // La consultation du code , on retoure une chain de caractere
//         // produit1.getCode();
//         // La consultation du prix, on retourne un entier
//         // produit1.getPrix();

//         produit1.getDenomination().modifLibelle("CP", "Crayon de bois");
//         // La mise à jour du prix, en passant en argument un entier
//         produit1.setPrix(1);

//         produit2.getDenomination().modifLibelle("CC", "Crayon de couleur");
//         produit2.setPrix(2);

//         ProduitPerissable produit4 = new ProduitPerissable("Produit 102");
//         produit4.getDenomination().modifLibelle("Pomme", "Verte");
//         produit4.setPrix(1);

//         ProduitSaisonnier produit3 = new ProduitSaisonnier("Produit 103");
//         produit3.setPrix(3);
//         produit3.getDenomination().modifLibelle("Bonnet", "Bleu");
//         produit3.setRemise(1);

//         // produit4.getDateFab().setTime(produit4.getDateFab().getTime()-3600*10000*24*7);
//         produit4.getDateFab().minusDays(7);
//         produit4.setDateFab(produit4.getDateFab().minusDays(7)); // permet de l'enregistrer
//         System.out.println(produit4.getDateFab());
//         // ProduitPerissable produit5 = new ProduitPerissable("Produit 500");
//         // System.out.println(produit5.getDateFab());

//         ProduitFugace produit5 = new ProduitFugace("produit 500");
//         produit5.getDenomination().modifLibelle("Huitres", "abcd");
//         produit5.setPrix(5);
//         produit5.setRemise(2);
//         produit5.setSaison(Periode.automn);

//         liste[0] = produit1;
//         liste[1] = produit2;
//         liste[2] = produit3;
//         liste[3] = produit4;
//         liste[4] = produit5;

//         for (Produit produit : liste) {
//             if (produit instanceof ProduitPerissable) { // check pour voir si produit est de type objet =>produit
//                                                         // perissable
//                 ProduitPerissable p = (ProduitPerissable) produit;
//                 System.out.println(p.getDateFab());
//                 // ou
//                 // System.out.println(((ProduitPerissable) produit).getDateFab());

//             }
//             if (produit instanceof Saison) {
//                 System.out.println(((Saison).produit).getSaison());
//             }
//             System.out.println(produit.getDenomination().afficherLibelle() + " - " + produit.getPrix() + " euros ");
//             // System.out.println("Voici l'objet en question " + produit1.getCode() + " , "+
//             // produit1.getDenomination().afficherLibelle());
//             // System.out.println("Voici l'objet en question " + produit2.getCode() + " , "
//             // + produit1.getPrix() + " , " + produit1.getDenomination().afficherLibelle());

//         }
//     }
// }
