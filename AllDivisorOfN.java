import java.util.Scanner;

public class AllDivisorOfN {
    static void factors(int n){
        /*
        int i;
        for(i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i + " ");
            }
        }
        for(;i>1;)
        {
            i--;
            if(i!=n/i && n%i==0)
                System.out.print(n/i+" ");
        }

         */
        for(int i=1; i*i <= n; i++)
        {
            if(n % i == 0)
            {
                System.out.print(i+" ");

                if(i != n / i)
                    System.out.print((n / i)+" ");
            }
        }
    }

    public  static void main (String  []args){
        System.out.println("Enter a number :-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factors(n);
    }
}
