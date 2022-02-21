//  WAP to count total number of notes in given amount//
import java.util.*;
class countnotes
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        n=sc.nextInt();
        int notes=0;
        if (n>=2000)
        {
            notes=n/2000;
            n=n%2000;
        }
        if(n>=500){
            notes=notes+(n/500);
            n=n%500;
        }
        if(n>=200){
            notes=notes+(n/200);
            n=n%200;
        }
        if(n>=100){
            notes=notes+(n/100);
            n=n%100;
        }
        
        
        System.out.println(notes);
    }
}