// write a program to print a day of week name using switch case//
import java.util.*;
class weeknamebyusingswitch
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("enter the number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thusday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
            System.out.println("invalid day");
            break;
            
        }
    }
}