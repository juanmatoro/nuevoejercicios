# Programación Orientada a Objetos con Kotlin

## 1. Introducción a la Programación Orientada a Objetos (POO)
La Programación Orientada a Objetos (POO) es un paradigma de programación
basado en el concepto de "objetos", entidades que representan una abstracción de
algún hecho o ente del mundo real, que pueden contener datos y métodos. La POO
se centra en el diseño de software alrededor de objetos que interactúan entre sí.
### 1.1. Concepto básico de clases y objetos
Una clase es un plano para crear objetos, define las propiedades y métodos
que los objetos de esa clase pueden tener. Los objetos son instancias de una
clase, es decir, representan casos concretos de la clase.
### 1.2. Propiedades y métodos

#### - Propiedades: 

Son variables asociadas a un objeto que representan su estado,
características o propiedades.

#### - Métodos: 

Son funciones asociadas a un objeto que representan su
comportamiento.
### 1.3. Ventajas de la POO
- Reutilización de código.
- Abstracción y encapsulamiento.
- Facilita el mantenimiento y la organización del código.

## 2. Clases y Objetos en Kotlin
En Kotlin, la definición de una clase es similar a otros lenguajes orientados a objetos
como Java o C#. Para definir una clase, utilizaremos la palabra clave class.

### - Definir clase:

```kotlin
class Persona {
    var nombre: String = ""
    var edad: Int = 0

    fun saludar() {
        println("Hola, mi nombre es $nombre y tengo $edad años.")
    }
}
```


### - Crear objeto:

```kotlin
fun main() {
    val persona1 = Persona()
    persona1.nombre = "Juan"
    persona1.edad = 30
    persona1.saludar()
}
```

## 3. Constructores
Los constructores son funciones especiales utilizadas para inicializar las propiedades
de una clase. En Kotlin, hay dos tipos de constructores: primario y secundario.
Podemos crear tantos constructores secundarios como sobrecargas necesitemos
realizar del constructor primario. También tenemos el método init que se utiliza
para ejecutar código de inicialización.
### 3.1. Constructor primario:
```kotlin
class Persona(var nombre: String, var edad: Int) {
    //El constructor primario define dos propiedades: nombre y edad
}

fun main() {
    val persona1 = Persona("Juan", 30)
    persona1.saludar()
}
```

### 3.2. Constructor secundario:
```kotlin
class Persona(var nombre: String, var edad: Int) {
    //El constructor primario define dos propiedades: nombre y edad
    // Propiedades declaradas en el cuerpo de la clase
    var ciudad: String = ""
    // Constructor secundario
    constructor(nombre: String, edad: Int, ciudad: String)
    : this(nombre, edad) {
        this.ciudad = ciudad
    }
}

fun main() {
    // Utilizando el constructor primario
    val persona1 = Persona("Juan", 30)
    persona1.saludar()

    // Utilizando el constructor secundario
    val persona2 = Persona("María", 25, "Madrid")
    persona2.saludar()
}
```


### 3.3. Bloque de inicialización:
```kotlin
class Persona(var nombre: String, var edad: Int) {
    // Propiedades declaradas en el cuerpo de la clase
    var fechaRegistro: Long = 0

    // Inicialización en el bloque init
    init {
        println("Creando una nueva persona llamada $nombre")
        // Obtengo la hora y el dia del calendario
        this.fechaRegistro = Calendar.getInstance().time
    }
}
```

### 3.4. Ejemplo completo:
```kotlin
class Persona(var nombre: String, var edad: Int) {
    // Constructor primario

    // Propiedades declaradas en el cuerpo de la clase
    var ciudad: String = ""
    var fechaRegistro: Long = 0

    // Inicialización en el bloque init
    init {
        println("Creando una nueva persona llamada $nombre")
        // Obtengo la hora y el dia del calendario
        this.fechaRegistro = Calendar.getInstance().time
    }

    // Constructor secundario que recibe un parámetro mas
    constructor(nombre: String, edad: Int, ciudad: String)
    : this(nombre, edad) {
        this.ciudad = ciudad
    }

    fun saludar() {
        println("Hola, mi nombre es $nombre, tengo $edad años y vivo en $ciudad.")
    }
}

fun main() {
    val persona1 = Persona("Juan", 30)
    persona1.saludar()

    val persona2 = Persona("María", 25, "Madrid")
    persona2.saludar()
}
```



## 4. Herencia
La herencia es un concepto importante en la POO que permite a una clase heredar
propiedades y métodos de otra clase. En Kotlin, una clase puede heredar de otra
clase utilizando la palabra clave :, se utiliza la palabra clave open para permitir que
una clase sea heredada o permitir sobrescribir un método. Y utilizamos la palabra
clave override para sobrescribir métodos.
```kotlin
// Clase para representar animales
open class Animal(val nombre: String) {
    open fun hacerSonido() {
        println("Haciendo sonido")
    }
}

// Clases que heredan de Animal
class Perro(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("Guau!")
    }
}

class Gato(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("Miau!")
    }
}

// Probando la herencia
fun main() {
    val perro = Perro("Fido")
    perro.hacerSonido()

    val gato = Gato("Garfield")
    gato.hacerSonido()
}
```


## 5. Polimorfismo
El polimorfismo permite que los objetos de diferentes clases respondan al mismo
mensaje de manera diferente. En Kotlin, el polimorfismo se logra mediante la
herencia y la sobreescritura de métodos.
```kotlin
interface Figura {
    fun calcularArea(): Double
    fun calcularPerimetro(): Double
}


class Circulo(val radio: Double) : Figura {
    override fun calcularArea(): Double {
        return Math.PI * radio * radio
    }

    override fun calcularPerimetro(): Double {
        return 2 * Math.PI * radio
    }
}

class Cuadrado(val lado: Double) : Figura {
    override fun calcularArea(): Double {
        return lado * lado
    }

    override fun calcularPerimetro(): Double {
        return 4 * lado
    }
}

class Triangulo(val base: Double, val altura: Double) : Figura {
    override fun calcularArea(): Double {
        return base * altura / 2
    }

    override fun calcularPerimetro(): Double {
        // Este cálculo dependerá del tipo de triángulo (equilátero,
isósceles, escaleno)
        // Por simplicidad, consideremos un triángulo equilátero
        return 3 * base
    }
}

fun main() {
    val circulo = Circulo(5.0)
    println("Área del círculo: ${circulo.calcularArea()}")
    println("Perímetro: ${circulo.calcularPerimetro()}")

    val cuadrado = Cuadrado(4.0)
    println("Área del cuadrado: ${cuadrado.calcularArea()}")
    println("Perímetro: ${cuadrado.calcularPerimetro()}")

    val triangulo = Triangulo(6.0, 4.0)
    println("Área del triángulo: ${triangulo.calcularArea()}")
    println("Perímetro: ${triangulo.calcularPerimetro()}")
}
```
### Explicación: Con este ejemplo, se ilustra cómo una interfaz Figura puede ser
implementada por diferentes clases (Circulo, Cuadrado, Triangulo...) y cada una de
ellas proporciona su propia implementación para los métodos calcularArea() y
```kotlin
calcularPerimetro(). Esto demuestra el concepto de polimorfismo en Kotlin.
```

## 6. Encapsulamiento
El encapsulamiento es el ocultamiento de los detalles de implementación de una
clase y solo mostrando las operaciones públicas. En Kotlin, se utilizan los
modificadores de acceso public, private, protected e internal para controlar el
acceso a las propiedades y métodos de una clase.
- Si no usa un modificador de visibilidad, se usa public de forma
predeterminada, lo que significa que la declaración será visible para todos.
- Si marca una declaración como private, solo será visible dentro de la clase que
contiene la declaración.
- Si lo marca como internal, será visible en todas partes del mismo módulo.
- El modificador protected permite ocultar declaraciones a otras clases, pero no
a las que heredan de la clase que contiene la declaración.
```kotlin
class Persona {
    private var nombre: String = ""
    private var edad: Int = 0

    public fun saludar() {
        println("Hola, mi nombre es $nombre y tengo $edad años.")
    }
}
```


## 7. Scope (Ámbito)
En programación, el término "scope" se refiere al alcance o la visibilidad de una
variable dentro de un programa. El scope determina dónde una variable es válida y
accesible dentro del código. Hay varios niveles de scope en Kotlin:
### 7.1. Scope de Clase
Las variables declaradas a nivel de clase tienen un scope que abarca toda la clase.
Estas variables son accesibles desde cualquier método o bloque dentro de la clase.
### 7.2. Scope de Método
Las variables declaradas dentro de un método tienen un scope limitado a ese
método específico. Estas variables solo son accesibles dentro del cuerpo del método
en el que fueron declaradas.
Los parámetros de una función tienen un scope limitado a esa función. Estos
parámetros son variables locales que solo son accesibles dentro de la función en la
que fueron definidos.

### 7.3. Scope Global
Las variables globales tienen un scope que abarca todo el programa. Estas variables
son accesibles desde cualquier parte del código, pero su uso excesivo puede hacer
que el código sea menos legible y propenso a errores.

### Ejemplos:
```kotlin
class Persona {
    var nombre: String = "Juan" // Scope de clase (propiedades)

    fun saludar() { // Scope de clase (funciónes)
        println("Hola, mi nombre es $nombre.")
    }
}

fun sumar(a: Int, b: Int): Int { // Scope del método (parámetros)
    val resultado = a + b // Scope del método (variables)
    return resultado
}

val PI = 3.14159 // Scope global

fun calcularAreaCirculo(radio: Double): Double {
    return PI * radio * radio
}
```


## 8. Conclusiones
La programación orientada a objetos es un paradigma poderoso que facilita el
desarrollo de software modular, escalable y mantenible. Kotlin ofrece características
avanzadas de POO que permiten a los desarrolladores crear aplicaciones robustas y
eficientes.
Para dominar la programación orientada a objetos con Kotlin, te recomendamos
continuar practicando y explorando para investigar otros conceptos como, las
extensiones, data class y sealed class entre otros.
En la documentación oficial de Kotlin encontraras todo lo necesario sobre estos
temas y más.
