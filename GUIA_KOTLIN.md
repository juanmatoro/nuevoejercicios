# Guía práctica de Kotlin

Esta guía convierte el material de introducción a la programación y los temas 01–05 de Kotlin en una ruta de trabajo para este repositorio. La idea es sencilla: leer poco, ejecutar mucho y modificar cada ejemplo.

> **Cómo usarla:** avanza por orden. Copia los ejemplos en un archivo de `src/`, ejecútalos y completa el reto antes de pasar al siguiente apartado.

## Índice

1. [Ruta de aprendizaje](#ruta)
2. [Ejecutar un programa](#ejecutar)
3. [Pensar antes de programar](#pensar)
4. [Variables y tipos](#variables)
5. [Entrada y salida](#entrada-salida)
6. [Decisiones y bucles](#control)
7. [Funciones](#funciones)
8. [Colecciones y nulos](#colecciones-nulos)
9. [Programación orientada a objetos](#poo)
10. [Plan de ejercicios](#ejercicios)
11. [Chuleta de sintaxis](#chuleta)

---

<a id="ruta"></a>
## 1. Ruta de aprendizaje

| Bloque | Objetivo | Señal de que lo dominas |
| --- | --- | --- |
| Fundamentos | Convertir un problema en pasos | Escribes el algoritmo antes del código |
| Sintaxis base | Usar `main`, `println`, `val` y `var` | Creas un programa de consola sin ayuda |
| Datos | Elegir el tipo y la mutabilidad correctos | Evitas conversiones y reasignaciones innecesarias |
| Control | Tomar decisiones y repetir tareas | Combinas `if`, `when` y bucles con seguridad |
| Funciones | Dividir un problema | Cada función tiene una responsabilidad clara |
| POO | Modelar entidades | Creas clases con estado y comportamiento |

No memorices todo. Para cada concepto pregúntate: **¿qué dato entra?, ¿qué debe salir?, ¿qué casos especiales hay?**

<a id="ejecutar"></a>
## 2. Ejecutar un programa

Cada archivo de ejercicios contiene una función `main`, el punto donde comienza el programa:

```kotlin
fun main() {
    println("¡Hola, Kotlin!")
}
```

En IntelliJ IDEA, abre el archivo y pulsa el icono verde junto a `main`. La consola mostrará el resultado. Para evitar conflictos mientras practicas, ejecuta un archivo cada vez: todos los ejercicios de este proyecto pueden tener su propio `main`.

<a id="pensar"></a>
## 3. Pensar antes de programar

Un programa es un algoritmo expresado con la sintaxis de Kotlin. Antes de escribirlo, usa esta plantilla:

```text
Problema: determinar si un número es par.
Entrada: un número entero.
Proceso: calcular el resto de dividirlo entre 2.
Salida: "par" si el resto es 0; "impar" en otro caso.
```

Después tradúcelo:

```kotlin
fun esPar(numero: Int): Boolean {
    return numero % 2 == 0
}
```

Una buena solución pasa por cuatro fases:

1. Entender el enunciado y separar entrada, proceso y salida.
2. Probar mentalmente casos normales y límites (`0`, negativos, valores iguales).
3. Escribir una versión pequeña que funcione.
4. Ejecutarla con datos distintos y mejorar sus nombres o estructura.

<a id="variables"></a>
## 4. Variables y tipos

### `val` y `var`

Usa `val` por defecto. Significa que la referencia no se reasignará. Usa `var` solo si el valor debe cambiar.

```kotlin
val nombre = "Ana"          // No se puede reasignar
var intentos = 0             // Sí puede cambiar
intentos = intentos + 1
```

El tipo se suele inferir, pero también puedes indicarlo:

```kotlin
val edad: Int = 20
val precio: Double = 12.50
val inicial: Char = 'A'
val activo: Boolean = true
val mensaje: String = "Bienvenida"
```

### Operadores útiles

```kotlin
val suma = 8 + 2
val resto = 9 % 2       // 1
val esMayor = 8 > 2
val ambos = true && false
```

Para insertar valores en un texto, utiliza plantillas:

```kotlin
val nombre = "Lucía"
println("Hola, $nombre")
println("El nombre tiene ${nombre.length} letras")
```

**Reto.** Declara el nombre, la edad y si una persona tiene carnet. Imprime una frase con los tres datos. Cambia solamente los valores que realmente deban ser mutables.

<a id="entrada-salida"></a>
## 5. Entrada y salida

`println` imprime y añade un salto de línea; `print` no lo añade. Para leer en consola, `readln()` devuelve un `String`.

```kotlin
fun main() {
    print("¿Cómo te llamas? ")
    val nombre = readln()
    println("Hola, $nombre")
}
```

Si se espera un número, conviértelo explícitamente:

```kotlin
print("Introduce tu edad: ")
val edad = readln().toInt()
println("El año próximo tendrás ${edad + 1}")
```

`toInt()` falla si el texto no es un entero. Cuando quieras tolerar entradas incorrectas, usa `toIntOrNull()`:

```kotlin
print("Introduce un número: ")
val numero = readln().toIntOrNull()

if (numero == null) {
    println("Debes escribir un número entero.")
} else {
    println("El doble es ${numero * 2}")
}
```

<a id="control"></a>
## 6. Decisiones y bucles

### Decidir con `if`

`if` también puede producir un valor, por lo que evita variables temporales innecesarias:

```kotlin
val nota = 7
val resultado = if (nota >= 5) "Aprobado" else "Suspenso"
println(resultado)
```

Usa `when` cuando hay varias alternativas:

```kotlin
val dia = 3
val nombreDia = when (dia) {
    1 -> "Lunes"
    2 -> "Martes"
    3 -> "Miércoles"
    else -> "Día no válido"
}
```

### Repetir con `for`, `while` y `do-while`

```kotlin
for (numero in 1..5) {
    println(numero)
}

var contador = 0
while (contador < 3) {
    println("Vuelta $contador")
    contador++
}

do {
    print("Escribe 'salir': ")
    val texto = readln()
} while (texto != "salir")
```

- `for`: cuando recorres un rango o colección.
- `while`: cuando quizá no debas entrar nunca.
- `do-while`: cuando necesitas ejecutar el bloque al menos una vez.
- `break`: sale del bucle; `continue`: salta a la siguiente vuelta. Úsalos solo cuando hagan el flujo más claro.

**Reto.** Pide cinco números, suma solo los positivos y muestra la suma. Prueba con positivos, negativos y cero.

<a id="funciones"></a>
## 7. Funciones

Una función agrupa una tarea concreta. El nombre debe describir lo que hace; sus parámetros son la entrada y el retorno, la salida.

```kotlin
fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun mostrarTitulo(texto: String) {
    println("--- $texto ---")
}
```

Si el cuerpo es una única expresión, simplifícala:

```kotlin
fun duplicar(numero: Int): Int = numero * 2
fun esMayorDeEdad(edad: Int): Boolean = edad >= 18
```

Los parámetros por defecto reducen llamadas repetidas:

```kotlin
fun saludar(nombre: String, idioma: String = "es") {
    val saludo = if (idioma == "es") "Hola" else "Hello"
    println("$saludo, $nombre")
}

saludar("Marta")
saludar("Marta", "en")
```

La sobrecarga permite reutilizar un nombre con parámetros diferentes, pero no solo cambiando el tipo de retorno:

```kotlin
fun area(lado: Double): Double = lado * lado
fun area(base: Double, altura: Double): Double = base * altura / 2
```

**Regla práctica:** una función debe hacer una sola cosa. Por ejemplo, `determinarMayor` debería devolver el mayor; pedir datos e imprimir el resultado pertenece a `main`.

<a id="colecciones-nulos"></a>
## 8. Colecciones y nulos

### Colecciones

```kotlin
val fijos = arrayOf(10, 20, 30)
fijos[0] = 15

val nombres = listOf("Ana", "Leo", "Noa")       // Solo lectura
val compras = mutableListOf("pan", "leche")       // Modificable
compras.add("fruta")

val etiquetas = setOf("kotlin", "kotlin", "jvm") // Sin duplicados
val telefonos = mapOf("Ana" to "600000000")       // Clave → valor
```

Los índices comienzan en cero. Recorre una lista sin manejar índices si no los necesitas:

```kotlin
for (nombre in nombres) {
    println(nombre)
}
```

### Nulabilidad

En Kotlin, `String` no acepta `null`; `String?` sí. El compilador obliga a tratar ese caso:

```kotlin
val apodo: String? = null
println(apodo?.length)           // null; no lanza excepción
val longitud = apodo?.length ?: 0
```

- `?.` accede solo si hay valor.
- `?:` proporciona una alternativa cuando el resultado es `null`.
- Evita `!!`: convierte un nulo en error y casi nunca es la mejor solución.

<a id="poo"></a>
## 9. Programación orientada a objetos

Una **clase** es el modelo; un **objeto** es una instancia concreta. Las propiedades guardan estado y los métodos expresan comportamiento.

```kotlin
class Persona(val nombre: String, var edad: Int) {
    fun saludar() = println("Hola, soy $nombre")
}

val persona = Persona("Ana", 22)
persona.edad++
persona.saludar()
```

El constructor primario está entre paréntesis. Usa `init` para validar o realizar inicialización adicional:

```kotlin
class Producto(val nombre: String, val precio: Double) {
    init {
        require(precio >= 0) { "El precio no puede ser negativo" }
    }
}
```

### Encapsulamiento

Oculta datos que no deberían modificarse directamente y expón operaciones claras:

```kotlin
class Cuenta(saldoInicial: Double) {
    private var saldo = saldoInicial

    fun ingresar(cantidad: Double) {
        require(cantidad > 0)
        saldo += cantidad
    }

    fun consultarSaldo(): Double = saldo
}
```

### Herencia e interfaces

Las clases son finales por defecto. Marca una clase o método como `open` solo si debe heredarse. Una interfaz define un contrato:

```kotlin
interface Figura {
    fun area(): Double
}

class Circulo(private val radio: Double) : Figura {
    override fun area(): Double = Math.PI * radio * radio
}
```

Para datos simples, conoce también `data class`: crea automáticamente utilidades como comparación, `toString` y `copy`.

```kotlin
data class Tarea(val texto: String, val completada: Boolean = false)
```

<a id="ejercicios"></a>
## 10. Plan de ejercicios para este repositorio

Los archivos en `src/ejerciciosBasicos/` son tu primer bloque de práctica. Antes de dar cada ejercicio por terminado, comprueba lo siguiente:

- [ ] El programa compila y se ejecuta.
- [ ] Probé al menos un caso normal y un caso límite.
- [ ] Las variables que no cambian son `val`.
- [ ] Los nombres explican su contenido (`numero`, `mayor`, `resultado`).
- [ ] La lógica reutilizable está en una función.

Propuesta de progresión:

1. Par o impar: `%` e `if/else`.
2. Positivo, negativo o cero: condiciones encadenadas.
3. Mayor de dos/tres números: comparaciones y retorno.
4. Tablas y acumuladores: `for` y `var` controlada.
5. Listas: recorrer, filtrar y sumar elementos.
6. Calculadora: funciones con parámetros y retorno.
7. Agenda o producto: clase, constructor y métodos.
8. Cuenta bancaria: encapsulamiento y validación.

Cuando termines un ejercicio, haz una segunda versión con una mejora concreta: extrae una función, evita duplicación o añade validación de entrada.

<a id="chuleta"></a>
## 11. Chuleta de sintaxis

```kotlin
// Programa
fun main() { }

// Variables
val fijo = 1
var cambia = 1

// Función
fun cuadrado(n: Int): Int = n * n

// Condición como expresión
val mensaje = if (fijo > 0) "positivo" else "no positivo"

// Varias opciones
when (fijo) {
    0 -> println("cero")
    else -> println("otro")
}

// Rango y colección
for (i in 1..3) println(i)
val lista = mutableListOf("a", "b")

// Nulos
val texto: String? = null
val letras = texto?.length ?: 0

// Clase
class Punto(val x: Int, val y: Int)
```

## Siguiente paso

Abre `src/ejerciciosBasicos/ejercicio1.kt`, ejecuta el caso `2` y el caso `3`, y cambia la función para que use el parámetro que recibe en lugar de volver a pedir el número por consola. Ese pequeño ajuste separa correctamente la entrada de la lógica del problema.
