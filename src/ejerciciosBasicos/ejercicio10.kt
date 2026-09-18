package org.example.ejerciciosBasicos

/*
Ejercicio 10: Determinar el mayor de tres números
Escribe una función que reciba tres números enteros y determine cuál es el mayor de
los tres utilizando una estructura if/else.
Requerimiento: La función debe devolver el número mayor o imprimir "Son iguales" si
los tres números son iguales.
 */

fun main() {
    println("- Ejercicio 10")
    println("Introduce el primer número:")
    val num1 = readln().toInt()
    println("Introduce el segundo número:")
    val num2 = readln().toInt()
    println("Introduce el tercer número:")
    val num3 = readln().toInt()

    val mayor = determinarMayor(num1, num2, num3)
    println("El mayor de los tres números es: $mayor")
}

fun determinarMayor(num1: Int, num2: Int, num3: Int): Int {
 if (num1 == num2 && num3 == num1) {
        println("Son iguales")
        return num1
    } else if (num1 >= num2 && num1 >= num3) {
        return num1
    } else if (num2 >= num1 && num2 >= num3) {
        return num2
    } else {
        return num3
 }
}

