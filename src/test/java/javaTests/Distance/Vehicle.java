package javaTests.Distance;

public class Vehicle {
    int energy_range = 0;
    int rechargeTime = 0;
    int rechargeCount = 0;
    static int distance = 0;

    public Vehicle(int energy_range, int rechargeTime, int rechargeCount) {
        this.energy_range = energy_range;
        this.rechargeTime = rechargeTime;
        this.rechargeCount = rechargeCount;
    }

    public int travel() {
        if (distance <= 3000) {
            System.out.println(energy_range);
            distance += energy_range;
            ++rechargeCount;
        }
        return distance;
    }
}
