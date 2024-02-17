package _05_class._06_abstract.ex2;

// 추상 클래스
public abstract class Shape {
    // 필드 선언
    private String color;
    private String type;

    // 생성자 선언
    public Shape(String color, String type) {
        this.type = type;
        this.color = color;
    }

    // 추상 메소드 선언 (abstract 키워드 사용)
    // - 선언만 하고, 구현은 하지 않음
    // - 중괄호 없음
    // - 구현 내용이 자식 클래스마다 다른 경우 추상 메소드 사용
    public abstract double calculateArea();

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
