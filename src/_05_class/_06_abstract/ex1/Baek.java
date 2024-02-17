package _05_class._06_abstract.ex1;

public class Baek extends Student {

    public Baek(String name, String school, int age, String studentId) {
        super(name, school, age, studentId);
    }

    @Override
    public void todo() {
        System.out.println("점심은 백종원 피자");
    }
}
