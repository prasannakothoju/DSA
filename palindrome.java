//palindrome of a number
import java.util.Scanner;
import java.util.*;

public class Main{
    
    public static boolean palindrome(int n){
        int rev =0;
        int original =n;
        while(n>0){
            int lastdigit = n%10;
            rev = rev*10 + lastdigit;
            n = n/10;
        }
        if(original==rev){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("the given no is a palindrome:"+palindrome(a));
    }
}
