import java.util.*;

public class LinkedList1 {

    public static void main(String[] args) {
        
        LinkedList<Integer> al1=new LinkedList<>();
        
        LinkedList<Integer> al2=new LinkedList<Integer>(Arrays.asList(50,60,70,80,90,100));
        
        al1.add(10);
        al1.add(0,5);
        al1.addAll(1,al2);
        al1.add(5,70);
        al1.set(6,100);
                
        al1.forEach(System.out::println);
        al1.forEach(n->show(n));  
    }
    
    static void show(int n)
    {
            System.out.println(n);
    }
    
}