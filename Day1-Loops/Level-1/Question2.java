import java.util.Scanner;

public class Question2 {
    int findEvenSum(int n) {
        int result = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0)
                result += i;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range: ");
        int n = sc.nextInt();
        sc.close();
        Question2 q = new Question2();
        System.out.println("Sum of even numbers: " + q.findEvenSum(n));

    }
}
