package org.example.ejerciciosBasicos

/*
Ejercicio 9: Imprimir la tabla de multiplicar
Escribe un programa que imprima la tabla de multiplicar del número 7 (o de cualquier
número que se elija). Usa un bucle for.
Requerimiento: La salida debe ser algo como esto:
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
...
7 x 10 = 70

 */

fun main() {
    println("- Ejercicio 9")
    println("Introduce el número para la tabla de multiplicar:")
    val numero = readln().toInt()
    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}

fun tablaMultiplicar(numero: Int): Int {
    var contador = 0
    for (i in 1..10) {
        contador = numero * i
    }
    return contador
}

