package SkyProHomeworks.Part3;

public class Auto
{
    String modelName;
    int wheelsCount;

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public Auto (String modelName, int wheelsCount)
    {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
}
