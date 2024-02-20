package _08_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectionEx2 {
    public static void main(String[] args) {
        // 이름, 나이를 저장할 Map 생성
        Map<String, Integer> nameAgeMap =  new HashMap<>();

        // 이름, 나이 입력받는 Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름과 나이를 입력하세요. '종료'를 입력하면 종료됩니다.");

        while (true) {
            // 이름 입력받기
            System.out.print("이름 입력: ");
            String name = scanner.nextLine();

            // 종료 조건 확인
            if (name.equals("종료")) {
                break;
            }

            // 나이 입력받기
            System.out.print("나이 입력: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            // 이름이 이미 존재하는 경우 나이를 갱신, 그렇지 않으면 새로운 이름과 나이를 추가
            nameAgeMap.put(name, age);
        }

        System.out.println("\n=== 입력 받은 이름과 나이 목록 ===");
        for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
            System.out.println("이름: " + entry.getKey() +", 나이: " + entry.getValue());
        }

        scanner.close();
    }
}
