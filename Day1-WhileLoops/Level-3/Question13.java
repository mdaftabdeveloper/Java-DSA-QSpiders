
public class Question13 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();
        Question13 q = new Question13();
        q.printDigit(number);
    }

    // count the digits
    int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    void printDigit(int number) {
        int digitCount = countDigits(number);
        while (digitCount != 0) {
            int digit = (int) (number / (Math.pow(10, digitCount - 1))) % 10;
            System.out.println(digit);
            digitCount--;
        }

    }

}
