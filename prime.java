// Prime numbers
// Divisible by 1 and itself — has exactly 2 factors

import java.util.Scanner;

public class Main {

    public static boolean prime(int n) {
        int count = 0; // counter for counting factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
       if(count==2){
           return true;
       }
       else{
           return false;
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Given no is prime: " + prime(a));
    }
}
