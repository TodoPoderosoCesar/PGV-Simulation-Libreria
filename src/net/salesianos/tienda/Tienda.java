package net.salesianos.tienda;

import java.util.LinkedList;
import java.util.Queue;
import net.salesianos.imprenta.Producto;

public class Tienda {
    private final int capacidad;
    private final Queue<Producto> productos = new LinkedList<>();

    public Tienda(int capacidad) {
        this.capacidad = capacidad;
    }

    public synchronized void producir(Producto p) throws InterruptedException {
        while (productos.size() == capacidad) {
            wait();
        }

        productos.add(p);
        System.out.println("[ALMACÉN] Producto añadido: " + p + " | Stock actual: " + productos.size());
        notifyAll();
    }

    public synchronized Producto consumir(String nombreConsumidor) throws InterruptedException {
        while (productos.isEmpty()) {
            wait();
        }

        Producto p = productos.poll();
        System.out.println("[ALMACÉN] " + nombreConsumidor +
                " ha consumido: " + p + " | Stock actual: " + productos.size());
        notifyAll();
        return p;
    }
}
