package calculator_package;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 2));
        System.out.println(calculator.substract(1,2));
        System.out.println(calculator.mult(1,2));
        System.out.println(calculator.div(21,0));
    }
}
