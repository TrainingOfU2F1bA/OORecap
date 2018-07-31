package com.company;

import org.junit.Test;

import static com.company.Rectangle.square;
import static org.junit.Assert.assertEquals;

public class RectangleTest {

    public static final double DELTA = 0.000001;

    @Test
    public void returnAreaOneForLength1Breadth1() {
        Rectangle rectangle = Rectangle.rectangle(1, 1);
        assertEquals(1.0, rectangle.getArea(), DELTA);
    }

    @Test
    public void returnAreaFourForLength2Breath2() {
        Rectangle rectangle = Rectangle.rectangle(2, 2);
        assertEquals(4.0, rectangle.getArea(), DELTA);
    }

    @Test
    public void returnAreaSixForLength2Breadth3() {
        Rectangle rectangle = Rectangle.rectangle(2, 3);
        assertEquals(6.0, rectangle.getArea(), DELTA);
    }

    @Test
    public void returnPerimeterTenForLength4Breadth1() {
        Rectangle rectangle = Rectangle.rectangle(4, 1);
        assertEquals(10.0, rectangle.getPerimeter(), DELTA);
    }

    @Test
    public void returnPerimeterTwentyForLength4Breath6() {
        Rectangle rectangle = Rectangle.rectangle(4, 6);
        assertEquals(20.0, rectangle.getPerimeter(), DELTA);
    }

    @Test
    public void testSquarePerimeterForSide5() {
        Rectangle square = square(0.5);
        assertEquals(2,square.getPerimeter(), DELTA);
    }

    @Test
    public void testSquarePerimeterForSide0Point5() {
        Rectangle square = square(0.5);
        assertEquals(2,square.getPerimeter(), DELTA);
    }

    @Test
    public void testSquareAreaForSide6() {
        Rectangle square = square(6);
        assertEquals(36,square.getArea(),DELTA);
    }
}
