
package lab4part3;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Cory Drangel
 */
class MyThread extends Thread {
    
    @Override
    public void run(){
        File f = new File("src/input.txt");
        Scanner reader;
        
        int a, b, expected_sum, read_sum;
        try{
            reader = new Scanner(f);
            while(reader.hasNextLine()){
                
            }
        }
        catch(){
            
        }
    }
}
