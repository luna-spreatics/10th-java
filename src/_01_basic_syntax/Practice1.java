package _01_basic_syntax;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름 입력하세요 : ");
        String name = scanner.next();

        System.out.print("나이를 입력하세요 : ");
        int age = scanner.nextInt();

        System.out.printf("안녕하세요! %s 님, %d 세 이시네요!", name, age);
    }
}
