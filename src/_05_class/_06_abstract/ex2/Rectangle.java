package _05_class._06_abstract.ex2;

// 구체적인 클래스
public class Rectangle extends Shape {
    // 사각형의 가로, 세로 속성
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color, "Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    // 추상 메소드 구현

}
