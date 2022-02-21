//WAP TO CHECK WHETHER A NUM IS NEGATIVE,POSITIVE OR ZERO//
import java.util.*;
class negposzero
{
    public static void main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any numbers: ");
        num=sc.nextInt();
        if(num>0)
        {
            System.out.println(" The number is positive");
        }
        else if(num==0)
        {
            System.out.println(" The number is zero");
        }
        else
        {
            System.out.println(" The number is negative");
        }
        
    }
}