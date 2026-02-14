package vehicles;

import interfaces.IVehicle;

public class Bus implements IVehicle {

    private int passengerCount;
    private boolean cityBus;

    public Bus(int passengerCount, boolean cityBus) {
        this.passengerCount = passengerCount;
        this.cityBus = cityBus;
    }

    @Override
    public void drive() {
        System.out.println("Автобус " + passengerCount + " жолаушымен жүріп келеді.");
    }

    @Override
    public void refuel() {
        if (cityBus) {
            System.out.println("Қалалық автобус заправка жасады.");
        } else {
            System.out.println("Қалааралық автобус заправка жасады.");
        }
    }
}
