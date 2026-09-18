package org.example.ejerciciosBasicos
/*
Ejercicios básicos Kotlin
Ejercicio 1: Par o impar
Escribe un programa que pida un número al usuario y determine si es par o impar. Debe
usar una estructura if/else.
Requerimiento: El programa debe imprimir "El número es par" si el número es divisible
por 2, y "El número es impar" si no lo es

 */

fun main(){
    println("- Ejercicio 1")
    parOImpar(1)


}

fun parOImpar(numero: Int) {
    print("Ingrese un numero:")

    val numero= readln().toInt()
    var res= numero % 2
    if (res == 0) {
        println("El número es par")
    } else {
        println("El número es impar")
    }
}


