package SkyProHomeworks.Part2;

public class Ravenclaw extends Hogwarts
{
    private int smart;
    private int wisdom;
    private int wit;
    private int creativity;


    public Ravenclaw(String name, int magicPower, int transgressionDistance, int smart, int wisdom, int wit,
                     int creativity) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getParamSum() {
        return smart + wisdom + wit + creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public String printStudent()
    {
        return toString() +
                "Факультет: КОГТЕВРАН \n"+
                "Ум: " + getSmart() + "\n" +
                "Мудрость: " + getWisdom() + "\n"+
                "Остроумие: " + getWit() +"\n"+
                "Творчество: " + getCreativity() +"\n"+
                "---";
    }
}
