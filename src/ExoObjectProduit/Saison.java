package src.ExoObjectProduit;

public interface Saison {

    // Cette interface déclare des methodes permettant de récuperer et manipuler
    // la saison , la remise et le prix (get/set)

    // Manipuler le prix
    public void setPrix(int prix);
    public int getPrix();

    // Manipuler Saison
    public Periode getSaison();
    public void setSaison(Periode saison);

    //Manipuler Remise
    public void setRemise(int remise);
    public int getRemise();

    /* correction  */

 
}
