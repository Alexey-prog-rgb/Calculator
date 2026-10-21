package org.example;

//TIP Для <b>запуска</b> кода нажмите <shortcut actionId="Run"/> или
// щелкните значок <icon src="AllIcons.Actions.Execute"/> в боковой области.
public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        // Опреция деления является не безопастной - требуется проверка знаменателя на 0 или блок try/catch
        int c = 0;
        try {
            c = calc.devide.apply(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0! проперте результат расчёта знаменателя!");
        }

        calc.printLn.accept(c);
    }
}