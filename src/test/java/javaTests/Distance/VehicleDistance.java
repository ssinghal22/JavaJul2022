package javaTests.Distance;

public class VehicleDistance {

    public static void main(String[] args) {
        Vehicle car = new Vehicle(340, 10, 0);
        Vehicle bus = new Vehicle(200, 10, 0);
        int distance = 0;

        while (distance <= 3000) {
            distance = car.travel();
            System.out.println("distance: " + distance);
            if (distance > 3000) {
                break;
            }
            distance = bus.travel();
            System.out.println("distance: " + distance);
            if (distance > 3000) {
                break;
            }
        }

        System.out.println(car.rechargeCount - 1);
        System.out.println(bus.rechargeCount);
    }

}


