// 2. union and intersection of two arrays
import java.util.HashSet;
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
        System.out.println("Enter 2nd array size..");
        int size2 = sc.nextInt();
        int arr2[]=new int[size2];
        
        System.out.println();
        System.out.println("Enter array 2nd elements...");
        for(int i=0; i<size2;i++){
            arr2[i]=sc.nextInt();
        }

        System.out.println();
        System.out.println("Array 1st elements ..");
        for(int i=0; i<size1;i++){
            System.out.print(" "+arr1[i]);
        }
        System.out.println();
        System.out.println("Array 2nd elements ..");
        for(int i=0; i<size2;i++){
            System.out.print(" "+arr2[i]);
        }

        System.out.println();
        HashSet<Integer> intersectionSet = new HashSet<>();
        

            System.out.println();
            HashSet<Integer> set =new HashSet();
            for(int i=0;i<arr1.length;i++){
                set.add(arr1[i]);
            }
            
            System.out.println("Union ..."+set);
        
            for(Integer s:arr2){
                if(set.contains(s)){
                    intersectionSet.add(s);
                }
            }
            System.out.println();
            System.out.println("Intersection..."+intersectionSet);
            
    }
}