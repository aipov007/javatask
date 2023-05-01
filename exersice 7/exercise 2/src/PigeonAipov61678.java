
public class PigeonAipov61678 extends FishAipov61678 {
    public PigeonAipov61678() {
        super();
    }

    public PigeonAipov61678(String name, int age, double weight) {
        super(name, age, weight);
    }

    public PigeonAipov61678(String name) {
        super(name, 0, 0.0);
    }

    public void Pigeon() {
        System.out.println("The Pigeon is cooing");
    }

    @Override
    public void eatAipov61678() {
        System.out.println("The Pigeon is pecking.");
    }

    @Override
    public String getVoiceAipov61678() {
        return "The Pigeon is cooing ";
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
