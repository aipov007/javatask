public class TrafficLightSimulator {
    TrafficLight currentLight;

    public TrafficLightSimulator(TrafficLight initialLight) {
        currentLight = initialLight;
    }

    public void changeColor(TrafficLight color) {
        switch (color) {
            case RED:
                currentLight = TrafficLight.GREEN;
                break;
            case YELLOW:
                currentLight = TrafficLight.RED;
                break;
            case GREEN:
                currentLight = TrafficLight.YELLOW;
                break;
            default:
                System.out.println("Invalid color!");
                break;
        }
    }

    @Override
    public String toString() {
        return "Current light: " + currentLight;
    }
}
