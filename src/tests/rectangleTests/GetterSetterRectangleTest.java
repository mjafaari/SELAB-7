package tests.rectangleTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import models.Rectangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GetterSetterRectangleTest {
    Rectangle rectangle = new Rectangle(5, 7);

    @Test
    @DisplayName("Simple test for length getter")
    void testGetterLength(){
        assertEquals(rectangle.getLength(), 5);
    }

    @Test
    @DisplayName("Simple test for width getter")
    void testGetterWidth(){
        assertEquals(rectangle.getWidth(), 7);
    }

    @Test
    @DisplayName("Simple test for length setter")
    void testSetterLength(){
        rectangle.setLength(9);
        assertEquals(rectangle.getLength(), 9);
    }

    @Test
    @DisplayName("Simple test for width setter")
    void testSetterWidth(){
        rectangle.setWidth(10);
        assertEquals(rectangle.getWidth(), 10);
    }
}
