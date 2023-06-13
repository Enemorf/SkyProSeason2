package SkyProHomeworks.Part3;

public interface CheckTrailer
{
    default void checkTrailer()
    {
        System.out.println("Проверяем прицеп");
    }
}
