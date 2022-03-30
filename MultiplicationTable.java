import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args){

        System.out.print("Enter a number: ");
        Scanner readNumber = new Scanner(System.in);

        //will not check whether input is string or integer
        int number = readNumber.nextInt();
        System.out.println();

        for (int i = 1; i<= 10; ++i){

            System.out.printf("%d x %d = %d \n", number, i, number * i);
        }
    }
}
