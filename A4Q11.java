public class A4Q11{
    public static void main(String args[]){
        int c;
        int ss=0,s=0;
        for (c=1;c<=100;c++){
            ss+=(c*c);
            s+=c;
        }
        System.out.print((s*s)-ss);
    }
}