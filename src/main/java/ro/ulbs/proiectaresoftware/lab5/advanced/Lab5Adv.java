package ro.ulbs.proiectaresoftware.lab5.advanced;

public class Lab5Adv {
    static void main() {
        NewIntCalculator calculator = new NewIntCalculator(10);
        DoubleCalculator calculator2 = new DoubleCalculator(10.0);
        Object result = calculator.add(5).substract(3).multiply(2).result();
        Object result2= calculator2.add(5.0).substract(3.3).multiply(2.2).result();
        System.out.println(result);
        System.out.println(result2);

    }
}
