import java.util.Scanner;

public class Scholarship {
    public static void main (String[] args) {
        System.out.println("Hello, we will determine your scholarship eligibility based on your responses!");
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your GPA: ");
        double number = scanner.nextDouble();


        System.out.println("Enter the number of extracurricular activities: ");
        double number2 = scanner.nextDouble();

        System.out.println("Enter the number of service activities: ");
        double number3 = scanner.nextDouble();

        if (number >= 3.8 && number2 >= 1 && number3 >= 1){
            System.out.println("Scholarship candidate!");
        } 
        else if (number >= 3.4 && number < 3.8 && number2 + number3 >= 3){
            System.out.println("Scholarship candidate!");
        } 
        else if (number >= 3.0 && number < 3.4 && number2 >= 2 && number3 >= 3){
            System.out.println("Scholarship candidate!");
        } else {
            System.out.println("Not a candidate.");
        }
        scanner.close();
    }
}
