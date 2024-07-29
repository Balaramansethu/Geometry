package com.tdd;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;



public class GeometricCalculationTest {

@Nested
class RectangleTest
{
    //Test case for area
    @Test
    void toReturnSixAsAreaWhenLengthAndBreadthOfRectangleIsThreeAndTwo()
    {
        //Arrange
        int six = 6, three = 3, two = 2;
        //Act
        GeometricCalculation geometricCalculation = new GeometricCalculation(three,two);
        //Assert
        assertThat(geometricCalculation.calculateArea(), is(equalTo(six)));
    }

    //Test case for perimeter
    @Test
    void ToReturnTwelveWhenLengthAndBreadthOfRectangleIsThreeAndTwo()
    {
        //Arrange
        int twelve = 12, three = 3, two = 2;
        //Act
        GeometricCalculation geometricCalculation = new GeometricCalculation(three, two);
        //Assert
        assertThat(geometricCalculation.perimeter(), is(equalTo(twelve)));
    }

}

}
