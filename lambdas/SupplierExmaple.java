import java.util.function.Supplier;

public class SupplierExmaple {

      public static void main(String[] args) {
        /*
           no recibe ningún parámetro pero retorn un resultado
        */

           Supplier<String> suplier=()->{
             return "No recibe ningún parámetro pero return un valor";
           }; 

           System.out.println(suplier.get());
             

      }
}
