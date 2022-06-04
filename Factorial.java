import java.util.Scanner;

public class Factorial {

    static int factorial(int n) {
        if (n != 0)
            return n * factorial(n - 1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type in a number: ");
        int num = input.nextInt();

        int result = factorial(num);

        System.out.println();
        System.out.println("Factorial of " + num + " is " + result);
    }
}

