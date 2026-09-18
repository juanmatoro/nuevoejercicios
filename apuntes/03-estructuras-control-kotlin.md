# Estructuras de control en Kotlin

Las estructuras de control, también conocidas como modificadores de flujo, son
herramientas fundamentales en la programación que permiten modificar el flujo de
ejecución del código. Esto significa que mediante estas estructuras, podemos tomar
decisiones, repetir acciones, o seleccionar entre múltiples opciones durante la
ejecución del programa.

## 1. Estructuras de decisión:

### - **if/else:** 

- El condicional if evalúa una expresión booleana y ejecuta un bloque de
código si esa expresión es verdadera. El bloque else se ejecuta si la expresión es
falsa. El bloque else es opcional.
```kotlin
val x = 10
if (x > 5) {
    println("x es mayor que 5")
} else {
    println("x es menor o igual que 5")
}
```

### **- when:** (similar al switch en otros lenguajes): 

La expresión when es una forma más
expresiva de manejar múltiples casos que if-else. Permite comparar el valor de
una variable con varios casos y ejecutar el bloque de código correspondiente al
primer caso que coincida.
```kotlin
val day = 3
when (day) {
    1 -> println("Lunes")
    2 -> println("Martes")
    3 -> println("Miércoles")
    else -> println("Otros días")
}
```

### Nota: Las estructuras de decisión también pueden utilizarse para asignar valores:
```kotlin
val edad = 20
val categoria = if (edad < 18) {
    "Menor de edad"
} else {
    "Adulto"
}

println("La categoría de edad es: $categoria")
```

## 2. Estructuras de iteración:

### **- while:** 

La estructura de bucle while ejecuta repetidamente un bloque de código
mientras una condición especificada sea verdadera. Es importante asegurarse de
que la condición en algún momento se vuelva falsa para evitar bucles infinitos.
```kotlin
var i = 0
while (i < 5) {
    println(i)
    i++
}
```

### **- do-while:** 

También existe la estructura de control do-while, es similar a while,
pero garantiza que el bloque de código se ejecute al menos una vez, incluso si la
condición de bucle es falsa desde el principio.
```kotlin
var i = 10
do {
    println("El valor de i es: $i")
    i++
} while (i < 5)
```

### **- for:** 

El bucle for se utiliza para iterar sobre una colección de elementos, como un
rango de números, una matriz o cualquier otro tipo de colección iterable.
```kotlin
val numbers = arrayOf(1, 2, 3, 4, 5)
for (number in numbers) {
    println(number)
}
```

### **- break:** 
La instrucción break se utiliza para salir de un bucle.
```kotlin
for (i in 1..5) {
    if (i == 3) {
        break // Sale del bucle interrumpiendo su ejecución
    }
    println("i: $i")
}
```

### **- continue:** 
La instrucción continue interrumpe una iteración y continúa con la
siguiente iteración en el bucle.
```kotlin
for (i in 1..5) {
    if (i == 3) {
        continue // Salta a la siguiente vuelta del bucle
    }
    println("i: $i")
}
```

## 3. Otras estructuras:

### **- with:**

El bloque with permite acceder y modificar propiedades de un objeto sin
tener que repetir el nombre del objeto en cada línea. Es útil para realizar
múltiples operaciones sobre un mismo objeto.
```kotlin
class Person {
    var name: String = ""
    var age: Int = 0
}

val person = Person()
with(person) {
    name = "Juan"
    age = 30
}
println("Nombre: ${person.name}, Edad: ${person.age}")
```

- try/catch: El bloque try/catch/finally es una estructura utilizada en la
programación para manejar excepciones, que son situaciones inesperadas que
pueden ocurrir durante la ejecución de un programa provocando errores.
```kotlin
val dividendo = 10
val divisor = 0

try {
    val result = dividendo / divisor
    println("El resultado de la división es: $result")
} catch (e: ArithmeticException) {
    println("Error: No se puede dividir por cero")
} finally {
    println("Se ejecuta el bloque finally independientemente de si
se produjo una excepción o no")
}
```
### Explicación:
  - try: En este bloque se coloca el código que podría generar una excepción.
El programa intentará ejecutar este código de manera normal.
  - catch: Si se produce una excepción dentro del bloque try, el control se
transfiere al bloque catch. Aquí se maneja la excepción, es decir, se
especifica qué hacer en caso de que ocurra un error. Puedes tener
múltiples bloques catch para manejar diferentes tipos de excepciones o
errores.
  - finally: Es un bloque opcional, y si lo añadimos se ejecutará siempre, se
haya producido una excepción o no. Se utiliza comúnmente para realizar
limpieza de recursos, como cerrar archivos o conexiones de bases de
datos.
