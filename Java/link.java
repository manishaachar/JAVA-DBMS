import java.util.LinkedList;
import java.util.List;

public class link {
    public static void main(String[] args){
        LinkedList<Character> ll= new LinkedList<Character>();
        ll.add('B');
        ll.add('E');
        ll.add('F');
        System.out.println("Original contents:"+ll);
        ll.addLast('G');
        ll.addFirst('A');
        System.out.println("\n After calls to addFirst() and addLast(),");
        System.out.println("Contents are: "+ll);
        ll.add(2,'D');
        ll.add(2,'C');
        System.out.println("\n After insertion.");
        System.out.println("Contents:" +ll);
        System.out.println("\n there are the first and last elements"+ll.getFirst()+" "+ ll.getLast());
    

List<Character> sub = ll.subList(2,5);
System.out.println("\nContentes of sublist:"+sub);
LinkedList<Character>ll2=new LinkedList<Character>(sub);
ll.removeAll(ll2);
ll.removeFirst();
ll.removeLast();
System.out.println("\n After deleting first and last element:");
System.out.println("\nContents are :"+ll);
ll.set(0, Character.toLowerCase(ll.get(0)));
System.out.println("\n After change: "+ll);

    }
}