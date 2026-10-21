package org.example;

import java.util.function.*;

public class Calculator {
    public static Supplier<Calculator> instance =Calculator::new;
    public BinaryOperator<Integer> plus = (a, b) -> a + b;
    public BinaryOperator<Integer> minus = (a, b) -> a - b;
    public BinaryOperator<Integer> multiply = (a, b) -> a * b;
    public BinaryOperator<Integer> devide = (a, b) -> a / b;
    public UnaryOperator<Integer> pow = (a) -> a * a;
    public UnaryOperator<Integer> abs = (a) -> a >= 0 ? a : -a;
    public Predicate<Integer> isPositive = (a) -> a > 0;
    public Consumer<Integer> printLn = System.out::println;

    private Calculator() {};
}
