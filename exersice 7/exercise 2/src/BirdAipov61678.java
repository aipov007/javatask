public class BirdAipov61678 extends Main {
    public BirdAipov61678() {
        super();
    }

    public BirdAipov61678(String name, int age, double weight) {
        super(name, age, weight);
    }

    public BirdAipov61678(String name) {
        super(name, 0, 0.0);
    }

    @Override
    public void eatAipov61678() {
        System.out.println("The bird is eating.");
    }

    @Override
    public String getVoiceAipov61678() {
        return "The bird is making a sound.";
    }
}
