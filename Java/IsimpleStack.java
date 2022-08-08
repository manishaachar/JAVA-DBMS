package Java.prg9;

public class IsimpleStack {
    public static void main(String[] args) {
       //StackInterface si= new StackInterface();
       FixedLengthStack fl= new FixedLengthStack(10);
       DynamicStack ds=new DynamicStack(05);
       StackInterface stk;

       for(int i=0;i<10;i++){
        fl.push((char)('A'+i));
       }
      
    //    for(int i=0;i<0;i++){
    //     //System.out.print("Fixed length stack contents are:");
    //      System.out.print(fl.pop());
    //    }
     
       for(int i=0;i<10;i++){
        System.out.print(fl.pop()+"\t");
       // ds.push( 'A'+i);
       }
        
       for(int i=0;i<5;i++){
       ds.push((char)('A'+i));
        }
       
        for(int i=0;i<5;i++){
            System.out.print(ds.pop()+ "\t");
        }
    }
}
