package SkyProHomeworks.Part3;

public class ServiceStationForTruck implements ServiceStation
{
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышки грузовика");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
