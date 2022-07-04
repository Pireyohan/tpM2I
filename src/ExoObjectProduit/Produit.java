package src.ExoObjectProduit;

public class Produit {


    protected String code="";
    protected int prix=0;
    // protected String denomination="";  Partie 1

    protected Denomination denomination;
   

    public Produit(String code) {
        this.code = code;
        denomination=new Denomination();
       // produitPerissable=new ProduitPerissable();
        //produitSaisonnier= new ProduitSaisonnier();
   
    }


    public int getPrix() {
        return prix;
    }
    public void setPrix(int prix) {
        this.prix = prix;
    }


    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }


    public Denomination getDenomination() {
        return denomination;
    }
    public void setDenomination(Denomination denomination) {
        this.denomination = denomination;
    }




    
}