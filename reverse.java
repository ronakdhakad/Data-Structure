public class reverse {

    public static void main(String[] args) {
        // String str ="I Love Java";
        // String reverse="";
        // for(int i=str.length()-1;i>=0;i--){
        //     reverse+=str.charAt(i);
        //     System.out.print(str.charAt(i));
        // }
        // System.out.println();
        // System.out.println(reverse);

        int num=53625712;
        int orignal=num;

        int reverse=0;
        while(num!=0){
            reverse=(reverse*10)+num%10;
            num=num/10;
        }
        System.out.println(orignal);
        System.out.println(reverse);
    }
}