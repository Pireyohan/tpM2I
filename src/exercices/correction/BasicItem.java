package src.exercices.correction;

public abstract class BasicItem {

    protected int poids = 0;
    protected String icon = "";
    protected String nom = "";

    public BasicItem(String nom) {
        this.nom = nom;
    }

    // #region getter setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    // #endregion

}