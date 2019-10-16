import java.util.Scanner;
public class A4Q2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Count from: ");
        int n=sc.nextInt();
        System.out.print("Count to: ");
        int m=sc.nextInt();
        System.out.print("Count by: ");
        int l=sc.nextInt();
        int c;
        for(c=n;c<=m;c+=l){
            System.out.print(c+" ");
        }
    }
}