import java.lang.*;
public class FinallyExampleTest {
    public static void main(String[] args) {
        try{
            System.out.println("inside in try");
        int data = 25/0;
        System.out.println(data);
        }
        catch(ArithmeticException e){
            System.out.println("exception handeld");
            System.out.println(e);
        }
        finally {
            System.out.println("finally block execute si always ex.");
        }
        System.out.println("rest of the code ");
    }
    
}
