package _05_class._07_interface.ex2;

// Car 클래스 Vehicle 상속 받음
public class Car extends Vehicle{
    // 생성자
    public Car(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    // move 메서드 오버라이드
    @Override
    public void move() {
        System.out.println(getName() + "이(가) 도로를 따라 이동중");
    }
    public void test() {
        System.out.println("test");
    }
}
