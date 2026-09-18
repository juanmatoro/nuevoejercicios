# Introducción a Kotlin: 

Por dónde empezar Kotlin es un lenguaje de programación moderno y conciso que se ejecuta en la
máquina virtual de Java (JVM). Es un lenguaje multipropósito que puede ser utilizado
para desarrollar una amplia variedad de aplicaciones, desde aplicaciones móviles
hasta aplicaciones web y backend. Kotlin combina la seguridad y la interoperabilidad
con Java junto con una sintaxis más expresiva y menos boilerplate.
Hay ciertos conceptos que necesitamos explicar para empezar a programar en Kotlin,
estos conceptos nos ayudaran a ejecutar nuestro código, recoger datos y visualizar
resultados.

## 1. Preparación del entorno de desarrollo:
Para comenzar a programar en Kotlin, primero necesitas instalar un entorno de
desarrollo integrado o IDE por sus siglas en ingles. Existen varias opciones, pero el
más recomendable es IntelliJ IDEA, que es un IDE muy popular y poderoso
compatible con Kotlin. Puedes descargar IntelliJ IDEA desde su sitio web oficial:
[JetBrains IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/).
Para desarrollar aplicaciones móviles, podemos optar por una solución más
especializada en este tipo de proyectos, [Android Studio](https://developer.android.com/studio?hl=es-419), una solución montada sobre
IntelliJ IDEA, pero con herramientas que ayudan a desarrollar aplicaciones Android
de manera más fácil. Puedes descargar Android Studio desde su sitio web oficial:
Android Studio.


## 2. Estructura básica de un programa Kotlin:
Función main: La función main es el punto de entrada de un programa Kotlin. Es el
lugar donde comienza la ejecución del programa y desde donde se inicia la secuencia
de acciones definidas en el código.
### Ejemplo:
```kotlin
fun main() {
    // Código del programa
}
```


## 3. Almacenamiento de datos en Kotlin:
Para almacenar datos en Kotlin vamos a utilizar las palabras clave var y val seguido
del nombre que le queremos dar al dato almacenado.
### Ejemplo:
```kotlin
val edad = 10
```


## 4. Impresión de datos en la consola:
Función println: La función println nos permite imprimir valores en la consola
para mostrar resultados o errores de nuestro programa.
### Ejemplo:
```kotlin
println("¡Hola, mundo!")
// Imprime en consola el texto “¡Hola, mundo!”
```


## 5. Entrada de datos desde la consola:
Función readLine: La función readLine nos permite recoger valores desde la
consola para poder operar con ellos.
### Ejemplo:
```kotlin
val nombre = readLine()
// Recoge el valor que hayamos introducido en la consola y lo
almacena en una variable llamada nombre
```


## 6. Conocimiento en práctica:
Crear un programa que solicite al usuario su nombre:
```kotlin
fun main() {
    println("Por favor, introduce tu nombre:")
    val nombre = readLine()
    println("¡Hola, $nombre!")
}
```


## 7. Recursos adicionales: 
[Documentación oficial de Kotlin.](https://kotlinlang.org/)
