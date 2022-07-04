package src.ExO;
import java.util.Scanner;

public class MainShifumi {
    public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    int a=0;
    int b=0;

    shifumi2 shifumi2 =  new shifumi2(a, b);
    
    int blabla= scan.nextInt();
    shifumi2.playGame(blabla);
    
    scan.close();
 }   

}
