package SkyProHomeworks.Part3;

public abstract class Transport
{
    private String modelName;
    private int wheelsCount;

    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public Transport(String modelName, int wheelsCount)
    {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void service()
    {
        System.out.println("Обслуживаем: " + modelName);
        for(int i = 0; i < wheelsCount; i++)
        {
            updateTyre();
        }
    }
    private void updateTyre()
    {
        System.out.println("Меняем покрышку");
    }

}
