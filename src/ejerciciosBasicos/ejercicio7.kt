package org.example.ejerciciosBasicos

/*
Ejercicio 7: Factorial de un número
Escribe una función que reciba un número entero n y calcule el factorial de n (n! = n ×
(n-1) × (n-2) × ... × 1) usando un bucle while.
Requerimiento: La función debe devolver el factorial. Por ejemplo, si n = 4, el resultado
debe ser 4 × 3 × 2 × 1 = 24.

¿Qué es la recursividad?
Imagina que tienes una fila de niños y cada niño le pide ayuda al siguiente para
resolver una parte más pequeña del mismo problema. Cuando el último niño sabe la
respuesta, todos pueden volver hacia atrás con su parte resuelta.

Con el factorial de 4 ocurre esto:
factorial(4) = 4 × factorial(3)
factorial(3) = 3 × factorial(2)
factorial(2) = 2 × factorial(1)
factorial(1) = 1   ← este es el caso base: aquí paramos.

Después volvemos con las respuestas:
factorial(2) = 2 × 1 = 2
factorial(3) = 3 × 2 = 6
factorial(4) = 4 × 6 = 24

La función se llama a sí misma, pero siempre con un número más pequeño. Es
importante tener un caso base (aquí, n == 1), porque es la señal de «ya terminé».
En este ejercicio introduce números mayores o iguales que 1.
 */

fun main() {
    println("- Ejercicio 7")
    println("Introduce un número:")
    val n = readln().toInt()
    val factorial = factorial(n)
    println("El factorial de $n es: $factorial")
}

//fun calcularFactorial(n: Int): Long {
//    var result = 1L
//    for (i in 1..n) {
//        result *= i
//    }
//    return result
//}

fun factorial(n: Int): Int {
    if (n == 1) return 1
    else return n * factorial(n - 1)

    }
