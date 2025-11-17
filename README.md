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
- 1. En una rama llamada “experimento-uno”:
    a) Crea un único productor y un consumidor.
    b) El productor producirá cinco productos, y el consumidor los consumirá todos.
    c) Muestra una captura del output de la consola y explica con tus palabras el
    funcionamiento y ejecución del código añadiendo las capturas que consideres
    oportunas.

Captura del código:
![captura codigo exp1](<img/experimento1codigo.png>)

Captura de la consola:
![Captura consola exp1](<img/experimento1consola.png>)

- 2. En una rama llamada “experimento-dos”:
    a) Cambia los parámetros de tiempo de producción y hazlos más cortos que los del
    tiempo en el que el cliente consume los productos.
    b) Muestra una captura del output de la consola.
    c) ¿Observas algún cambio en la salida?

Captura del codigo:
![captura del codigo cambiado](<img/experimento2codigo.png>)

En la captura solo cambiamos el tiempo que se toma el productor en crear un producto y por consola solo nos percatamos (y muy ligeramente) de que se consume más rápido de lo que se produce.

- 3. En una rama llamada “experimento-tres”:
    a) Establece prioridades más altas para los hilos de los productores.
    b) ¿El resultado es similar al caso en el que hacemos los tiempos de producción más
    cortos? Muestra una captura del output de la consola.

Captura del codigo:
![Captura del codigo cambiado](<img/experimento3codigo.png>)

Captura de la consola:
![Captura de la consola](<img/experimento3consola.png>)

Vemos que se producen mucho mas rapido de lo que se consume... 
Justo al contrario del caso en el que hacemos los tiempos de produccion mas cortos.