package at.technikum.slmuebungcalapi.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {
    @Test
    void addTwoPositiveInteger() {
        //Arrange

        CalculatorController controller = new CalculatorController();
        int a = 5;
        int b = 6;

        //Act
        int result = controller.add(a,b);

        //Assert
        assertEquals(11, result);
    }
    @Test
    void addOnePositivOneNegativInteger() {
        //Arrange

        CalculatorController controller = new CalculatorController();
        int a = 5;
        int b = -6;

        //Act
        int result = controller.add(a,b);

        //Assert
        assertEquals(-1, result);
    }
    @Test
    void addTwoNegativeInteger() {
        //Arrange

        CalculatorController controller = new CalculatorController();
        int a = -5;
        int b = -6;

        //Act
        int result = controller.add(a,b);

        //Assert
        assertEquals(-11, result);
    }

    @Test
    void multiplyTwoInterger(){
        //Arange
        CalculatorController controller = new CalculatorController();
        int a = 3;
        int b = 7;

        //Act
        int result = controller.multiply(a,b);

        //Assert
        assertEquals(21, result);
    }
    jksdnhfsjioanf;
}