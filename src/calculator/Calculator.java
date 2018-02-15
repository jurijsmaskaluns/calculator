package calculator;

import java.lang.invoke.SwitchPoint;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    public String calculate(String[] expression) {

        double a = Double.parseDouble(expression[0]);
        double b = Double.parseDouble(expression[2]);
        double calc;
        String op1 = expression[1];
        double result;
        double c;
        String op2;
        int i;
        i = expression.length;
        if (i == 3) {
            op2 = "+";
            c = 0;
        } else {
            c = Double.parseDouble(expression[4]);
            op2 = expression[3];
        }
        if ((op1.equals("+") || op1.equals("-")) && (op2.equals("*") || op2.equals("/"))) {
            System.out.println("op1: +-; op2: */");
            switch (op2) {
                case "*":
                    calc = b * c;
                    break;
                case "/":
                    calc = b / c;
                    break;
                default:
                    return "error 2";
            }
            switch (op1) {
                case "+":
                    result = a + calc;
                    break;
                case "-":
                    result = a - calc;
                    break;
                default:
                    return "error 3";
            }
        } else {
            System.out.println("op1: +-*/; op2: +-");
            switch (op1) {
                case "+":
                    calc = a + b;
                    break;
                case "-":
                    calc = a - b;
                    break;
                case "*":
                    calc = a * b;
                    break;
                case "/":
                    calc = a / b;
                    break;
                default:
                    return "error 4";
            }
            switch (op2) {
                case "+":
                    result = calc + c;
                    break;
                case "-":
                    result = calc - c;
                    break;
                case "*":
                    result = calc * c;
                    break;
                case "/":
                    result = calc / c;
                    break;
                default:
                    return "error 5";
            }
        }
        return String.valueOf(result);
    }

}
