package Part1;


/**
 *
 * @author Cory Drangel
 */
public class NewtonRaphson {
    
    private double function(double x_0){
        double val;
        
        val = 9*Math.pow(x_0, 6) - 7*Math.pow(x_0, 5) + 0*Math.pow(x_0, 4) - 
                8*Math.pow(x_0, 3) + 7*Math.pow(x_0, 2) - 6*x_0 + 3;
        
        return val;
    }
    
    private double derivedFunction(double x_0){
        double val;
        
        val = 54*Math.pow(x_0, 5) - 35*Math.pow(x_0, 4) + 0*Math.pow(x_0, 3) -
                24*Math.pow(x_0, 2) + 14*x_0 - 6;
        
        return val;
    }
    
    public double nextNumber(double x_0){
        double val;
        
        val = x_0 - (function(x_0)/derivedFunction(x_0));
        
        return val;
    }
}
