package src.ExoObjectProduit;

public class ProduitSaisonnier extends Produit implements Saison{
    protected Periode saison = Periode.aucune;
    protected int remise = 0;

    public ProduitSaisonnier(String code) {
        super(code);

    }
    @Override
    public Periode getSaison() {
        return saison;
    }
    @Override
    public void setSaison(Periode saison) {
        this.saison = saison;
    }
    @Override
    public int getRemise() {
        return remise;
    }
    @Override
    public void setRemise(int remise) {
        this.remise = remise;
    }

    @Override // vérifier s'il y a bien un getPrix dans la classe mère
    public int getPrix(){ // la remise se fait dans la classe Produit saisonnier
        return this.prix - this.remise;
        //return super.getPrix() -this.remise;
    }

}
