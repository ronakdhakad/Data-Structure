//  program to shift all the zeros to the end
import java.util.Scanner;
class Demo1{
    public static void main(String args[]){
        System.out.println("Enter size of array: ");
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] =new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array Elements..");
        for(int i=0;i<size;i++){
            System.out.print(" "+arr[i]);
        }
        
        System.out.println();
        int count=0;
        for(int i=0;i<size;i++){
            if(0==arr[i]){
            continue;
            }
            arr[count]=arr[i];
            count++;
        }

        while(count<size){
            arr[count]=0;
            count++; 
        }

        System.out.println("Array Elements..");
        for(int i=0;i<size;i++){
            System.out.print(" "+arr[i]);
        }
    }
}