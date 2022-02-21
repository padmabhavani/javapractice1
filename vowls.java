//wap to input any alphabet and check whether it is vowls or consonant//
import java.util.*;
class vowls
{
    public static void main(String[] args)
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any alphabet: ");
        ch = sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        System.out.println("These are vowls");
        else
        System.out.println("These are consonents");
    
    }
}