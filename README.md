# PGV-Simulation-Libreria
Este proyecto es una actividad para el curso DAM, sobre un simulador productor-consumidor usando hilos.

## Descripción del proyecto
- Empresa / tipo: Librería local.
- Productos: Lápices, libretas, bolígrafos, gomas, reglas.
- Productores: Editoriales/fabricantes que proveen artículos (simulados por hilos Productor).
- Consumidores: Clientes o la tienda que compra/procesa artículos (hilos Consumidor).
- Recurso compartido: Tienda con capacidad limitada.

## Estructura
- Producto -> representación de un producto.
- Tienda -> recurso compartido con sincronización (wait/notifyAll).
- Productor -> hilo productor.
- Consumidor -> hilo consumidor.
- App -> punto de entrada con configuración de ejemplo.

## Experimentos sugeridos (ramas)
- experimento-uno: 1 productor, 1 consumidor, 5 productos.
- experimento-dos: reducir tiempos de producción.
- experimento-tres: aumentar prioridad de productores.
