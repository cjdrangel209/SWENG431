package Part2;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {
    @ParameterizedTest(name = "a: {0} b: {1} c: {2} -> {3}")
    @CsvSource({
            "1, 100, 150, scalene",     //a min, b nom, c nom
            "2, 100, 150, scalene",     //a min+1, b nom, c nom
            "50, 100, 150, scalene",    //a nom, b nom, c nom
            "99, 100, 150, scalene",    //a max-1, b nom, c nom
            "100, 100, 150, isosceles", //a max, b nom, c nom
            "50, 50, 150, isosceles",   //a nom, b min, c nom
            "50, 51, 150, scalene",     //a nom, b min+1, c nom
            "50, 149, 150, scalene",    //a nom, b max-1, c nom
            "50, 150, 150, isosceles",  //a nom, b max, c nom
            "50, 100, 100, isosceles",  //a nom, b nom, c min
            "50, 100, 101, scalene",    //a nom, b nom, c min+1
            "50, 100, 199, scalene",    //a nom, b nom, c max-1
            "50, 100, 200, scalene",    //a nom, b nom, c max
            "0, 100, 150, error",       //a min-1, b nom, c nom
            "101, 100, 150, error",     //a max+1, b nom, c nom
            "50, 49, 150, error",       //a nom, b min-1, c nom
            "50, 151, 150, error",      //a nom, b max+1, c nom
            "50, 100, 99, error",       //a nom, b nom, c min-1
            "50, 100, 201, error"       //a nom, b nom, c max+1
    })
    @Test
    void foo(int a, int b, int c, String expectedResult){
        Foo f = new Foo();
        assertEquals(expectedResult, f.foo(a, b, c));
    }
}