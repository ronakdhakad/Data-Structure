public class prime {
    public static void main(String[] args) {
        int x=100;
        
        for(int i=1;i<=x;i++){
            Boolean check=true;
            for(int n=2;n<=i/2;n++){
                if(i%n==0){
                    check=false;
                    break;
                }
            }
            if(check)
                System.out.print(i+" ");
        }
    }
}
