import factories.*;
import interfaces.IVehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Транспорт таңдаңыз:");
        System.out.println("1 - Car");
        System.out.println("2 - Motorcycle");
        System.out.println("3 - Truck");
        System.out.println("4 - Bus");

        int choice = sc.nextInt();
        sc.nextLine();

        VehicleFactory factory = null;

        switch (choice) {
            case 1:
                System.out.print("Марка: ");
                String brand = sc.nextLine();
                System.out.print("Модель: ");
                String model = sc.nextLine();
                System.out.print("Жанармай түрі: ");
                String fuel = sc.nextLine();

                factory = new CarFactory(brand, model, fuel);
                break;

            case 4:
                System.out.print("Жолаушы саны: ");
                int passengers = sc.nextInt();
                System.out.print("Қалалық па? (true/false): ");
                boolean cityBus = sc.nextBoolean();

                factory = new BusFactory(passengers, cityBus);
                break;
        }

        if (factory != null) {
            IVehicle vehicle = factory.createVehicle();
            vehicle.drive();
            vehicle.refuel();
        }
    }
}
