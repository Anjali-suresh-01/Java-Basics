public class palindrome {
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert the string to lowercase for case-insensitive comparison
        str = str.replaceAll("\\s", "").toLowerCase();
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String input = "racecar"; // Change this to the string you want to check
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}

