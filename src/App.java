import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
      Scanner telefon = new Scanner(System.in);
      boolean continuar = true;
      ArrayList<Producto> listProducto = new ArrayList<>();

      while (continuar){
          System.out.println("Ingrese el Id del producto: ");
          int idProd = telefon.nextInt();
          System.out.println("Ingrese el Nombre del producto: ");
          String nameProd = telefon.next();
          System.out.println("Ingrese la Marca del producto: ");
          String marca = telefon.next();
          System.out.println("Ingrese el Precio del producto: ");
          int preProd = telefon.nextInt();

          Producto pro = new Producto(idProd, nameProd, marca, preProd);
          listProducto.add(pro);

          System.out.println("Desea agregar otro registro? (s/n)");
          String respuesta = telefon.next();
          if (!respuesta.equalsIgnoreCase("s") ){
              continuar = false;
          }
      }
        System.out.println("Lista de los productos registrados: ");
        Iterator<Producto> iteratorProducto = listProducto.iterator();
        while (iteratorProducto.hasNext()){
           Producto producto = iteratorProducto.next();
            System.out.println(producto);
        }
    }
}
