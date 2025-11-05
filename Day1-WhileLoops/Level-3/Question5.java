
public class Question5 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();
        Question5 q = new Question5();
        System.out.println("Biggest digit is: " + q.getBiggestDigit(number));
    }

    int getBiggestDigit(int number) {
        int biggestDigit = 0;
        while (number != 0) {
            int rem = number % 10;
            if (rem >= biggestDigit)
                biggestDigit = rem;
            number /= 10;
        }
        return biggestDigit;
    }
}
