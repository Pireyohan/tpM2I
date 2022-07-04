package src.ExO;

public class VecteurB {
    public double inp1; 
    public double inp2;

    
    public VecteurB(double inp1, double inp2){
        this.inp1=inp1;
        this.inp2=inp2;
    }

    public double magnitude(double inp1, double inp2){
        return Math.sqrt(Math.pow(inp1,2) + Math.pow(inp2,2));

    }
}