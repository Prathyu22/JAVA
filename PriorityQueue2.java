import java.util.*;

class MyCom implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2)
    {
         if(o1<o2) return 1;
         if(o1>o2) return -1;
         return 0;
    }
}

public class PriorityQueue2 {

    public static void main(String[] args) {
      
          PriorityQueue<Integer> dq = new PriorityQueue<>(new MyCom());

          //Insertion  
          dq.add(10);
          dq.add(20);
          dq.add(30);
          dq.add(40);
          dq.add(50);

          dq.forEach( (x) -> { System.out.print(x); } ); // 50 40 20 10 30

          //Root element
          System.out.println(dq.peek()); //50

          //Deleting the root
          dq.poll(); 
          
          System.out.println();
          dq.forEach( (x) -> { System.out.print(x); } ); // 40 30 20 10

     }
}