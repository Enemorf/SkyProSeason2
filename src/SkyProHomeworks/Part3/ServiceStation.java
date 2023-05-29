package SkyProHomeworks.Part3;

interface ServiceStation
{
    default void printProcess(Auto auto)
    {
        System.out.println("Обслуживаем: " + auto.getModelName());
        for (int i = 0; i < auto.getWheelsCount(); i++)
        {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
        System.out.println("---\n");
    }

    void updateTyre();
    default void checkEngine()
    {
    }
    default void checkTrailer()
    {
    }
}
