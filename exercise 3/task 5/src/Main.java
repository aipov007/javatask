public class Main {
    public static void main(String[] args) {
        int count = 1;
        int min = 100;
        int max = 1;

        while (count <= 10) {
            int randNum = (int) (Math.random() * 100) + 1;
            if (randNum < min) {
                min = randNum;
            }
            if (randNum > max) {
                max = randNum;
            }
            count++;
        }

        System.out.println("The minimum number is: " + min);
        System.out.println("The maximum number is: " + max);

    }
}