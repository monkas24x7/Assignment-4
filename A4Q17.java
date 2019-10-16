public class A7Q17{
    public static void main(String args[]){
        int c,i;
        String d="*";
        for(c=1;c<=10;c++){
            for(i=1;i<=11;i++){
                if(c%i==0){
                    System.out.print(d);
                }
                else if(i==11){
                    System.out.print(c);
                }
                else if(i%c==0){
                    System.out.print(d);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}