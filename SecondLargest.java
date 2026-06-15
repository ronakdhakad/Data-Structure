public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={1,3,68,8,9,12,77,45,2,90};
        int largest=arr[0];
        //FOR LARGEST ELEMENT
        for(int i=0;i<arr.length;i++) {
            if(largest<arr[i])
                largest=arr[i];
        }
        System.out.println("largest element "+largest);

        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(secondLargest<arr[i]&&largest!=arr[i]){
                secondLargest=arr[i];
            }
        }
        System.out.println("Second largest element "+secondLargest);
    }
}