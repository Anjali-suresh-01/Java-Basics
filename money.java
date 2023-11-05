import java.util.Scanner;
public class money {
public static void main(String[] args){
 Scanner in = new Scanner(System.in);
System.out.println("Enter the amount in rupees: ");
double rupees = in.nextDouble();
double usd = rupees / 74.75;
System.out.println("The amount in USD is: " + usd);


    }
}

