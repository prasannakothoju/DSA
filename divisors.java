// print all divisors

import java.util.*;
import java.util.Scanner;

public class Main {

    public static void divisors(int n) {
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i+ " ");
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Divisors of given number:");
        divisors(a);
    }
}
