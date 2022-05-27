package tests.circleTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import models.Circle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GetterSetterCircleTest {
    Circle circle = new Circle(6);

    @Test
    @DisplayName("Simple test for width getter")
    void testGetterRadius(){
        assertEquals(circle.getRadius(), 6);
    }

    @Test
    @DisplayName("Simple test for length setter")
    void testSetterRadius(){
        circle.setRadius(9);
        assertEquals(circle.getRadius(), 9);
    }
}
