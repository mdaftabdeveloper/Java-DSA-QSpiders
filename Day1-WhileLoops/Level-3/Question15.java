
public class Question15 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();
        Question15 q = new Question15();
        System.out.println("Sum of digits: " + q.sumOfDigits(number));
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

    int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int rem = number % 10;
            sum += rem;
            number /= 10;
        }
        return sum;
    }
}
