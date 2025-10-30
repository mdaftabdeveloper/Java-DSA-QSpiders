/* WAJP to print sum of all natural numbers from 1 to 1000.
 * 1 + 2 + 3 + ......+ 1000
*/

import java.util.Scanner;

public class Question1 {
    int findSum(int n) {
        int result = 0;
        int i = 1;
        while (i != n) {
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
        Question1 q = new Question1();
        System.out.println("Sum of " + n + " natural numbers: " + q.findSum(n));

    }
}