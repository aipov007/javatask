

// Main.java
public class Main {
    public static void main(String[] args) {
        TrafficLightSimulator simulator = new TrafficLightSimulator(TrafficLight.RED);
        for (int i = 0; i < 10; i++) {
            simulator.changeColor(simulator.currentLight);
            System.out.println(simulator.toString());
        }
    }
}