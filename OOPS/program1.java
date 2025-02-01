#factorial a part
import java.util.*;
public class factorial{
    public static int fact(int n){
        int f=1;
        for( int i = 1;i<=n; i++)
        {
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        System.out.println("The Factorial of "+a+" is : "+fact(a));
    }
}

#fibnoacci b part
import java.util.*;

public class fibnoacci {
    public void  calcu(int n){
        int a =0,b=1,c,count=0;
        while(count<n){
            System.out.print(a+",");
            c = a + b;
            a = b;
            b = c;
            count+=1;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the limit : ");
        int n = sc.nextInt();
        fibnoacci fb = new fibnoacci();
        System.out.println("Fibonacci numbers are: ");
        fb.calcu(n);
    }
}

#multipilcation c part

  import java.util.*;

public class multi {
   public static void calcu(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n +"*"+ i + " = "+ n*i);
        }
   }
   public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    calcu(n);
   }
}

# promw number d part

import java.util.*;

public class prime {
    public void calcu(int n){
        int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%i == 0)
            {
                flag = 1;
            }
        }
        if(flag == 1)
        {
            System.out.println(n +" is Not prime number");
        }
        else{
            System.out.println(n +" is a prime number");
        }
   }
   public static void main(String[] args) {
    prime p = new prime();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    p.calcu(n);
   }
}
