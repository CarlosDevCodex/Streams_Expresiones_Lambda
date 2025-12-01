import java.util.function.BiFunction;

public class BiFunctionExample {

public static void main(String[] args) {
    /*
    recibe dos valores  y retorna un resultado
    */

    BiFunction<Integer,Integer,Integer> biFunction=(a,b)->{
       return a+b;
    } ;

      System.out.println(biFunction.apply(12, 20));   
}


}
