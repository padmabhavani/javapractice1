// wap to check whether a charcter is uppercase or lowercase alphabet//
import java.util.*;
class upperorlowercase
{
    public static void main(String[] args)
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the alphabet is: ");
        ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z') 
        System.out.println(ch+ "alphabet is Uppercase");
        if(ch >= 'a' && ch <= 'z') 
        System.out.println(ch+ "alphabet is lowercase");
        else
        System.out.println( "not");
        
    }
}