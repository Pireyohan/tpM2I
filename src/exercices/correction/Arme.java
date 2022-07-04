package src.exercices.correction;

public class Arme extends BasicItem implements Equipable {
    // protected String nom="";
    protected int degats = 0;
    protected float critique = 0.0f;

    public Arme(String name) {
        super(name);
    }

    public Arme(String name, int degats, float critique) {
        super(name);
        this.degats = degats;
        this.critique = critique;
    }

    @Override
    public boolean equip(Personnage target) {
        if (target.getEquipedWeapon() != null) // si jai deja une arme equipe je lajoute dans linventaire
            target.ajouterItem(target.getEquipedWeapon());
        if (target.retirerItem(this)) {
            target.setEquipedWeapon(this);
            return true;
        }
        return false;
    }

    @Override
    public boolean unequip(Personnage target) {
        if (target.getEquipedWeapon() == this) {
            target.ajouterItem(this);
            target.setEquipedWeapon(null);

            return true;
        }
        return false;
    }

    // #region Get SEt
    public int getDegats() {
        return degats;
    }

    public void setDegats(int degats) {
        this.degats = degats;
    }

    public float getCritique() {
        return critique;
    }

    public void setCritique(float critique) {
        this.critique = critique;
    }
    // #endregion
}
