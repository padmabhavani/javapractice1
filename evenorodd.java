//WAP TO CHECK WHETHER A NUMBER IS EVEN OR ODD//
import java.util.*;
class evenorodd
{
    public static void main(String []args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any numbers is: ");
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("The given number is even");
        }
        else
        {
            System.out.println("The given number is odd");
        }
    }
    
}