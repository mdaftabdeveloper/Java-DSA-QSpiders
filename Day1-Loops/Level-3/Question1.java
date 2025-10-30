
public class Question1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();
        Question1 q = new Question1();
        q.printNumber(number);
    }

    void printNumber(int number) {
        while (number != 0) {
            int rem = number % 10;
            System.out.println(rem);
            number /= 10;
        }
    }

}
