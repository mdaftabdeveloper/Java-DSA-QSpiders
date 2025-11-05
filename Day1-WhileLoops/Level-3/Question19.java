public class Question19 {
    public int subtractProductAndSum(int n) {
        int result = getProduct(n) - getSum(n);
        return result;
    }

    public int getProduct(int n) {
        int product = 1;
        while (n != 0) {
            int rem = n % 10;
            product = product * rem;
            n = n / 10;
        }
        return product;
    }

    public int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        sc.close();
        System.out.println("Difference of product and Sum is : " + new Question19().subtractProductAndSum(number));
    }
}
