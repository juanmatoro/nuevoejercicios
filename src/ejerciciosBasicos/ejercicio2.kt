package org.example.ejerciciosBasicos
/*
Ejercicios básicos Kotlin
Ejercicio 2: Contador descendente
Escribe un programa que imprima los números del 10 al 1 en orden descendente.
 */

fun main(){
    println("- Ejercicio 2")
    contadorDesc()
}



fun contadorDesc() {
    var contador = 10
    while (contador >= 1) {
        println(contador)
        contador--
    }
}