package Java.prg9;

public class DynamicStack implements StackInterface{
    private char[]data;
    int tos;
    DynamicStack(int size){
        data=new char[size];
        tos=0;

    }
    public void push(char ch){
        if(tos==data.length){
            char[] t=new char[data.length*2];
            for(int i=0;i<tos;i++)
            t[i]=data[i];
            data=t;
        }
        data[tos]=ch;
        tos++;
    }

    public char pop(){
        if(isEmpty()){
            System.out.println("--Stack is Empty");
            return(char)0;
        }
        tos--;
        return data[tos];
        }
    

    public boolean isEmpty(){
        return tos==0;
    }
    
    public boolean isFull(){
        return false;
    }
}
