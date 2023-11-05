public class ArmstrongNumber {
public static void main(String[] args) {
        int start = 1; // Start of the range
        int end = 1000; // End of the range

        for (int number = start; number <= end; number++) {
            if (isArmstrong(number)) {
                System.out.println(number + " is an Armstrong number.");
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0;
        int n = String.valueOf(num).length();

        originalNum = num;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        return num == result;
    }
}

