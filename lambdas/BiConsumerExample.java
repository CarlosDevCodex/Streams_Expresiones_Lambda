import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        /*
         recibe 2 parametros y no retona ningpun valor
        */

         BiConsumer<Integer,Integer> biConsumer=(a, b)->{
             System.out.println(a+b);
         };
               biConsumer.accept(10,15);
    }
}
