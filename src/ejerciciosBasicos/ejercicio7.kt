package org.example.ejerciciosBasicos

/*
Ejercicio 7: Factorial de un número
Escribe una función que reciba un número entero n y calcule el factorial de n (n! = n ×
(n-1) × (n-2) × ... × 1) usando un bucle while.
Requerimiento: La función debe devolver el factorial. Por ejemplo, si n = 4, el resultado
debe ser 4 × 3 × 2 × 1 = 24.
 */

fun main() {
    println("- Ejercicio 7")
    println("Introduce un número:")
    val n = readln().toInt()
    val factorial = calcularFactorial(n)
    println("El factorial de $n es: $factorial")
}

fun calcularFactorial(n: Int): Long {
    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result
}


