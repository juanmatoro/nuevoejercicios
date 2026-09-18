# Funciones en Kotlin

En programación, una función es un bloque de código que realiza una tarea
específica. Las funciones nos permiten organizar y reutilizar nuestro código de
manera efectiva, lo que resulta en un desarrollo más eficiente y legible. El objetivo es
dividir o descomponer un problema complejo en pequeños problemas. La solución
de esos pequeños problemas nos trae la solución del problema complejo.

## 1. Declarando una función:
En Kotlin, las funciones se definen utilizando la palabra clave fun.
### Sintaxis básica:
```kotlin
fun nombreDeLaFuncion(parametro: Tipo): TipoDeRetorno {
    // Cuerpo de la función
    // Realiza las operaciones necesarias
    return valorDeRetorno
}
```
### Explicación:
- nombreDeLaFuncion: Es el nombre que le damos a nuestra función.
- parámetro: Son los datos que la función necesita para llevar a cabo su tarea.
Pueden ser opcionales y se separan mediante coma.
- Tipo: Es el tipo de dato que espera la función para cada parámetro.
- TipoDeRetorno: Es el tipo de dato que devuelve la función después de
realizar sus operaciones y se indica mediante la palabra clave return.
### Ejemplo de funciones simples:
```kotlin
fun presentacion() {
    println("Programa que permite cargar dos valores")
    println("Realizar la suma y mostrar el resultado")
    println("***************************************")
}

fun sumar(a: Int, b: Int): Int {
    return a + b
}
```

## 2. Llamando a una función:
```kotlin
presentacion() // Llama a la función presentación.
// Lama a la función sumar proporcionando los parámetros
// Y asigna el valor retornado en la variable resultado.
val resultado = sumar(5, 3)
println("La suma es: $resultado") // Mostrar resultado.
```


## 3. Funciones con retorno unitario:
En Kotlin, si una función no devuelve ningún valor útil, su tipo de retorno puede ser
Unit. Esto es similar al concepto de "void" en otros lenguajes de programación:
```kotlin
fun saludar(nombre: String): Unit {
    println("¡Hola, $nombre!")
    return
}
```

### Nota: En este caso podemos omitir el tipo de retorno y la palabra return:
```kotlin
fun saludar(nombre: String) {
    println("¡Hola, $nombre!")
}
```

## 4. Funciones con argumentos por defecto:
Podemos asignar valores por defecto a los parámetros de una función. Esto
nos permite llamar a la función con menos argumentos si así lo deseamos:
```kotlin
fun tituloSubrayado(titulo: String, caracter: String = "-") {
    println(titulo)
    for(i in 1..titulo.length)
        print(caracter)
    println()
}

// Llamada con argumento por defecto
tituloSubrayado("Sistema de Administracion")
// Llamada sobrescribiendo el valor del argumento
tituloSubrayado("Ventas", "*")
```

## 5. Funciones de una sola expresión:
En Kotlin, si una función devuelve un único valor en una única expresión,
podemos simplificar su sintaxis:
```kotlin
fun duplicar(numero: Int): Int = numero * 2
```

## 6. Sobrecarga de funciones:
En Kotlin, podemos definir múltiples funciones con el mismo nombre dentro de
la misma clase, pero con diferentes conjuntos de parámetros. Esto se conoce
como sobrecarga de funciones. El compilador de Kotlin determinará qué
función llamar en función de la cantidad de parámetros y los tipos de los
argumentos proporcionados.

- Por tipo de parámetros:
```kotlin
fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun sumar(a: Double, b: Double): Double {
    return a + b
}
```
### Explicación: En el ejemplo anterior, tenemos dos funciones llamadas sumar. La
primera acepta dos parámetros de tipo entero y devuelve un entero, mientras que la
segunda acepta dos parámetros de tipo double y devuelve un double. El compilador
de Kotlin determinará automáticamente cuál de estas funciones llamar según los
tipos de los argumentos proporcionados en la llamada.

- Por cantidad de parámetros:
```kotlin
fun calcularArea(base: Double, altura: Double): Double {
    return base * altura
}

fun calcularArea(base: Double, altura: Double, profundidad:
Double): Double {
    return base * altura * profundidad
}
```
### Explicación:  En este ejemplo, tenemos dos funciones llamadas calcularArea. La
primera función calcula el área de un rectángulo dada su base y altura, mientras que
la segunda función calcula el volumen de un prisma rectangular dado su base, altura
y profundidad. Ambas funciones comparten el mismo nombre, pero tienen
diferentes conjuntos de parámetros, lo que permite su sobrecarga.

- Conclusión:
La sobrecarga de funciones nos permite escribir código más expresivo y flexible, ya
que podemos utilizar el mismo nombre de función para realizar diferentes tareas,
siempre y cuando los conjuntos de parámetros sean diferentes.
