package SkyProHomeworks.Part2;

public class Gryffindor extends Hogwarts
{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor (String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery)
    {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public int getParamSum()
    {
        return nobility + honor + bravery;
    }
    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public String printStudent()
    {
        return toString() +
                "Факультет: ГРИФФИНДОР \n"+
                "Благородство: " + getNobility() + "\n" +
                "Честь: " + getHonor() + "\n"+
                "Храбрость: " + getBravery() +"\n"+
                "---";
    }
}
