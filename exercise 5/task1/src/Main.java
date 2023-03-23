public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        // classic for loop to fill the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1 - 1;
        }
        int x = 9;

        for (int number : numbers) {
            System.out.println( "array["+ x-- + "]  "+ number  );
        }
    }
}