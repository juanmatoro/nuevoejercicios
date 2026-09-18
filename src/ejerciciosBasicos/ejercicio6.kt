package org.example.ejerciciosBasicos

/*
Escribe un programa que imprima los números del 1 al 30, pero para los múltiplos de 3,
debe imprimir "Fizz" en lugar del número, y para los múltiplos de 5, debe imprimir
"Buzz". Para los múltiplos de ambos (3 y 5), debe imprimir "FizzBuzz".
Requerimiento: El resultado debe ser:
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
...
FizzBuzz
 */

fun main() {
    println("- Ejercicio 6")
    fizzBuzz()
}

fun fizzBuzz() {
    for (i in 1..30) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}