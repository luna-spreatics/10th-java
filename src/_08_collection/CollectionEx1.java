package _08_collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionEx1 {
    public static void main(String[] args) {
        // 정수 입력 위한 Scanner
        Scanner scanner = new Scanner(System.in);

        // 중복을 제거할 정수를 저장할 HashSet 생성
        Set<Integer> uniqueSet = new HashSet<>();

        System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다.");

        while (true) {
            System.out.print("정수 입력: ");
            int input = scanner.nextInt();

            // -1이 입력되면 반복 종료
            if(input == -1) {
                break;
            }
            // 정수 추가 (중복된 값은 자동으로 제거됨)
            uniqueSet.add(input);
        }
        System.out.println("중복 제거된 정수 목록: " + uniqueSet);

        scanner.close();
    }
}
