package Stacks;

public class stackImplementation {

    int stack[];
    int top;
    int size;

    public stackImplementation(int stackSize){
        stack=new int[stackSize];
        size=stackSize;
        top=-1;

    }

    public void push(int ele){
        if(top>=size-1){
            System.out.println("Stack is full --Overflow!");
        }
        top++;
        stack[top]=ele;
    }

    public boolean isEmpty(){
        return top<=-1;
    }

    public int size(){
        return top+1;  //as index is 0 based
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }

    public int pop(){
        int val=peek();
        if(val!=Integer.MIN_VALUE){
            top--;
        }
        return val;
    }

    public void printStack(){
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]);
            if(i!=top){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        int n=5;
        stackImplementation stack=new stackImplementation(n);
        System.out.println(stack.isEmpty());
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        System.out.println(stack.isEmpty());
        stack.printStack();


    }
    
}
