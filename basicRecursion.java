//basic recurssion
import java.util.*;
import java.util.Scanner;

public class Main{
    static int count=0;
    public static void print(){
        if(count==3)
        {
            return;
        }
        System.out.println(count);
        
        count = count+1;
        print();
    }
    public static void main(String[] args){
        print();
    }
}
