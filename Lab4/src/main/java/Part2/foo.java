/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part2;

/**
 *
 * @author Cory Drangel
 */
public class foo {
    public String foo(int a, int b, int c){
        String triangleType;
        
        if(a == b && b == c){
            triangleType = "equilateral";
        }
        else if((a == b && b != c) || (a == c && c != b) || (b == c && c != a)){
            triangleType = "isosceles";
        }
        else{
            triangleType = "scalene";
        }
        
        return triangleType;
    }
}
