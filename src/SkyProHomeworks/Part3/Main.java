package SkyProHomeworks.Part3;

public class Main
{
    public static void main(String[] args) {

        Bicycle[] bicycles = new Bicycle[]{
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };

        Car[] cars = new Car[]{
                new Car("car1", 4),
                new Car("car2", 4)
        };

        Truck[] trucks = new Truck[]{
                new Truck("truck1", 6),
                new Truck("truck2", 8)
        };
        ServiceStation stationForBicycle = new ServiceStationForBicycle();
        getService(stationForBicycle,bicycles);

        ServiceStation stationForCar = new ServiceStationForCar();
        getService(stationForCar,cars);

        ServiceStation stationForTruck = new ServiceStationForTruck();
        getService(stationForTruck,trucks);
    }

    private static void getService(ServiceStation station, Auto[] auto)
    {
        for (Auto value : auto) {
            station.printProcess(value);
        }
    }
}
