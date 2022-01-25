package Part2;


/**
 *
 * @author Cory Drangel
 */
public class Student {
    //code
    public int idNum;
    public String name;
    
    public Student(int i, String n){
        idNum = i;
        name = n;
    }
    
    @Override 
    public String toString(){
        return idNum + ", " + name;
    }    
}
