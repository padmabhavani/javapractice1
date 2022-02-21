//WAP TO CHECK WHETHER A NUMBER IS DIVISIBLE 5 AND 11 OR NOT//
import java.util.*;
class divisible5or11
{
    public static void main(String []args){
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any numbers is divisible by 5 and 11 is: ");
        number=sc.nextInt();
        if((number % 5 == 0) && (number % 11 == 0))
		{
			System.out.println("\n Given number " + number + " is Divisible by 5 and 11"); 
		}
		else
		{
			System.out.println("\n Given number " + number + " is Not Divisible by 5 and 11"); 
		}	
    }
}