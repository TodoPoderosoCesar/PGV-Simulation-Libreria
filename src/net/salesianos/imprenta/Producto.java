package net.salesianos.imprenta;

public class Producto {
    private final String nombre;
    private final String tipo;
    private final String productor;

    public Producto(String nombre, String tipo, String productor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.productor = productor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getProductor() {
        return productor;
    }

    @Override
    public String toString() {
        return nombre + " [" + tipo + "] (creado por " + productor + ")";
    }
}
