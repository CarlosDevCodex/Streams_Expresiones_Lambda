import java.util.concurrent.Callable;

public class CallableExample {

/*

Ejecuta una tarea pero puede retornar una resultado y lanzar excepciones
-----------------PRUEBA--------------------------
*/

 public static void main(String[] args) {
    
    Callable<String> callable=()->{
      return "Resultado de la tarea";
    };

         try {
          String  result=      callable.call();
          System.out.println(result);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

 }

}

