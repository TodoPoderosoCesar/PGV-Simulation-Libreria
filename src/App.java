import net.salesianos.cliente.Consumidor;
import net.salesianos.imprenta.Productor;
import net.salesianos.tienda.Tienda;

public class App {
    public static void main(String[] args) {

        Tienda lemus = new Tienda(5);

        Productor santillana = new Productor("Santillana", 7, lemus);
        Productor oxford = new Productor("Oxford", 8, lemus);
        santillana.setPriority(Thread.MAX_PRIORITY);
        oxford.setPriority(Thread.MAX_PRIORITY);
        

        Consumidor c1 = new Consumidor("Cliente_Maria", 5, lemus);
        Consumidor c2 = new Consumidor("Cliente_Juan", 5, lemus);
        Consumidor c3 = new Consumidor("TiendaCentral", 5, lemus);
        c1.setPriority(Thread.MIN_PRIORITY);
        c2.setPriority(Thread.MIN_PRIORITY);
        c3.setPriority(Thread.MIN_PRIORITY);

        santillana.start();
        oxford.start();
        c1.start();
        c2.start();
        c3.start();

        try {
            santillana.join();
            c1.join();
            c2.join();
            c3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("=== SIMULACIÓN DE LA LIBRERÍA COMPLETADA ===");
    }
}
