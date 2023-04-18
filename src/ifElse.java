import java.util.Scanner;
import java.util.stream.IntStream;


//Given an integer , perform the following conditional actions:
//
//        If  is odd, print Weird
//        If  is even and in the inclusive range of  to , print Not Weird
//        If  is even and in the inclusive range of  to , print Weird
//        If  is even and greater than , print Not Weird
//        Complete the stub code provided in your editor to print whether  is weird.
public class ifElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        IntStream two_five = IntStream.range(20, 30);

        int n = scanner.nextInt();
        if (n % 2 == 1) {
            System.out.println("Weird");

        } else if (n % 2 == 0 && (n>2 && n<5)) {
            System.out.println("Not Weird");

        } else if (n % 2 == 0 && (n > 6 && n < 20)) {
            System.out.println("Weird");

        } else if (n > 20 && n % 2 == 0) {
            System.out.println("Weird");

        }

    }
}
