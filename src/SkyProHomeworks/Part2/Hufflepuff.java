package SkyProHomeworks.Part2;

public class Hufflepuff extends Hogwarts
{
    private int industriousness;
    private int honesty;
    private int loyalty;
    public Hufflepuff(String name, int magicPower, int transgressionDistance, int industriousness,
                      int honesty, int loyalty) {
        super(name, magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.honesty = honesty;
        this.loyalty = loyalty;
    }
    public int getParamSum()
    {
        return industriousness + honesty + loyalty;
    }
    public int getIndustriousness() {
        return industriousness;
    }
    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }
    public int getHonesty() {
        return honesty;
    }
    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public int getLoyalty() {
        return loyalty;
    }
    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }
    public String printStudent()
    {
        return toString() +
                "Факультет: ПУФФЕНДУЙ \n"+
                "Трудолюбие: " + getIndustriousness() + "\n" +
                "Верность: " + getHonesty() + "\n"+
                "Честность: " + getLoyalty() +"\n"+
                "---";
    }
}
