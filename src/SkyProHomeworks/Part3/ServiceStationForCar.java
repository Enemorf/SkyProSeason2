package SkyProHomeworks.Part3;

public class ServiceStationForCar implements ServiceStation
{
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышки машины");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }
}
