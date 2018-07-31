package com.company;

import org.junit.Test;

import static com.company.Shape.PI;
import static org.junit.Assert.assertEquals;

public class CircleTest {

    public static final double DELTA =Double.MIN_VALUE;

    @Test
    public void testAreaForRadius1() {
        Circle circle = new Circle(1);
        assertEquals(PI, circle.getArea(), DELTA);
    }

    @Test
    public void testAreaForRadius2() {
        Circle circle = new Circle(2);
        assertEquals(4 * PI, circle.getArea(), DELTA);
    }

    @Test
    public void testPerimeterForRadius8() {
        Circle circle = new Circle(8);
        assertEquals(16 * PI, circle.getPerimeter(), DELTA);
    }

    @Test
    public void testPerimeterForRadius0Point5() {
        Circle circle = new Circle(0.5);
        assertEquals(PI, circle.getPerimeter(), DELTA);
    }
}
