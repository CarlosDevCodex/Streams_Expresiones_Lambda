import java.util.function.Consumer;

public class ConsumerExample {
public static void main(String[] args) {
    /*
    Recibe un valor  y no retorna nada
    */

    Consumer<String> consumer=(param)->{
    System.out.println(param);
    };

    consumer.accept("Hola m undo");

}
}
