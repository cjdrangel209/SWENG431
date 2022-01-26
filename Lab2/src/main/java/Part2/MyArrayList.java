package Part2;


import java.util.ArrayList;

/**
 *
 * @author Cory Drangel
 * @author Noah Spott
 */

// *** MyArrayList is limited to 100 elements. ***
public class MyArrayList<E> extends ArrayList<E> {
    private ArrayList<E> al = new ArrayList<E>();
    private final int no = 100;
    
    public MyArrayList() {
        //assert postcondition
        assert al != null       : "The MyArrayList object == null.";
        assert al.size() == 0   : "The size of the MyArrayList object == 0";
    }
    
    @Override
    public int size(){
        //assert postcondition
        assert al != null       : "The MyArrayList object == null.";
        assert al.size() <= no  : "The size of the MyArrayList object is > " + no;

        //code
        return al.size();
    }
    
    //Insert e as a new first element to mal
    public void insertFirst(E e){
        //assert precondition
        assert e != null        : "Inserted element == null";
        assert al.size() <= no  : "The size of the MyArrayList object is > " + no;

        //code
        al.add(0, e);

        //assert postcondition
        assert al != null       : "The MyArrayList object == null.";
        assert al.get(0) == e   : "The first element != " + e;
    }
    
    //Insert e as a new last element
    public void insertLast(E e){
        //assert precondition
        assert e != null        : "Inserted element == null";
        assert al.size() <= no  : "The size of the MyArrayList object is > " + no;

        //code
        al.add(al.size(), e);

        //assert postcondition
        assert al != null                   : "The MyArrayList object == null.";
        assert al.get(al.size() - 1) == e   : "The last element of the MyArrayList object != " + e;
    }
    
    //Delete my first element
    public void deleteFirst(){
        //assert precondition
        assert al != null           : "The MyArrayList object == null.";
        assert al.get(0) != null    : "First element doesn't exists.";

        //code
        al.remove(0);

        //assert postcondition
        assert al.size() <= no      : "The size of the MyArrayList object is > " + no;
    }
    
    //Delete my last element
    public void deleteLast(){
        //assert precondition
        assert al != null                       : "The MyArrayList object == null.";
        assert al.get(al.size() - 1) != null    : "Last element doesn't exists.";

        //code
        al.remove(al.size() - 1);

        //assert postcondition
        assert al != null           : "The MyArrayList object == null.";
        assert al.size() < no       : "The size of the MyArrayList object is > " + no;
    }
    
    public void show(){
        for (E e: al){
            System.out.println(e);
        }
    }
}

