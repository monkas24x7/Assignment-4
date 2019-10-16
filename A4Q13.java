import java.util.Scanner;
public class A4Q13{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a number to display digits and check divisibility by 9: ");
        int n=sc.nextInt();
        int c,d,s=0;
        for (c=n;c>0;c/=10){
            d=c%10;
            s+=d;
            System.out.println(d);
        }
        if (s%9==0){
            System.out.print("Yes divisible by 9");
        }
        else{
            System.out.print("No not divisuble by 9");
        }
    }
}