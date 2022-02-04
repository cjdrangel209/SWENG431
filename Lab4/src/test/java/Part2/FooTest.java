package Part2;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FooTest {
    @ParameterizedTest(name = "{0} {1} {2} -> {3}")
    @CsvSource({
            "1, 100, 150, scalene",
            "2, 100, 150, scalene",
            "50, 100, 150, scalene",
            "99, 100, 150, scalene",
            "100, 100, 150, isosceles"
    })
    @Test
    void foo(int a, int b, int c, String expectedResult){
        Foo f = new Foo();
        assertEquals(expectedResult, f.foo(a, b, c));
    }
}