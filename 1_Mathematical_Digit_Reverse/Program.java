import java.util.Scanner;

/**
 * Program
 * Given N, reverse the digits of N.
 * 
 * 
 * Example 1:
 * Input: 200
 * Output: 2
 * Explanation: By reversing the digts of
 * number, number will change into 2.
 * 
 * 
 * Example 2:
 * Input : 122
 * Output: 221
 * Explanation: By reversing the digits of
 * number, number will change into 221.
 */

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your digit...........");
        int digit = sc.nextInt();
        int ans = 0;
        while (digit != 0) {

            int num = digit % 10;
            digit = digit / 10;
            ans = ans * 10 + num;

        }
        System.out.println(ans);

    }

}