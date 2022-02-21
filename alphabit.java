//wap to check whether a charcter is alphabit or not//
import java.util.*;
class alphabit
{
    public static void main(String[] args)
    {
        char ch ;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character is: ");
        ch = sc.next().charAt(0);
        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
             System.out.println(ch + " is an alphabet.");
        }
        else
        {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}