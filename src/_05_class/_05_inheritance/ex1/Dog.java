package _05_class._05_inheritance.ex1;

public class Dog extends Animal{
    public Dog(String name, int age) {
        // Animal 클래스의 생성자 호출하여 초기화
        super("강아지", name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }
}
