import java.util.Scanner;

public class Stack {
    int arr[],size,top; 
    public Stack(int size){
        this.size=size;
        this.arr=new int[this.size];
        this.top=-1;
    }

    public void pushStack(int data){
        if(isFull()){
            System.out.println("Stack is full...");
        }else{
            top++;
            arr[top]=data;
        }
    }

    public void popStack(){
        if(isEmpty()){
            System.out.println("Stack is empty...");
        }else{
            top--;
        }
    }

    public boolean isFull(){
        if(top==size-1)
            return true;
        return false;
    }

    public boolean isEmpty(){
        if(top==-1)
            return true;
        return false;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of Stack");
        int size=sc.nextInt();
        Stack stack =new Stack(size);
        stack.pushStack(12);
        stack.pushStack(4);
        stack.pushStack(1);
        stack.pushStack(23);
        stack.pushStack(88);
        stack.pushStack(56);
        stack.popStack();
        stack.popStack();
        stack.popStack();
        stack.popStack();
        for(int i=0;i<stack.top;i++){
            System.out.println(stack.arr[i]+" ");
        }
        sc.close();
    }
}
