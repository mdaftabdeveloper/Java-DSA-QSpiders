public class Question23 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        System.out.println("Result is: " + new Question23().checkPalindrome(number));
    }

    boolean checkPalindrome(int number) {
        return reverseNumber(number) == number ? true : false;
    }

    int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int rem = number % 10;
            reversedNumber = 10 * reversedNumber + rem;
            number /= 10;
        }
        return reversedNumber;
    }
}
