package seminar_3.controller;

import seminar_3.model.CalculatorModel;
import seminar_3.model.InvalidOperatorException;
import seminar_3.model.NegativeNumberException;
import seminar_3.view.CalculatorView;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public int calculate(int num1, int num2, String operator) {
        int result;
        switch (operator) {
            case "+":
                result = model.add(num1, num2);
                break;
            case "-":
                result = model.subtract(num1, num2);
                break;
            case "*":
                result = model.multiply(num1, num2);
                break;
            case "/":
                result = model.divide(num1, num2);
                if (result < 0) {
                    throw new NegativeNumberException("Результат отрицателен");
                }
                break;
            case "^":
                throw new InvalidOperatorException("Оператор '^' не поддерживается");
            case "":
                throw new InvalidOperatorException("Оператор не указан");
            default:
                throw new InvalidOperatorException("Недопустимый оператор: " + operator);
        }
        view.printResult(result);
        return result;
    }
}

