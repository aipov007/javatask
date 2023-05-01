
public abstract class Main {


    private String name;
    private int age;
    private double weight;



    public Main()
    {

    }


    {
        this.name = "unnamed";
        this.age = 0;
        this.weight = 0.0;
    }

    public Main(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getNameAipov61678() {
        return name;
    }

    public void setNameAipov61678(String name) {
        this.name = name;
    }

    public int getAgeAipov61678() {
        return age;
    }

    public void setAgeAipov61678(int age) {
        this.age = age;
    }

    public double getWeightAipov61678() {
        return weight;
    }

    public void setWeightAipov61678(double weight) {
        this.weight = weight;
    }

    public abstract void eatAipov61678();

    public abstract String getVoiceAipov61678();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';





    }

}