public class Dog61678 extends MammalAipov61678 {
    public Dog61678() {
        super();
    }

    public Dog61678(String name, int age, double weight, String furColor) {
        super(name, age, weight);
    }

    public Dog61678(String name) {
        super(name, 0, 0.0);
    }

    public void bark() {
        System.out.println("The dog is barking.");
    }

    @Override
    public void eatAipov61678() {
        System.out.println("The dog is eating.");
    }

    @Override
    public String getVoiceAipov61678() {
        return "The dog is barking.";
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
