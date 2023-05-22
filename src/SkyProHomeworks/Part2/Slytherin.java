package SkyProHomeworks.Part2;

public class Slytherin extends Hogwarts {

    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;


    public Slytherin(String name, int magicPower, int transgressionDistance, int trick, int determination, int ambition,
                     int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getParamSum()
    {
        return trick + determination + ambition + resourcefulness + lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public String printStudent()
    {
        return toString() +
                "Факультет: СЛИЗЕРИН \n"+
                "Хитрость: " + getTrick() + "\n" +
                "Решительность: " + getDetermination() + "\n"+
                "Амбициозность: " + getAmbition() +"\n"+
                "Находчивость: " + getResourcefulness() +"\n"+
                "Жажда власти: " + getLustForPower() +"\n"+
                "---";
    }
}
