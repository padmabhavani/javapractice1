//wap to input any charcter and check whether it is alphabit,digit or special character//
import java.util.*;
class alphbetdigitspecial
{
    public static void main(String []args)
    {
         char ch ;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character is: ");
        ch = sc.next().charAt(0);
        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        System.out.println(ch + " is an alphabet.");
        else if(ch >= '0' && ch <= '9')
        System.out.println(ch + " is an Digits.");
        else
        System.out.println(ch + " is an Special charcater.");
    }
}