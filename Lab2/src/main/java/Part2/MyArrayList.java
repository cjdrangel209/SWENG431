package Part2;


import java.util.ArrayList;

/**
 *
 * @author Cory Drangel
 */

// *** MyArrayList is limited to 100 elements. ***
public class MyArrayList<E> extends ArrayList<E> {
    
    public MyArrayList() {
        //assert postcondition
    }
    
    @Override
    public int size(){
        //assert postcondition
        //code
    }
    
    //Insert e as a new first element to mal
    public void insertFirst(E e){
        //assert precondition
        //code
        //assert postcondition
    }
    
    //Insert e as a new last element
    public void insertLast(E e){
        //assert precondition
        //code
        //assert postcondition
    }
    
    //Delete my first element
    public void deleteFirst(){
        //assert precondition
        //code
        //assert postcondition
    }
    
    //Delete my last element
    public void deleteLast(){
        //assert precondition
        //code
        //assert postcondition
    }
    
    public void show(){
        for (E e: this){
            System.out.println(e);
        }
    }
}

