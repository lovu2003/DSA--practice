import java.util.Scanner;

public class Array4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] number=new int[size];
        for (int i =0; i<size;i++){
            number[i]= sc.nextInt(); // for input values
        } // output
        for (int i=0; i<size; i++){
            System.out.println(number[i]);
        }
    }
}
