
public class Question2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();
        Question2 q = new Question2();
        q.printNumber(number);
    }

    void printNumber(int number) {
        while (number != 0) {
            int rem = number % 10;
            if (rem % 2 == 0)
                System.out.println(rem);
            number /= 10;
        }
    }
}
