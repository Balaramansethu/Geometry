package com.tdd;

public class GeometricCalculation {
    int length, breadth;
    public  GeometricCalculation(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

public int calculateArea()
    {
        return length*breadth;
    }

    public int perimeter()
    {
        int two = 2;
        return two * (length * breadth);
    }
}
