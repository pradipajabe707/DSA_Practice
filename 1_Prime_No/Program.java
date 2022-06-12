import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number ...........:");
        int num = sc.nextInt();
        int counter = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                counter++;
                break;
            }
        }
        if (counter > 0) {
            System.out.println("GIven num is not prime");
        } else {
            System.out.println("Given num is prime");
        }

    }

}
