package org.example.ejerciciosBasicos
/*
Ejercicio 4: Calcular la suma de los números
Escribe una función que reciba un número entero n y calcule la suma de todos los
números desde 1 hasta n usando un bucle for.
Requerimiento: La función debe devolver la suma. Por ejemplo, si n = 5, el resultado
será 1 + 2 + 3 + 4 + 5 = 15.
 */

fun main(){
    println("- Ejercicio 4")
    println("Introduce un numero:")
    var n = readln().toInt()
    sumaNumeros(n)
    println("La suma de los números del 1 al $n es: ${sumaNumeros(n)}")
}

fun sumaNumeros(n: Int): Int {

    var suma = 0
    for (i in 1..n) {
        suma += i
    }
    return suma
}
