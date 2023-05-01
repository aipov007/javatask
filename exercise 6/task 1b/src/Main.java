
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int loopCounter = 0;
        int ifCounter = 0;

        for (int i = 0; i < arr.length; i++) {
            loopCounter++;
            for (int j = 0; j < arr.length; j++) {
                loopCounter++;
                if (arr[i] == arr[j]) {
                    ifCounter++;
                    System.out.println("Element " + arr[i] + " is equal to element " + arr[j]);
                }
            }
        }

        System.out.println("Loop iterations: " + loopCounter);
        System.out.println("If statement iterations: " + ifCounter);
    }
}
