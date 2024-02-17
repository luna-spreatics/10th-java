package _05_class._06_abstract.ex1;

public class StudentEx {
    public static void main(String[] args) {
        // Kim 객체 생성 및 출력
        Kim kim = new Kim("김철수", "마포 고등학교", 17, "20221010");
        System.out.println(kim.getName() + "학생의 정보");
        System.out.println("학교 : " + kim.getSchool());
        System.out.println("나이 : " + kim.getAge());
        kim.todo();

        Baek baek = new Baek("백영희", "마포 고등학교", 17, "20221011");
        System.out.println(baek.getName() + "학생의 정보");
        System.out.println("학교 : " + baek.getSchool());
        System.out.println("나이 : " + baek.getAge());
        baek.todo();

    }
}
