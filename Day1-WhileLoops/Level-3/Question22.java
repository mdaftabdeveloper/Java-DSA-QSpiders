public class Question22 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        System.out.println("Reversed number: " + new Question22().reverseNumber(number));
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
