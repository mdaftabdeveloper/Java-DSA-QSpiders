// WAJP to accept an input from user and print factorial of that number.

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        Question19 q = new Question19();
        System.out.println("Factorial = " + q.findFactorial(n));
    }

    int findFactorial(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }
}
