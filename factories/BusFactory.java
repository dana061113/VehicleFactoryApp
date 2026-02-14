package factories;

import interfaces.IVehicle;
import vehicles.Bus;

public class BusFactory extends VehicleFactory {

    private int passengers;
    private boolean cityBus;

    public BusFactory(int passengers, boolean cityBus) {
        this.passengers = passengers;
        this.cityBus = cityBus;
    }

    @Override
    public IVehicle createVehicle() {
        return new Bus(passengers, cityBus);
    }
}
