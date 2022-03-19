import java.util.*;

public class ArrayDeque1 {

    public static void main(String[] args) {
      
          ArrayDeque<Integer> dq = new ArrayDeque<> ();

          //Insertion  
          dq.offerFirst(10);
          dq.offerLast(20);
          dq.offerFirst(30);
          dq.offerLast(40);

          dq.forEach( (x) -> { System.out.print(x); } ); //30 10 20 40

          //Deletion
          dq.pollFirst();
          dq.pollLast(); 
          
          System.out.println();
          dq.forEach( (x) -> { System.out.print(x); } ); //10 20

          //Examine
          dq.peekFirst();
          dq.peekLast();
     }
}