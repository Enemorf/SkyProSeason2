package SkyProHomeworks.Part2;

import java.util.Random;

public class Part2Main {
    public static void main(String[] args)
    {
        Random rand = new Random();
        Gryffindor[] gryffindors = new Gryffindor[]
                {
                        new Gryffindor("Гарри Поттер",rand.nextInt(101),rand.nextInt(101),
                                rand.nextInt(101),rand.nextInt(101),rand.nextInt(101)),
                        new Gryffindor("Гермиона Грейнджер",rand.nextInt(101),rand.nextInt(101),
                                rand.nextInt(101),rand.nextInt(101),rand.nextInt(101)),
                        new Gryffindor("Рон Уизли",rand.nextInt(101),rand.nextInt(101),
                                rand.nextInt(101),rand.nextInt(101),rand.nextInt(101)),
                };
        Hufflepuff[] hufflepuffs = new Hufflepuff[]
                {
                        new Hufflepuff("Захария Смит",rand.nextInt(101),rand.nextInt(101),
                                rand.nextInt(101),rand.nextInt(101),rand.nextInt(101)),
                        new Hufflepuff("Седрик Диггори",rand.nextInt(101),rand.nextInt(101),
                                rand.nextInt(101),rand.nextInt(101),rand.nextInt(101)),
                        new Hufflepuff("Джастин Финч-Флетчли",rand.nextInt(101),rand.nextInt(101),
                                rand.nextInt(101),rand.nextInt(101),rand.nextInt(101)),
                };
        Ravenclaw[] ravenclaws = new Ravenclaw[]
                {
                        new Ravenclaw("Чжоу Чанг",rand.nextInt(101),rand.nextInt(101),
                                rand.nextInt(101),rand.nextInt(101),rand.nextInt(101),rand.nextInt(101)),
                        new Ravenclaw("Падма Патил",rand.nextInt(101),rand.nextInt(101),
                                rand.nextInt(101),rand.nextInt(101),rand.nextInt(101),rand.nextInt(101)),
                        new Ravenclaw("Маркус Белби",rand.nextInt(101),rand.nextInt(101),
                                rand.nextInt(101),rand.nextInt(101),rand.nextInt(101),rand.nextInt(101)),
                };
        Slytherin[] slytherins = new Slytherin[]
                {
                        new Slytherin("Драко Малфой",rand.nextInt(101),rand.nextInt(101),
                                rand.nextInt(101),rand.nextInt(101),rand.nextInt(101),
                                rand.nextInt(101),rand.nextInt(101)),
                        new Slytherin("Грэхэм Монтегю",rand.nextInt(101),rand.nextInt(101),
                                rand.nextInt(101),rand.nextInt(101),rand.nextInt(101),
                                rand.nextInt(101),rand.nextInt(101)),
                        new Slytherin("Грегори Гойл",rand.nextInt(101),rand.nextInt(101),
                                rand.nextInt(101),rand.nextInt(101),rand.nextInt(101),
                                rand.nextInt(101),rand.nextInt(101)),
                };

        //Примеры команд

        //1 Вывод информации ученика
        System.out.println(gryffindors[0].printStudent());

        //2 Сравнение учеников одного факультета
        System.out.println(Hogwarts.checkParam(hufflepuffs[1], hufflepuffs[2]));

        //3 Сравнение мощи учеников
        System.out.println(Hogwarts.checkPower(ravenclaws[1], slytherins[0]));


    }
}
