import java.util.Scanner;
public class A4Q2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String r="";
        int c=1,d;

        while(c<=n){
            if (c%10==1){
                d=c/10;
                if (d%10==1){
                    r=c+"th";
                }
                else{
                    r=c+"st";
                }
            }
            else if(c%10==2){
                d=c/10;
                if(d%10==1){
                    r=c+"th";
                }
                else{
                    r=c+"nd";
                }
            }
            else if(c%10==3){
                d=c/10;
                if (d%10==1){
                    r=c+"th";
                }
                else{
                    r=c+"rd";
                }
            }
            else{
                r=c+"th";
            }
            c+=1;
            System.out .println(r+" Hello");

        }
    }

}