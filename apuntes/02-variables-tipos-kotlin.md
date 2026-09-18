# Declaración de Variables en Kotlin

En Kotlin, podemos declarar variables mutables e inmutables, explicaremos la
diferencia y sintaxis con los siguientes ejemplos:

## 1. Variables Mutables (var): 
Las variables mutables se pueden cambiar después de su inicialización utilizando la palabra clave var. Son útiles cuando necesitas actualizar
el valor de una variable durante la ejecución del programa.
### Sintaxis:
```kotlin
var nombreVariable: TipoDato = valorInicial
```

### Ejemplo:
```kotlin
var edad: Int = 25
edad = 30 // Cambio de valor
```
### Explicación: 
En este ejemplo, declaramos una variable edad de tipo entero (Int) e inicializamos su valor en 25. Luego, actualizamos su valor a 30 más tarde en el
programa.

## 2. Variables Inmutables (val): 
Las variables inmutables no pueden ser cambiadas después de su inicialización. 
Se declaran utilizando la palabra clave val. 
Son útiles cuando necesitas una variable cuyo valor no cambie durante la ejecución del
programa.
### Sintaxis:
```kotlin
val nombreVariable: TipoDato = valorInicial
```

### Ejemplo:
```kotlin
val nombre: String = "Juan"
// nombre = "Pedro" // Esto dará un error ya que 'nombre' es
inmutable
```
### Explicación: 
En este ejemplo, declaramos una variable _**nombre**_ de tipo cadena (String) e inicializamos su valor en "Juan". Intentar cambiar su valor más adelante
en el programa resultaría en un error porque la variable es inmutable.




## Tipos de Variables en Kotlin

En Kotlin, los tipos de variables especifican qué tipo de datos puede contener una
variable. Aquí hay una guía sobre los tipos de variables y las colecciones en Kotlin,
junto con ejemplos y explicaciones paso a paso:

## 1. Tipos de Datos Primitivos: 
Kotlin proporciona tipos de datos primitivos para representar valores simples, como números enteros, decimales, caracteres y valores
booleanos.
### Ejemplos:
```kotlin
val entero: Int = 10
val decimal: Double = 5.5
val caracter: Char = 'a'
val booleano: Boolean = true
```
### Explicación: 
En estos ejemplos, declaramos variables de diferentes tipos de datos
primitivos y les asignamos valores iniciales.

## 2. Tipos de Datos Personalizados (Enum): 
Además de los tipos de datos primitivos,
Kotlin permite la creación de tipos de datos personalizados utilizando
enumeraciones.
### Ejemplo:
```kotlin
enum class DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}

val diaHoy: DiaSemana = DiaSemana.MIERCOLES
```
### Explicación: 
En este ejemplo, creamos una enumeración DiaSemana que contiene los
días de la semana como valores posibles. Luego, declaramos una variable diaHoy y le
asignamos el valor Miercoles de la enumeración.

## 3. Tipos de Datos Complejos (Class): 
Los lenguajes orientados a objeto como Kotlin,
permiten la creación de tipos de datos personalizados utilizando clases. Este tipo de
variables permite encapsular varios datos en una clase que representa un objeto de
nuestra aplicación, ya sea un objeto tangible o no. Un ejemplo sería crear una
variable que almacene los datos de un usuario, como su nombre, edad...
### Nota: Desarrollaremos este apartado en un tema específico más adelante.

## 4. Colecciones: 
Kotlin proporciona varias colecciones para almacenar conjuntos de
datos, como arreglos y listas. Los arreglos (Array) son útiles cuando se necesita una
colección con un tamaño fijo y acceso rápido a los elementos por índice, mientras
que las listas (List) proporcionan flexibilidad en términos de tamaño y mutabilidad,
lo que las hace más adecuadas para la mayoría de las situaciones donde se necesita
una colección de elementos dinámica. Las listas también nos proporcionan
funcionalidad adicional para realizar operaciones con los elementos de la colección,
como ordenar, buscar...
### Ejemplos:
```kotlin
//Arrays
val numeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)
val nombres: Array<String> = arrayOf("Juan", "Pedro", "Ana")

//Acceder a un elemento y modificarlo
nombres[0] = "Rosa"


//Listas
val numerosLista: List<Int> = listOf(1, 2, 3, 4, 5)
val nombresLista: MutableList<String> = mutableListOf("Juan",
"Pedro", "Ana")

//Añadir un valor
nombresLista.add("Rosa")

//Obtener un valor
val primerNumero = numerosLista.get(0)
```
### Explicación: 
En estos ejemplos, declaramos variables que contienen arrays y listas de
diferentes tipos de datos.
### Nota: 
En programación, se considera que la posición del primer elemento de una
colección tiene el índice 0.

## 5. Otras colecciones: 
Existen otros tipos de colecciones que podemos mencionar:
Colecciones Set: Un Set es una colección de elementos únicos y desordenados. Esto
significa que no puede contener elementos duplicados y no garantiza ningún orden
específico de los elementos.
Diccionarios Map: Un Map (o diccionario) es una colección de pares clave-valor,
donde cada clave es única y se utiliza para recuperar su correspondiente valor
asociado. Los elementos en un Map están organizados de manera que la búsqueda y
recuperación de valores sean eficientes. Los Map se utilizan comúnmente para
representar datos estructurados y realizar búsquedas rápidas de valores basados en
una clave dada.

## 6. Tipo de Dato Genérico (Any): 
El tipo Any sirve como raíz de la jerarquía de clases
de Kotlin. Es la superclase de todos los tipos de valores en Kotlin. Cada clase de Kotlin
hereda implícitamente de Any. Esto significa que puede usar Any como un tipo
genérico para indicar que una variable o parámetro de función puede contener
cualquier tipo de objeto. Dado que todas las clases de Kotlin heredan de Any, puedes
usar Any como un tipo común para manejar objetos de forma polimórfica. Es útil
cuando tiene una colección de objetos de diferentes tipos, pero desea realizar
operaciones comunes a todos. Entenderemos más sobre este concepto cuando
expliquemos las clases.

## 7. Anulabilidad: 
En Kotlin, la anulabilidad es una característica que permite expresar
la posibilidad de que un objeto o variable pueda tener un valor nulo. Esto es
importante para evitar errores de referencia nula (NullPointerException) que son
comunes en otros lenguajes de programación.

Para entender cómo funciona la anulabilidad en Kotlin, es fundamental comprender
los siguientes conceptos:
- Tipos de datos anulables: En Kotlin, los tipos de datos no pueden ser nulos
por defecto, lo que significa que una variable de tipo String no puede
contener un valor nulo. Sin embargo, puedes hacer que un tipo de datos sea
anulable agregando un signo de interrogación ? después del tipo de dato,
como en String?, indicando que esa variable puede contener tanto valores
del tipo String como null.
```kotlin
var cadena: String? = null
//Asigna un valor nulo a la variable cadena.

var cadena2: String = null
//Esto daría error.
```
- Operador de seguridad de llamada (?.): Este operador se utiliza para acceder
a miembros de un objeto solamente si el objeto no es nulo. Si el objeto es
nulo, la expresión completa se evalúa como nula.
```kotlin
println(cadena?.length)
//Imprime null porque cadena es nula
```
- Operador de elvis (?:): Se utiliza para proporcionar un valor predeterminado
en caso de que una expresión sea nula. Por ejemplo:
```kotlin
val longitud: Int = cadena.length ?: 0
//Asigna 0 a la variable longitud si cadena es nula.
```
