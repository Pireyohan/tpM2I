package src.ExO;
import java.util.*;

public class Fibonac {
    public static void main(String[] args) {
        
        int n,i;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        int values[]=new int[n]; // space O(N) used
        values[0]=0;
        values[1]=1;
        for(i=2;i<n;i++)values[i]=values[i-1]+values[i-2]; // single traversal O(N)
        System.out.println("The nth fibonacci number is "+values[n-1]);
    }
}

