package lambdaexp.java;

interface Lambda{
    void display(); //This method is by default --> "Public and Abstract".
}

public class LambdaexpJava {
    public static void main(String[] args) {
        
        /*
        Lambda l = new Lambda(){
            public void display(){
                S.O.P("Hello World");
            }
        }   
        */
        
        //Bellow is the "Lambda Expression" 
        Lambda l = () -> {System.out.println("Hello Lambda Expression.");};
        l.display();        
        
    }
    
}
