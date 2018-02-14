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
        int i;
        i = expression.length;
        System.out.println("kol-vo simvolov v stroke " + i);
        if (i == 3) {
            switch (op1) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
                default:
                    return "error1";
            }

        } else {
            double c = Double.parseDouble(expression[4]);
            String op2 = expression[3];
            if (op2.equals("*") || op2.equals("/")) {
                System.out.println("srabotalo * ili /");
                switch (op2) {
                    case "*":
                        calc = b * c;
                        break;
                    case "/":
                        calc = b / c;
                        break;
                    default:
                        return "error2";
                }
                switch (op1) {
                    case "+":
                        result = a + calc;
                        break;
                    case "-":
                        result = a - calc;
                        break;
                    case "*":
                        result = a * calc;
                        break;
                    case "/":
                        result = a / calc;
                        break;
                    default:
                        return "error2";
                }
//                return "error2";
            } else {
                System.out.println("srabotalo + ili -");
                return "error3";
            }
        }
        return String.valueOf(result);
    }

}
