import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter second number: ");
        int num2 = in.nextInt();

        int largest;

        if (num1 > num2) {
            largest = num1;
        } else {
            largest = num2;
        }

        System.out.println("The largest number is: " + largest);
    }
}
