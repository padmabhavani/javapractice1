// WAP to input basic salary of an employee and calculate its Gross     salary according to following:
   // Basic Salary <= 10000 : HRA = 20%, DA = 80%
   // Basic Salary <= 20000 : HRA = 25%, DA = 90%
   // Basic Salary > 20000 : HRA = 30%, DA = 95%
import java.util.*;
class salary
{
    public static void main(String args[])
    {
        float bsalary,da1,hra1,da,hra,grosspay;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter basic salary of emp:");
        bsalary=sc.nextFloat();
        System.out.println("enter basic DA of emp:");
        da1=sc.nextFloat();
        System.out.println("enter basic HRA of emp:");
        hra1=sc.nextFloat();
        da=(da1*bsalary)/100;
        hra=(hra1*bsalary)/100;
        grosspay=bsalary+da+hra;
        System.out.println("gross salary of employee:"+grosspay);
    }
}