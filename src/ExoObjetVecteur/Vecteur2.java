package src.ExoObjetVecteur;

public class Vecteur2 {
    public double x;
    public double y;

    public Vecteur2(){
        this.x=0;
        this.y=0;
    }
    public Vecteur2(double x, double y) {
        this.x = x;
        this.y = y;
    }
   

    public Vecteur2(float X, float Y) {
        this.x = X;
        this.y = Y;
    }


    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "V(" + x + " , " + y + ")";
    }
    // pas doverride car pas comme la signature
    public boolean equals(Vecteur2 other) {
        return (this.x == other.x && this.y == other.y);// je verifie que les coordonnées soient bien égale
    }

}
