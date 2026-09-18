package org.example.ejerciciosBasicos

/*
Ejercicio 8: Contar vocales en una cadena
Escribe una función que reciba una cadena de texto y cuente cuántas vocales (a, e, i, o,
u) contiene. La función debe devolver el número de vocales encontradas.
Requerimiento: El programa debe ser sensible a mayúsculas y minúsculas.
 */

fun main() {
    println("- Ejercicio 8")
    println("Introduce un texto:")
    val cadena = readln()
    val numeroVocales = contarVocales(cadena)
    val vocalesEncontradas = obtenerVocales(cadena)
    println("El texto: $cadena tiene $numeroVocales vocales.")
    println("Las vocales encontradas son: ${vocalesEncontradas.joinToString(", ")}")

}

fun contarVocales(cadena: String): Int {
    var contador = 0

    var vocales = arrayOf("a","e","i","o","u","A","E","I","O","U")

//    for (caracter in cadena) {
//        when (caracter) {
//            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> contador++
//
//
//        }
//    }

    for (caracter in cadena) {
        if (vocales.contains(caracter.toString())) {
            contador++
        }
    }
    return contador
}

fun obtenerVocales(cadena: String): List<Char> {
    val vocalesEncontradas = mutableListOf<Char>()

    for (caracter in cadena) {
        when (caracter) {
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> vocalesEncontradas.add(caracter)
        }
    }

    return vocalesEncontradas
}
