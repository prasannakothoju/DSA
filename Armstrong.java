// Armstrong Numbers

import java.util.*;
import java.util.Scanner;

public class Main {
    
    public static boolean arm(int n) {
        int sum = 0;
        int org = n; // storing the original number
        while (n > 0) {
            int lastdigit = n % 10;
            sum = sum + (lastdigit * lastdigit * lastdigit);
            n = n / 10;
        }
        if (org == sum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The given no is Armstrong: " + arm(a));
    }
}
