import java.util.Scanner;
public class simplein {
public static void main(String[]args) {
Scanner in  = new Scanner(System.in);
float p =in.nextInt();
float t =in.nextInt();
float r =in.nextInt();
float si;
    si  = (p*r*t)/100; 
System.out.println("simple interest is " +si);
}
}
