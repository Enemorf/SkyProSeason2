package SkyProHomeworks.Part2;

public class Hogwarts
{
   private String name;
   private int magicPower;
   private int transgressionDistance;
   private int paramSum;

   public Hogwarts (String name, int magicPower, int transgressionDistance)
   {
      this.name = name;
      this.magicPower = magicPower;
      this.transgressionDistance = transgressionDistance;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getMagicPower() {
      return magicPower;
   }

   public void setMagicPower(int magicPower) {
      this.magicPower = magicPower;
   }

   public int getTransgressionDistance() {
      return transgressionDistance;
   }

   public void setTransgressionDistance(int transgressionDistance) {
      this.transgressionDistance = transgressionDistance;
   }
   public void setParamSum(int paramSum) {
      this.paramSum = paramSum;
   }

   public int getPower()
   {
      return getMagicPower() + getTransgressionDistance();
   }
   @Override
   public String toString() {
      return "Личная карточка студента: " + getName() + "\n" +
              "Сила магии: " + getMagicPower() + "\n"+
              "Расстояние трансгресии: " + getTransgressionDistance() +"\n";
   }

   public static String checkPower(Hogwarts student1, Hogwarts student2)
   {
      return ((student1.getPower() > student2.getPower() ?
              student1.getName()+"("+student1.getPower()+")"+" обладает бОльшей мощностью, чем "+student2.getName()+
                      "("+student2.getPower()+")" :
              student2.getName()+"("+student2.getPower()+")"+" обладает бОльшей мощностью, чем " + student1.getName()
              +"("+student1.getPower()+")"))+ "\n---";
   }
   public static String checkParam (Gryffindor student1, Gryffindor student2)
   {
      return ((student1.getParamSum() >= student2.getParamSum()) ? student1.getName() +"("+student1.getParamSum()+")"+
              " лучший гриффиндорец, чем " + student2.getName()+"("+student2.getParamSum()+")" :
              student2.getName() +"("+student2.getParamSum()+")" + " лучший гриффиндорец, чем " + student1.getName()+
              "("+student1.getParamSum()+")") + "\n---";
   }
   public static String checkParam (Hufflepuff student1, Hufflepuff student2)
   {
      return ((student1.getParamSum() >= student2.getParamSum()) ? student1.getName() +"("+student1.getParamSum()+")"+
              " лучший пуффендуец, чем " + student2.getName()+"("+student2.getParamSum()+")" :
              student2.getName() +"("+student2.getParamSum()+")" + " лучший пуффендуец, чем " + student1.getName()+
                      "("+student1.getParamSum()+")")+ "\n---";
   }
   public static String checkParam (Ravenclaw student1, Ravenclaw student2)
   {
      return ((student1.getParamSum() >= student2.getParamSum()) ? student1.getName() +"("+student1.getParamSum()+")"+
              " лучший когтевранец, чем " + student2.getName()+"("+student2.getParamSum()+")" :
              student2.getName() +"("+student2.getParamSum()+")" + " лучший когтевранец, чем " + student1.getName()+
                      "("+student1.getParamSum()+")")+ "\n---";
   }
   public static String checkParam (Slytherin student1, Slytherin student2)
   {
      return ((student1.getParamSum() >= student2.getParamSum()) ? student1.getName() +"("+student1.getParamSum()+")"+
              " лучший слизеринец, чем " + student2.getName()+"("+student2.getParamSum()+")" :
              student2.getName() +"("+student2.getParamSum()+")" + " лучший слизеринец, чем " + student1.getName()+
                      "("+student1.getParamSum()+")")+ "\n---";
   }
}
