import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String first ;
        String second ;
        System.out.print("please enter first string: ");
        first = input.nextLine();
        System.out.print("please enter second string: ");
        second = input.nextLine();

        String firstconcat = first.concat(second);
        String secondconcat = second.concat(first);

        if(firstconcat.equals(secondconcat)){

            System.out.println("concat equal");

        }else {
            System.out.println("concatted ");

        }


    }
}