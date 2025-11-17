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

## Experimentos:
- experimento-uno: 1 productor, 1 consumidor, 5 productos.

Captura del código:
![captura codigo exp1](<img/experimento1codigo.png>)

Captura de la consola:
![Captura consola exp1](<img/experimento1consola.png>)

- experimento-dos: reducir tiempos de producción.

Captura del codigo:
![captura del codigo cambiado](<img/experimento2codigo.png>)

En la captura solo cambiamos el tiempo que se toma el productor en crear un producto y por consola solo nos percatamos (y muy ligeramente) de que se consume más rápido de lo que se produce.

- experimento-tres: aumentar prioridad de productores.


