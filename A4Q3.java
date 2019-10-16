import java.util.Scanner;
public class A4Q2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Count to: ");
        int n=sc.nextInt();
        int c;
        for(c=0;c<=n;c++){
            System.out.print(c+" ");
        }
    }
}