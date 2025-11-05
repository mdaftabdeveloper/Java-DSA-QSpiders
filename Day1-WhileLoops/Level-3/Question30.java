public class Question30 {
    public static void main(String[] args) {
        System.out.println("Binary = " + new Question30().covertToBinary(20));
    }

    String covertToBinary(int number) {
        String binary = "";
        while (number > 0) {
            int bit = number % 2;
            binary = bit + binary;
            number /= 2;
        }
        return binary;
    }
}
