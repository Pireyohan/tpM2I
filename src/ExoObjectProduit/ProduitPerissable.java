package src.ExoObjectProduit;

import java.time.LocalDate;

public class ProduitPerissable extends Produit  {

    // la durée de conservation en int
    protected int duree=0;
    protected LocalDate dateFab;

    public LocalDate getDateFab() {
        return dateFab;
    }

    public void setDateFab(LocalDate dateFab) {
        this.dateFab = dateFab;
    }

    public ProduitPerissable(String code) {
        super(code); 
        dateFab = LocalDate.now();
          
    }
    //Sert a préciser une date 
     public ProduitPerissable(String code, String date) {
         super(code); 
        dateFab = LocalDate.parse(date);
          
     }
/**************************Heritage Multiple => interface******* */

 




}
