public class ArmStrongNum {

    public static void main(String[] args) {
        int num =371;
        int orignal=num;
        int finalNum=orignal;
        int demo=0;
        while(num!=0){
            demo++;
            num=num/10;
        }
        int sum=0;
        while(orignal!=0){
            int total=1;
            for(int i=0;i<demo;i++){
                total*=(orignal%10);
            }
            orignal=orignal/10;
            sum+=total;
        }
        if(sum==finalNum)
            System.out.println(finalNum+" is Arm Strong number");
        else
            System.out.println(finalNum+" is not a Arm Strong number");
    }
}