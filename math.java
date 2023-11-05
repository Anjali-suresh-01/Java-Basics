import java.util.Scanner;
public class math {
public static void main(String[]args) {
Scanner in = new Scanner(System.in);

int num1 = in.nextInt();
int num2 = in.nextInt();
String operator = in.next();

int result;

        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = num1 / num2;
        } else {
            System.out.println("Invalid operator");
            return;
        }

        System.out.println("Result: " + result);
}
}
