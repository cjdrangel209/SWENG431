package Part2;


import java.util.ArrayList;

/**
 *
 * @author Cory Drangel
 */

// *** MyArrayList is limited to 100 elements. ***
public class MyArrayList<E> extends ArrayList<E> {
    private ArrayList<E> al = new ArrayList<E>();
    private final int no = 100;
    
    public MyArrayList() {
        //assert postcondition
    }
    
    @Override
    public int size(){
        //assert postcondition
        //code
        return al.size();
    }
    
    //Insert e as a new first element to mal
    public void insertFirst(E e){
        //assert precondition
        assert al.size() <= no;
        //code
        al.add(0, e);
        //assert postcondition
        assert al != null;
    }
    
    //Insert e as a new last element
    public void insertLast(E e){
        //assert precondition
        assert al.size() <= no;
        //code
        al.add(al.size(),e);
        //assert postcondition
        assert al != null;
    }
    
    //Delete my first element
    public void deleteFirst(){
        //assert precondition
        assert al!= null;
        //code
        al.remove(0);
        //assert postcondition
        assert al.size() < no;
    }
    
    //Delete my last element
    public void deleteLast(){
        //assert precondition
        assert al != null;
        //code
        al.remove(al.size() - 1);
        //assert postcondition
        assert al.size() < no;
    }
    
    public void show(){
        for (E e: al){
            System.out.println(e);
        }
    }
}

