package src.ExO;
import java.util.Scanner;
public class anneeBi {
    public static void main(String[] args) {		
		Scanner scanner = new Scanner (System.in);	
		        		    		    
		   int Année;
		   Année= scanner.nextInt();

		   System.out.println("Entrée une année:");

		   if ((Année % 100 == 0) && (Année % 4 == 0))
		   {
		   System.out.println("L'année est bisextile");
		   }
		    else
		   {
		    System.out.println("L'année n'est pas bisextile") ;
	       }
		scanner.close();
		   		   
}
}
