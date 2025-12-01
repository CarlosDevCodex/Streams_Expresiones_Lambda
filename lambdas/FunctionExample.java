import java.util.function.Function;

public class FunctionExample {

public static void main(String[] args) {
    /*
    
    recibe un valor y retorna un valor
    */

    Function<String, String> function=(valor)->{
      return   valor+" recibe un valor y retorna un resutado";
    };

    System.out.println(function.apply("Function"));
        

}

}
