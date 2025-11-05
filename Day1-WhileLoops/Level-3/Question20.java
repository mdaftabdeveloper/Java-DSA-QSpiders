public class Question20 {
    public static void main(String[] args) {
        int number = 38;
        System.out.println("Result: " + new Question20().addDigits(number));
    }

    public int addDigits(int num) {
        int digitCount = countDigits(num);
        while (digitCount >= 1) {
            int result = getSum(num);
            num = result;
            digitCount--;
        }

        return num;
    }

    public int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }

    public int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
