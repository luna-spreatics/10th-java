package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>();

        System.out.println("문자열을 입력하세요. exit 을 입력하면 종료됩니다.");
        while (true) {
            System.out.print("입력 : ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            // ArrayList 에 입력받은 문자열 추가
            stringList.add(input);
        }

        // ArrayList 에 있는 값들 출력
        for (String str : stringList) {
            System.out.println(str);
        }

        scanner.close();
    }
}
