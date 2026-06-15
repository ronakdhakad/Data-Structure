public class MissingNum{
   public static void main(String[] args){
        int arr[]={4,5,6,7,9,10};
        int n=arr.length+1;
        int expectedNum=n*(n+1)/2;
        int actualNum=0;
        for(int num:arr){
            actualNum+=num;
        }
        System.out.println("missing num: "+(expectedNum-actualNum));
   } 
}
