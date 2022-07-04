package src.ExoObjectProduit;

public class Denomination {
    
    protected String libellelong=""; // libelle long
    protected String libelleCourt=""; //libelle court

    public String getLibellelong() {
        return libellelong;
    }
    public void setLibellelong(String libellelong) {
        this.libellelong = libellelong;
    }
    
    public String getLibelleCourt() {
        return libelleCourt;
    }
    public void setLibelleCourt(String libelleCourt) {
        this.libelleCourt = libelleCourt;
    }
  
    public Denomination() {
       
    }

    public void modifLibelle(String libelleCourt, String libelleLong){
        this.libelleCourt=libelleCourt;
        this.libellelong=libelleLong;
    }

    public String afficherLibelle(){

        return this.libelleCourt +" => "+ this.libellelong;
    }



}
