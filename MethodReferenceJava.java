package methodreference.java;

interface MyLambda
{
    public void display(String str);
}

public class MethodReferenceJava {
    
    public static void reverse(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
    public static void main(String[] args) {
        MyLambda ml=System.out::println;
        ml.display("Hello");
        
        MyLambda m=MethodReferenceJava::reverse;
        m.display("Hello");
        
    }
    
}
