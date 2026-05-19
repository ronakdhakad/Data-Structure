// Merge two arrays
import java.util.Scanner;
class Demo2{
    public static void main(String args[]){
        System.out.println("Enter 1st array size..");
        Scanner sc = new Scanner(System.in);

        int size1 = sc.nextInt();
        int arr1[]=new int[size1];

        System.out.println();
        System.out.println("Enter array 1 elements...");
        for(int i=0; i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        
        System.out.println();
        System.out.println("Array 1st elements ..");
        for(int i=0; i<size1;i++){
            System.out.print(" "+arr1[i]);
        }

        System.out.println();
        System.out.println("Enter 2nd array size..");
        int size2 = sc.nextInt();
        int arr2[]=new int[size2];

        System.out.println();
        System.out.println("Enter array 2nd elements...");
        for(int i=0; i<size2;i++){
            arr2[i]=sc.nextInt();
        }
        int arr3[] = new int[arr1.length + arr2.length];
        System.out.println();
        System.out.println("Array 2nd elements ..");
        for(int i=0; i<size2;i++){
            System.out.print(" "+arr2[i]);
        }

        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }

        for(int i=0;i<arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];
        }


        System.out.println();
        System.out.println("Array 3st elements ..");
        for(int i=0;i<arr3.length;i++){
            System.out.print(" "+arr3[i]);
        }  
    }
}