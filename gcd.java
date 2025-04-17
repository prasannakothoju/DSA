import java.util.*;
import java.util.Scanner;

public class Main {

    public static int gcd(int a , int b){
        while(a > 0 && b > 0){
            if(a > b){
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if(a == 0){
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("GCD of the numbers is: " + gcd(x, y));
    }
}
