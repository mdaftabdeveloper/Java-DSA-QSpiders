public class Question25 {
    public static void main(String[] args) {
        String str = "Racecar";
        System.out.println(new Question25().isPalindrome(str));
    }

    boolean isPalindrome(String str) {
        return reverseString(str).equalsIgnoreCase(str);
    }

    String reverseString(String str) {
        String reversedString = "";
        char[] charStr = str.toCharArray();
        for (int i = charStr.length - 1; i >= 0; i--) {
            reversedString = reversedString + charStr[i];
        }
        return reversedString.toLowerCase();
    }
}
