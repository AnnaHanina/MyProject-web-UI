package org.example.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.example.lesson4.MyException;
import org.example.lesson4.Triangle;

public class TriangleTest {

    @Test
    void positiveTest() throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(4.14578098794425, triangle.square(3, 3, 5));
    }

    @Test
    void negativeTest2() throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertThrows(MyException.class, () -> triangle.square(3.0, 3.0, -5.0));
    }

    @Test
    void negativeTest() throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertThrows(MyException.class, () -> triangle.square(3, 3, 0));

    }

    @Test
    void negativeTest3() throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertThrows(MyException.class, () -> triangle.square(1,1,100));

    }
}
