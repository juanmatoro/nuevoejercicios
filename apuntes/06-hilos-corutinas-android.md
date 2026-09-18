# Hilos y Corutinas en Android (Kotlin)

## ¿Qué es un hilo?
Un hilo (thread) es una unidad de ejecución dentro de un programa.
- Android tiene un hilo principal (Main Thread o UI Thread) encargado de
dibujar la interfaz y responder a eventos del usuario.
- Si bloqueamos este hilo con operaciones pesadas (descargas, cálculos, acceso
a base de datos), la app se congela y Android puede mostrar el temido “App
no responde”.

## ¿Qué son las corutinas?
Las corutinas son una forma moderna y sencilla de manejar código asíncrono en Kotlin.
### Ventajas:
- Más ligeras que los hilos (miles de corutinas pueden ejecutarse en pocos hilos).
- Código más limpio y legible.
- Soportan cancelación y estructuras de concurrencia más avanzadas.

### Ejemplo de corutinas en Android
```kotlin
import kotlinx.coroutines.*
import java.net.URL

fun getProductos() {
    // Se ejecuta en un hilo de fondo (IO)
    CoroutineScope(Dispatchers.IO).launch {
        // Aquí ejecuta una tarea pesada o de duración indeterminada
        // Por ejemplo una llamada a internet
        val data = URL("https://api.mitienda.com/productos").readText()

        // Cambiar al hilo principal para actualizar la UI
        CoroutineScope(Dispatchers.Main).launch {
            println(data) // Aquí actualizas la interfaz
        }
    }
}
```

## El Main Thread
Cuando arrancas una aplicación, el sistema crea un hilo principal (UI Thread o MainThread).
- Ese hilo es el único autorizado para tocar la interfaz gráfica (pintar botones, mover
animaciones, mostrar textos).
- Si bloqueas este hilo con una tarea larga, la app se congela porque nadie más puede
pintar la pantalla.
## Los demás hilos
Cuando tú creas nuevos hilos (o corutinas que usan otros hilos), El sistema operativo los
ejecuta sobre el mismo procesador, pero no todos al mismo tiempo (a menos que tengas
varios núcleos en la CPU).
Aquí entra en juego el planificador del sistema operativo (scheduler):
- El procesador ejecuta un hilo durante un pequeño intervalo de tiempo
(milisegundos).
- Luego cambia a otro hilo (esto se llama time slicing o cuantos de tiempo).
- A ti te parece que se ejecutan a la vez, pero en realidad el sistema los va turnando
rapidísimo.
- Si el dispositivo tiene varios núcleos, realmente varios hilos pueden ejecutarse a la
```kotlin
vez (paralelismo).
```
## Conclusión
En Android, el MainThread (UI Thread) es el encargado de mantener la interfaz fluida y
responder a las acciones del usuario.
Por este motivo:
- Las tareas pesadas o de duración incierta (como llamadas a internet,
consultas a base de datos o procesamiento de ficheros grandes) deben
ejecutarse siempre en un hilo secundario o una corutina en segundo plano,
para evitar que la aplicación se congele o produzca un error ANR (Application
Not Responding).
- Una vez obtenidos los resultados, si necesitamos actualizar la pantalla,
debemos volver al MainThread, ya que es el único autorizado para modificar la
interfaz gráfica.
### En resumen:
Hilo secundario para el trabajo pesado, MainThread para actualizar la UI.
