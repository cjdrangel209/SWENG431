/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part2;

/**
 *
 * @author Cory Drangel
 */
public class Foo {
    public String foo(int a, int b, int c){
        String triangleType;
        
        if (a >= 1 && a <= 100 && b >= 50 && b <= 150 && c >= 100 && c <= 200){
            if(a == b && b == c){
                triangleType = "equilateral";
            }
            else if((a == b && b != c) || (a == c && c != b) || (b == c && c != a)){
                triangleType = "isosceles";
            }
            else{
                triangleType = "scalene";
            }
        }
        else {
            triangleType = "error";
        }
        
        return triangleType;
    }
}
