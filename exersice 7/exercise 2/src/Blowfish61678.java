public class Blowfish61678 extends FishAipov61678 {
    public Blowfish61678() {
        super();
    }

    public Blowfish61678(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Blowfish61678(String name) {
        super(name, 0, 0.0);
    }

    public void blowfish() {
        System.out.println("The blowfish can not make sound.");
    }

    @Override
    public void eatAipov61678() {
        System.out.println("The blowfish is eating.");
    }

    @Override
    public String getVoiceAipov61678() {
        return "The blowfish can not make sounds ";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getNameAipov61678() + '\'' +
                ", age=" + getAgeAipov61678() +
            ", weight=" + getWeightAipov61678() +
                '}';
    }
}
