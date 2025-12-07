import java.util.function.Predicate;

public class PredicateExample {

  public static void main(String[] args) {
    /*
       Recibe un valor y retorna un booleano (true o false)
    */

       Predicate<String>  predicate=(a)->{
             return a.equals("a");
         };
          System.out.println(predicate.test("a"));  

  } 

}
