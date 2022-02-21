//WAP TO FIND MAXIMUM BETWEEN TWO NUMBWRS//
import java.util.*;
class maxnum
{
    public static void main(String []args){
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any two numbers: ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        int Maxnum;
        if(n1>n2)
        {
           System.out.println(n1+ "is maxmum number");
        }
        else
        {
            System.out.println(n2+ "is maximun number");
        }
        
        
    }
}