import java.util.*;
import java.util.Scanner;
import java.util.Scanner.*;
class fizzbuzz
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++)                                
        {
            if (i%15==0)                                                
                System.out.println("fizzbuzz");
            else if (i%5==0)    
                System.out.println("buzz");
            else if (i%3==0)    
                System.out.println("fizz");
                
            else
                System.out.println(i);                                
        }
    }
}
