 public class Main {
    public static void main(String[] args) {
                try {
                   int[] arr = {1, 2, 3};
                   int index = Integer.parseInt(args[0]);
                   if (index < 0 || index >= arr.length) {
                       throw new ArrayIndexOutOfBoundsException();
                   }
                   int result = 10 / index;
                   System.out.println("Result: " + result);
               } catch (ArithmeticException e) {
                   System.out.println("Caught ArithmeticException: " + e.toString());
               } catch (ArrayIndexOutOfBoundsException e) {
                   System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.toString());
               } finally {
                   System.out.println("Finally block executed.");
               }
            }
        }
