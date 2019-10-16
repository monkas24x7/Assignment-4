import java.util.Scanner;
public class A4Q10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number for which you want ot find the multiplication table: ");
        int n=sc.nextInt();
        int c;
        for (c=1;c<=10;c++){
            System.out.println(n+"X"+c+"="+(n*c));
        }

    }
}