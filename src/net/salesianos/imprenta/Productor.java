package net.salesianos.imprenta;

import net.salesianos.tienda.Tienda;

public class Productor extends Thread {
    private final String nombre;
    private final int cantidad;
    private final Tienda tienda;
    private final String[] tiposPosibles = {"Lápiz", "Libreta", "Boli", "Goma", "Regla"};

    public Productor(String nombre, int cantidad, Tienda tienda) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tienda = tienda;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= cantidad; i++) {
                int tiempo = (int) (Math.random() * 1000 + 300);
                Thread.sleep(tiempo);

                String tipo = tiposPosibles[(int)(Math.random() * tiposPosibles.length)];
                Producto p = new Producto(nombre + "-Item" + i, tipo, nombre);
                System.out.println("[PRODUCTOR] " + nombre +
                        " ha producido: " + p + " (tiempo: " + tiempo + "ms)");

                tienda.producir(p);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("[PRODUCTOR] " + nombre + " interrumpido.");
        }

        System.out.println("[PRODUCTOR] " + nombre + " ha terminado de producir.");
    }
}
