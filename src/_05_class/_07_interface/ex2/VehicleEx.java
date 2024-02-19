package _05_class._07_interface.ex2;

public class VehicleEx {
    public static void main(String[] args) {
        // Vehicle 배열 생성
        Vehicle[] vehicles = new Vehicle[2];

        // Car 객체 생성 및 배열에 저장
        Car car = new Car("자동차", 100);
        vehicles[0] = car;

        // Airplane 객체 생성 및 배열에 저장
        Airplane airplane = new Airplane("비행기", 500);
        vehicles[1] = airplane;

        // 배열을 순회하면서 move() 메서드 호출
        for (Vehicle vehicle : vehicles) {
            System.out.printf("\n=== %s Vehicle 정보 ===\n", vehicle.getName());
            vehicle.move();
            // ((Car)vehicle).test();

            System.out.println(vehicle instanceof Flyable);
            // Flyable 구현한 경우 fly() 메서드 호출
            // vehicles[0] vehicles[1]
            if(vehicle instanceof Flyable) { // car, airplane
                ((Airplane) vehicle).fly(); // 명시적 형변환
            }
        }
    }
}
