// WAJP to accept two numbers from user and print power of a to b.

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = sc.nextInt();
        sc.close();
        Question20 q = new Question20();
        System.out.println("Power: " + q.findPower(base, exp));

    }

    int findPower(int base, int exp) {
        int result = 1;
        int i = 1;
        while (i <= exp) {

        }
        return result;
    }
}
