package src.ExoObjetVecteur;

public class Vector3 extends Vecteur2 {
     double z;

    public Vector3(){
        // pas besoin de renoter x et y car deja existant
        super();
        this.z=0;
        
    }
    public Vector3 (double x , double y){
        super(x,y);
        this.z=0;
    } 
    public Vector3(double x, double y , double z){
        super(x,y);
        this.z=z;
    }
    @Override
    public double magnitude() {
        return Math.sqrt(this.x * this.x + this.y * this.y+this.z*this.z);
    }

    @Override
    public String toString() {
        return "V(" + x + " , " + y +" , "+ z +  ")";
    }

        public void methSpecial(){
            
        }
    
}
