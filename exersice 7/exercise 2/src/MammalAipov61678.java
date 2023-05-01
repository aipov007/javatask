public class MammalAipov61678 extends Main {
    public MammalAipov61678() {
        super();
    }

    public MammalAipov61678(String name, int age, double weight) {
        super(name, age, weight);
    }

    public MammalAipov61678(String name) {
        super(name, 0, 0.0);
    }

    @Override
    public void eatAipov61678() {
        System.out.println("The mammal is eating.");
    }

    @Override
    public String getVoiceAipov61678() {
        return "The mammal is making a sound.";
    }
}
