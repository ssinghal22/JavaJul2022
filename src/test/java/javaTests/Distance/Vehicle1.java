//package javaTests.Distance;
//
//public class Vehicle1 {
//    static int distance = 0;
//
//    public static void main(String[] args) {
//        int energy_range = 0;
//        int rechargeTime = 0;
//        int rechargeCount = 0;
//
//        public Vehicle1(int energy_range, int rechargeTime, int rechargeCount) {
//            this.energy_range = energy_range;
//            this.rechargeTime = rechargeTime;
//            this.rechargeCount = rechargeCount;
//        }
//        Vehicle1 car = new Vehicle1(340, 10, 0);
//        Vehicle1 bus = new Vehicle1(200, 10, 0);
//
//        while (distance <= 3000) {
//            VehicleDistance.Vehicle.travel(car);
//            if (distance > 3000) {
//                break;
//            }
//            VehicleDistance.Vehicle.travel(bus);
//            if (distance > 3000) {
//                break;
//            }
//        }
//        System.out.println(car.rechargeCount - 1);
//        System.out.println(bus.rechargeCount);
//    }
//
//    public static class Vehicle {
//        int energy_range = 0;
//        int rechargeTime = 0;
//        int rechargeCount = 0;
//
//        public Vehicle(int energy_range, int rechargeTime, int rechargeCount) {
//            this.energy_range = energy_range;
//            this.rechargeTime = rechargeTime;
//            this.rechargeCount = rechargeCount;
//        }
//
//        public  static void travel(VehicleDistance.Vehicle vehicle) {
//            distance += vehicle.energy_range;
//            ++vehicle.rechargeCount;
//        }
//    }
//}
//
