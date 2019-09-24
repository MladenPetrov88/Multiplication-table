import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int multiply = 0;
        for (int i = 1; i <= 10 ; i++) {
            multiply = number * i;
            System.out.printf("%d X %d = %d%n", number, i, multiply);
        }
    }
}
