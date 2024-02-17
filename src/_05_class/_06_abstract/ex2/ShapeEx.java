package _05_class._06_abstract.ex2;

import java.util.ArrayList;

public class ShapeEx {
    public static void main(String[] args) {
        // ArrayList 생성
        // Shape -> Circle, Rectangle 의 부모이기 때문에
        // 자바의 다형성 - 하나의 변수가 여러 종류의 객체를 참조할 수 있는 능력
        ArrayList<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle("blue", 5.0);
        Rectangle rectangle = new Rectangle("red", 4.0, 6.0);

        shapes.add(circle);
        shapes.add(rectangle);

        for (Shape shape : shapes) {
            System.out.printf("\n=== %s 도형의 정보 ===\n", shape.getType());
            System.out.println("도형의 색상: " + shape.getColor());
            System.out.println("도형의 넓이: " + shape.calculateArea());
        }
    }
}
