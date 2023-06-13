package SkyProHomeworks.Part3;

public class Car extends Transport implements CheckEngine
{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void service() {
        super.service();
        checkEngine();
        System.out.println("---\n");
    }
}
