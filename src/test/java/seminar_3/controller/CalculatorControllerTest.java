package seminar_3.controller;

import org.junit.jupiter.api.Test;
import seminar_3.model.CalculatorModel;
import seminar_3.model.InvalidOperatorException;

import seminar_3.model.NegativeNumberException;
import seminar_3.view.CalculatorView;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    CalculatorModel calculatorModel = new CalculatorModel();
    CalculatorView calculatorView = new CalculatorView();
    CalculatorController calculatorController = new CalculatorController(calculatorModel,calculatorView);
    @Test
    void calculate() {
        int result = calculatorController.calculate(50,30,"+");
        int result2 = calculatorController.calculate(50,30,"-");
        int result3= calculatorController.calculate(50,30,"/");
        int result4 = calculatorController.calculate(50,30,"*");
        //int result5 = calculatorController.calculate(50,30,"^");
        //int result6 = calculatorController.calculate(50,30," ");
        //int result7 = calculatorController.calculate(50,30,"%");
        assertEquals(80,result);
        assertEquals(20,result2);
        assertEquals(1,result3);
        assertEquals(1500,result4);
        //assertEquals(1500,result5);
        //assertEquals(1500,result6);
        //assertEquals(1500,result7);


    }

    @Test
    void testUnsupportedOperator() {
        CalculatorController calculatorController = new CalculatorController(new CalculatorModel(), new CalculatorView());

        // Проверяем, что генерируется InvalidOperatorException при использовании "^"
        assertThrows(InvalidOperatorException.class, () -> {
            calculatorController.calculate(10, 5, "^");
        });
        assertThrows(InvalidOperatorException.class, () -> {
            calculatorController.calculate(10, 5, " ");
        });
        assertThrows(InvalidOperatorException.class, () -> {
            calculatorController.calculate(10, 5, "%");
        });
        //assertThrows(NegativeNumberException.class, () -> {
        //    calculatorController.calculate(10, 5, "^");
        //});
    }
}