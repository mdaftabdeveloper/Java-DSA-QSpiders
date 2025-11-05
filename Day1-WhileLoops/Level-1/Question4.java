import java.util.Scanner;

public class Question4 {
    int findSquareSum(int n) {
        int result = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0)
                result += i * i;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range: ");
        int n = sc.nextInt();
        sc.close();
        Question4 q = new Question4();
        System.out.println("Sum of square of numbers: " + q.findSquareSum(n));

    }
}
