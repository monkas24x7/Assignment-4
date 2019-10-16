import java.util.Scanner;
public class A4Q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out .print("Enter a message: ");
        String n=sc.next();
        int c=1;
        String r="";
        while(c<=10){
            if (c==1){
                r="1st";
            }
            else if(c==2){
                r="2nd";
            }
            else if(c==3){
                r="3rd";
            }
            else{
                r=c+"th";
            }
            System.out.println(r+" "+n);
            c+=1;
        }

    }
}