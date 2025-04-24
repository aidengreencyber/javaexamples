import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Your number is Even!");
        } else {
            System.out.println("Your Number is Odd!");
        }

        scanner.close();
    }
}
