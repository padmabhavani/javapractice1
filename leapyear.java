//WAP TO CHECK WHETHER A YEAR IS LEAP YEAR OR NOT//
import java.util.*;
class leapyear
{
    public static void main(String []args){
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the given year: ");
        year=sc.nextInt();
        if (year % 4 == 0){
             System.out.println("Specified year is a leap year");
        }
        else
        {
         System.out.println("Specified year is not a leap year");
            
        }
    }
}
