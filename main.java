//Main for Calculator.java

public class Main {
    public static void main(String[] args) {
        String test = "2*(5+7*2)/4+(6/2*2)";
        System.out.println(test);
        Calculator calculator = new Calculator();
        System.out.println("Calculates to: " + calculator.Calculator(test));
    }
} 
