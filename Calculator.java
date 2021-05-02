//Created by Marcus Gerard Riccio
//Calculator

public class Calculator {
    //counter
    int i = 0;
    //Calculator(String x)
    //takes input string of digits and
    //returns calculated int value based on PEMDAS
    public int Calculator(String x) {
        if (x == null || x.length() == 0) return 0;
        int result = 0;
        int temp = 0;
        int num = 0;
        char op = '+';
        
        while (i < x.length()) {
            char c = x.charAt(i++);
            if (Character.isDigit(c)) {
                temp = temp * 10 + c - '0';
            } else if (c == '(') {
                //string digit parsing is tracked through incrementing i
                temp = Calculator(s);
            } else if (c == ')') {
                break;
            } else if (c != ' ') {
                //calculate numerical value based on operator
                num = cal(num, temp, op);
                if (c == '+' || c == '-') {
                    result += num;
                    num = 0;
                }
                //reset temp and op for next char
                temp = 0;
                op = c;
            }
        }
        return result + cal(num, temp, op);
    }
    private int cal(int num, int tmp, char op) {
        if (op == '+') return num + tmp;
        else if (op == '-') return num - tmp;
        else if (op == '*') return num * tmp;
        else return num / tmp;
    }
}
//test main
/*
public class Main {
    public static void main(String[] args) {
        String test = "2*(5+7*2)/4+(6/2*2)";
        System.out.println(test);
        Calculator calculator = new Calculator();
        System.out.println("Calculates to: " + calculator.Calculator(test));
    }
} 
*/