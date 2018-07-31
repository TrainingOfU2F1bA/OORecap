package com.company;

public class Rectangle implements Shape{

    private double length;
    private double breath;

    private Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    public double getArea() {
        return length*breath;
    }

    public double getPerimeter() {
        return 2*(length+breath);
    }

    public static Rectangle square(double side) {
        return new Rectangle(side, side);
    }

    public static Rectangle rectangle(double length,double breath) {
        return new Rectangle(length, breath);
    }

}
