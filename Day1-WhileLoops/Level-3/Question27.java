public class Question27 {
    public static void main(String[] args) {
        System.out.println("Bits Count: " + new Question27().countBits(20));
    }

    int countBits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 2;
        }
        return count;
    }
}