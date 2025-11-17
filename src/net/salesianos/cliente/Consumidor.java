package net.salesianos.cliente;

import net.salesianos.tienda.Tienda;
import net.salesianos.imprenta.Producto;

public class Consumidor extends Thread {
    private final String nombre;
    private final int cantidadAConsumir;
    private final Tienda tienda;

    public Consumidor(String nombre, int cantidad, Tienda tienda) {
        this.nombre = nombre;
        this.cantidadAConsumir = cantidad;
        this.tienda = tienda;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= cantidadAConsumir; i++) {
                Producto p = tienda.consumir(nombre);

                int tiempo = (int) (Math.random() * 1200 + 200);
                System.out.println("[CONSUMIDOR] " + nombre +
                        " está procesando " + p + " (" + tiempo + "ms)");
                Thread.sleep(tiempo);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("[CONSUMIDOR] " + nombre + " interrumpido.");
        }

        System.out.println("[CONSUMIDOR] " + nombre + " ha terminado de consumir.");
    }
}

