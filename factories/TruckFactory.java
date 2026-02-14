package factories;

import interfaces.IVehicle;
import vehicles.Truck;

public class TruckFactory extends VehicleFactory {

    private int capacity;
    private int axles;

    public TruckFactory(int capacity, int axles) {
        this.capacity = capacity;
        this.axles = axles;
    }

    @Override
    public IVehicle createVehicle() {
        return new Truck(capacity, axles);
    }
}
