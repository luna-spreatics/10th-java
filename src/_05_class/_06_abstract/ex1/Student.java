package _05_class._06_abstract.ex1;

public abstract class Student {
    // 이름, 학교, 나이, 학번
    private String name;
    private String school;
    private int age;
    private String studentId;

    // 생성자

    public Student(String name, String school, int age, String studentId) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.studentId = studentId;
    }

    // 추상 메소드
    public abstract void todo();

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }
}
