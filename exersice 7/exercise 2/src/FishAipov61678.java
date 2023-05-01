

public class FishAipov61678 extends Main {
    public FishAipov61678() {
        super();
    }

    public FishAipov61678( String name , int age, double weight) {
        super(name, age, weight);
    }

    public FishAipov61678(String name) {
        super(name, 0, 0.0);
    }

    @Override
    public void eatAipov61678() {
        System.out.println("The fish is eating.");
    }

    @Override
    public String getVoiceAipov61678() {
        return "The fish is silent.";
    }
}