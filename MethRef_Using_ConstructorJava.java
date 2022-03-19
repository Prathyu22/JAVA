package methref_using_constructor.java;

interface MyLambda{
    void display(String str);
}

public class MethRef_Using_ConstructorJava {

    public MethRef_Using_ConstructorJava(String str){
        System.out.println(str.toUpperCase());
    }
    public static void main(String[] args) {
        MyLambda ml = MethRef_Using_ConstructorJava::new;
        ml.display("Hello");
    }
    
}
