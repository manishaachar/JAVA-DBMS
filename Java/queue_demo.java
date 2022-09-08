import java.util.*;
class QueueException extends Exception{
    public void Error(){
        System.out.println("queue is full");
    }

}
class Queue{
    int front;
    int rear;
    int q[];
    Queue(int n)
    {
        q=new int[n];
    }

 void insert(int ele) throws QueueException
    {    

        if(rear==q.length)
        { throw new QueueException();}
        if(front==-1)
         front=0;
        q[rear++]=ele;
    }

int delete()
    { int ele;
        if (front==-1)
       { throw new ArrayIndexOutOfBoundsException();}
       if(front==rear)
       {
        ele=q[front];
        rear=front=-1;
       }
      else{
        ele=q[front++];
        }
       return ele;
    }
void display()
    {
        if(front==-1)
          {
            System.out.println("queue is empty");
            return;
          }
        for(int i=front;i<=rear;i++)
        System.out.println(q[i]+"\t");

        }}
public class queue_demo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter queue size:");
        int size = sc.nextInt();
        Queue que=new Queue(size); 
        try{
            while(true)
            {
                System.out.println("\n\n\tQueue operations \n 1.INSERT \n 2.DELETE \n 3.DISPLAY \n 4.EXIT");
                System.out.println("enter your choice:");
               
                int choice=sc.nextInt();
                System.out.println("...........");
                switch(choice)
                {
                    case 1:System.out.println("\n Enter element to be inserted:");
                           que.insert(sc.nextInt());
                           break;
                    case 2:System.out.println("deleted item is:"+que.delete());
                           break;
                    case 3:que.display();
                           break;
                    default:System.out.println("wrong choice");      
                           return;
                }
            }
        }
            
        catch(QueueException e)
        {
            e.Error();
        }
    
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("queue is empty");
    }
}
}
