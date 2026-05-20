import java.util.Scanner;

public class Queue{
    public int arr[],capacity,scale,front,rear; 
    public Queue(int size){
        this.capacity=size;
        this.arr=new int[this.capacity];
        this.rear=-1;
        this.front=0;
        this.scale=0;
    }

    public void puchQueue(int data){
        if(isFull()){
            System.out.println("Stack is full...");
        }else{
            rear++;
            arr[rear]=data;
            scale++ ;
        }
    }

    public void popQueue(){
        if(isEmpty()){
            System.out.println("Stack is empty...");
        }else{
            front++;
            scale--;
        }
    }

    public boolean isFull(){
        if(rear==capacity-1)
            return true;
        return false;
    }

    public boolean isEmpty(){
        if(scale==0)
            return true;
        return false;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of Queue");
        int size=sc.nextInt();
        Queue queue = new Queue(size);
        queue.puchQueue(12);
        queue.puchQueue(13);
        queue.puchQueue(14);
        queue.puchQueue(15);
        queue.popQueue();
        queue.popQueue();
        queue.popQueue();
    
        for(int i=queue.scale;i<=queue.rear;i++){
            System.out.println(queue.arr[i]+" ");
        }
        sc.close();
    }
}
