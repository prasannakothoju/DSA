//counting digits in a number

import java.util.*;
import java.util.Scanner;

public class Main{
    
    //creating a function for counting digits
    public static int countDigits(int n){
        int count =0; //counter for counting digits
        while(n>0){
            int lastdigit= n%10;  //for every extraction counter will be incremented
            count = count+1;
            n = n/10;
            
        }
        return count;
    }
    
    //main function for printing digits
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       
       int res = countDigits(a);
       System.out.println("no of digits:"+res);
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


public class Main{

public static int countdigits(int n){
    if(n==0) return 1;
    return(int)(Math.log10(n)+1);
     }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println("no of digits:"+countdigits(a));
}
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    

