public class Question21 {
    public static void main(String[] args) {
        int number = 1248;
        System.out.println("Divisibility count: " + new Question21().countDivisibility(number));
    }

    // count divisibility
    int countDivisibility(int number) {
        int count = 0;
        int originalNumber = number;
        while (number > 0) {
            int rem = number % 10;
            if (originalNumber % rem == 0) {
                count++;
            }
            number = number / 10;
        }
        return count;
    }
}
