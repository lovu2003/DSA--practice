import java.util.Scanner;

public class Addition {

    public static void main (String[] args ) {
        int a,b,c;

        System.out.print("Enter any two Number: ");
        Scanner s=new Scanner(System.in);

        a=s.nextInt();
        b=s.nextInt();

        c=a+b;
        System.out.print("sum of two Number: "  +c);
    }
}