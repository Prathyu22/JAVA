import java.util.*;

public class PriorityQueue1 {

    public static void main(String[] args) {
      
          PriorityQueue<Integer> dq = new PriorityQueue<>();

          //Insertion  
          dq.add(10);
          dq.add(20);
          dq.add(30);
          dq.add(40);
          dq.add(50);

          dq.forEach( (x) -> { System.out.print(x); } ); // 10 20 30 40 50

          //Root element
          System.out.println(dq.peek()); //10

          //Deleting the root
          dq.poll(); 
          
          System.out.println();
          dq.forEach( (x) -> { System.out.print(x); } ); // 20 30 40 50

     }
}