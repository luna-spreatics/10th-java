package _07_generic.ex;

public class Calculator<T extends Number> {
    private T num1;
    private T num2;

    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static void main(String[] args) {
        Calculator<Integer> integerCalculator = new Calculator<>(5, 10);
        System.out.println("Integer Sum: " + integerCalculator.add());

        Calculator<Double> doubleCalculator = new Calculator<>(1.1, 1.2);
        System.out.println("Double Sum: " + doubleCalculator.add());
    }
}
