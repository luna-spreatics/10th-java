package _05_class._03_static;

import java.util.ArrayList;
import java.util.Scanner;

public class ExRectangle03 {
    // 필드 (변수)
    private int width;
    private int height;

    static int instanceCount = 0;

    public ExRectangle03(int width) {
        // 지역 변수와 필드 변수명이 동일하기 때문에 this 를 사용해서 필드 값에 접근
        this.width = width;
        instanceCount++; // 새로운 Rectangle 인스턴스가 생성될 때마다 개수 증가
    }

    public int area() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        // Rectangle 객체를 담는 ArrayList 생성
        ArrayList<ExRectangle03> rectangles = new ArrayList<>();

        // 사용자에게 안내 메시지 출력
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("사각형의 가로와 세로 길이를 입력해주세요 : ");
            int width = scanner.nextInt();
            int height = scanner.nextInt();

            // 0 이 입력되면 종료
            if (width == 0 && height == 0) {
                break;
            }

            ExRectangle03 rectangle = new ExRectangle03(width);
            // 세로 길이 설정
            rectangle.setHeight(height);

            // ArrayList 에 Rectangle 객체 추가
            rectangles.add(rectangle);

            // instanceCount 확인
            System.out.println("인스턴스 개수: " + ExRectangle03.instanceCount);
        }

        // 입력된 Rectangle 객체들의 정보 출력
        System.out.println("\n 입력된 rectangle 정보");

        for (ExRectangle03 rectangle : rectangles) {
            System.out.println("가로 길이는: " + rectangle.getWidth());
            System.out.println("세로 길이는: " + rectangle.getHeight());
            System.out.println("넓이는: " + rectangle.area());
            System.out.println("-------------------------");
        }
        // Rectangle 인스턴스의 개수 추력
        System.out.println("Rectangle 인스턴스의 개수는 : " + ExRectangle03.instanceCount);

        scanner.close();
    }
}
