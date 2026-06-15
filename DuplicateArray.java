public class DuplicateArray {
    public static void main(String[] args) {
        int arr[]={1,2,2,5,6,7,3,7,9,3,1,0};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
    }
}
