package tests.circleTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import models.Circle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AreaComputeCircleTest {
    Circle circle;

    @Test
    @DisplayName("Simple area computation example")
    void testAreaCompute(){
        circle = new Circle(5);
        assertEquals(circle.computeArea(), 5 * 5 * 3.1416);
    }

    @Test
    @DisplayName("Area computation for zero radius")
    void testAreaComputeZeroRadius(){
        circle = new Circle(0);
        assertEquals(circle.computeArea(), 0);
    }
}
