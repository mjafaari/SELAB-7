package tests.rectangleTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import models.Rectangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AreaComputeRectangleTest {
    Rectangle rectangle;

    @Test
    @DisplayName("Simple area computation example")
    void testAreaCompute(){
        rectangle = new Rectangle(5, 8);
        assertEquals(rectangle.computeArea(), 40);
    }

    @Test
    @DisplayName("Area computation for zero length")
    void testAreaComputeZeroLength(){
        rectangle = new Rectangle(0, 6);
        assertEquals(rectangle.computeArea(), 0);
    }

    @Test
    @DisplayName("Area computation for zero width")
    void testAreaComputeZeroWidth(){
        rectangle = new Rectangle(6, 0);
        assertEquals(rectangle.computeArea(), 0);
    }
}
