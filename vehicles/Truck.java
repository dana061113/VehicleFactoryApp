package vehicles;

import interfaces.IVehicle;

public class Truck implements IVehicle {

    private int capacity;
    private int axles;

    public Truck(int capacity, int axles) {
        this.capacity = capacity;
        this.axles = axles;
    }

    @Override
    public void drive() {
        System.out.println("Жүк көлігі " + capacity + " кг жүкпен жүріп барады.");
    }

    @Override
    public void refuel() {
        System.out.println("Ось саны: " + axles);
    }
}
