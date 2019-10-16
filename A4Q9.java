public class A4Q9{
    public static void main(String args[]){
        int c;
        int s=0;
        for(c=2;c<1000;c++){
            if((c%3==0)||(c%5==0)){
                s+=c;
            }
        }
        System.out.print(s);
    }
}