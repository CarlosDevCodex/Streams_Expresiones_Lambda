package lambdas;
public class RunnableExample {


    public static void main(String[] args) {
        /*
        Ejecuta una tarea sin recibir  y tambpoco no retorna nada.
        */

    Runnable runnable=()->{
     System.out.println( "Ejecutar tarea...");
    };

    runnable.run();

        
    }

}
