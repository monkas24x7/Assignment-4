public class A4Q12{
    public static void main(String args[]){
        double n;
        for(n=16;n<=2048;n*=2){
            System.out.println((Math.log(n)+"\t"+n+"\t"+n*Math.log(n)+"\t"+(n*n)+"\t\t\t"+(Math.pow(n,3))+"\t\t"+(Math.pow(2,n))));
        }
    }
}
