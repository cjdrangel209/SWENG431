import java.util.Random;

/**
 *
 * @author Cory Drangel
 */
public class Main {
    public static void main(String args[]){
        double x_0, x_1;
        Random rand = new Random();
        NewtonRaphson nr = new NewtonRaphson();
        int iteration = 0;
        double compareValue = 0.00001;
        boolean done = false;
        
        x_0 = rand.nextInt(500);
        System.out.println("Initial guess is: " + x_0);
        
        do{
           iteration++;
           x_1 = nr.nextNumber(x_0);
           
           if(Math.abs(x_1-x_0) < compareValue){
               done = true;
               System.out.println("Root is: " + x_1);
               System.out.println("Took " + iteration + " iterations.");
           }
           else{
               if(iteration > 2000){
                   done = true;
                   System.out.println("Guess exceeded 2000 iterations.");
               }
               else{
                   x_0 = x_1;
               }
           }
        }while(!done);
        
        System.out.println();
    }
}
