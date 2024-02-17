package _05_class._06_abstract.ex2;

// 구체적인 클래스
public class Circle extends Shape {
    // 원의 반지름
    private double radius;
    public Circle(String color, double radius) {
        super(color, "Circle");
        this.radius = radius;
    }

    // 추상 메소드 구현
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
