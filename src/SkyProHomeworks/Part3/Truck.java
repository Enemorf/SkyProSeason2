package SkyProHomeworks.Part3;

public class Truck extends Transport implements CheckEngine,CheckTrailer
{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void service() {
        super.service();
        checkEngine();
        checkTrailer();
        System.out.println("---\n");
    }
}
