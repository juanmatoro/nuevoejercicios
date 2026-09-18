package org.example.ejerciciosBasicos

/*
Ejercicio 8: Contar vocales en una cadena
Escribe una función que reciba una cadena de texto y cuente cuántas vocales (a, e, i, o,
u) contiene. La función debe devolver el número de vocales encontradas.
Requerimiento: El programa debe ser sensible a mayúsculas y minúsculas.
 */

fun main() {
    println("- Ejercicio 8")
    println("Introduce una cadena de texto:")
    val cadena = readln()
    val numeroVocales = contarVocales(cadena)
    println("La cadena contiene $numeroVocales vocales.")

}

fun contarVocales(cadena: String): Int {
    var contador = 0
    for (caracter in cadena) {
        when (caracter) {
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> contador++
        }
    }
    return contador
}

