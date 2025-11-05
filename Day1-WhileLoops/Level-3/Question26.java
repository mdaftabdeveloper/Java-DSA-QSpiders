public class Question26 {
    public static void main(String[] args) {
        String str = "abccba";
        System.out.println(new Question26().isPalindrome(str));
    }

    boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
