# Programación Orientada a Objetos con Kotlin

## 1. Introducción a la Programación Orientada a Objetos (POO)
La Programación Orientada a Objetos (POO) es un paradigma de programación
basado en el concepto de "objetos", entidades que representan una abstracción de
algún hecho o ente del mundo real, que pueden contener datos y métodos. La POO
se centra en el diseño de software alrededor de objetos que interactúan entre sí.

**Ejemplo sencillo:** una clase es como el diseño de un vehículo y un objeto es
un vehículo real. Podemos fabricar muchos vehículos siguiendo el mismo diseño.

```kotlin
class Vehiculo(val marca: String, val color: String) {
    fun arrancar() = println("El vehículo $marca de color $color ha arrancado")
}

fun main() {
    val miVehiculo = Vehiculo("Toyota", "azul")
    miVehiculo.arrancar()
}
```
### 1.1. Concepto básico de clases y objetos
Una clase es un plano para crear objetos, define las propiedades y métodos
que los objetos de esa clase pueden tener. Los objetos son instancias de una
clase, es decir, representan casos concretos de la clase.

**Ejemplo:** `Vehiculo` puede ser la clase y `miCoche` un objeto concreto.
Podemos crear varios vehículos, cada uno con una marca y un color distintos.
### 1.2. Propiedades y métodos

#### - Propiedades: 

Son variables asociadas a un objeto que representan su estado,
características o propiedades.

Por ejemplo, un vehículo puede tener las propiedades `marca` y `color`.

#### - Métodos: 

Son funciones asociadas a un objeto que representan su
comportamiento.

Por ejemplo, un vehículo puede tener el método `arrancar()`, que representa una
acción que puede realizar.
### 1.3. Ventajas de la POO
- Reutilización de código.
- Abstracción y encapsulamiento.
- Facilita el mantenimiento y la organización del código.

**Ejemplo práctico:** si tenemos 20 vehículos, escribimos el código para
arrancar una sola vez en la clase `Vehiculo` y después lo reutilizamos en los 20
objetos.

## 2. Clases y Objetos en Kotlin
En Kotlin, la definición de una clase es similar a otros lenguajes orientados a objetos
como Java o C#. Para definir una clase, utilizaremos la palabra clave class.

### - Definir clase:

```kotlin
class Vehiculo {
    var marca: String = ""
    var color: String = ""

    fun arrancar() {
        println("El vehículo $marca de color $color ha arrancado")
    }
}
```


### - Crear objeto:
Crear un objeto de una clase es "instanciar" la clase utilizando el operador `new` en otros lenguajes, pero en Kotlin, simplemente llamamos al constructor de la clase como si fuera una función.

```kotlin
fun main() {
    val coche1 = Vehiculo()
    coche1.marca = "Toyota"
    coche1.color = "azul"
    coche1.arrancar()
}
```

Aquí `Vehiculo` es el molde y `coche1` es un vehículo concreto. Podemos cambiar
los datos de `coche1` sin cambiar el molde.

## 3. Constructores
Los constructores son funciones especiales utilizadas para inicializar las propiedades
de una clase. En Kotlin, hay dos tipos de constructores: primario y secundario.
Podemos crear tantos constructores secundarios como sobrecargas necesitemos
realizar del constructor primario. También tenemos el método init que se utiliza
para ejecutar código de inicialización.
### 3.1. Constructor primario:
```kotlin
class Vehiculo(var marca: String, var modelo: String) {
    // El constructor primario define marca y modelo

    fun mostrarDatos() {
        println("$marca $modelo")
    }
}

fun main() {
    val coche = Vehiculo("Toyota", "Yaris")
    coche.mostrarDatos()
}
```

**Ejemplo cotidiano:** al crear la ficha de un vehículo, indicamos su marca y su
modelo desde el principio. Esos datos son los parámetros del constructor primario.

### 3.2. Constructor secundario:
```kotlin
class Vehiculo(var marca: String, var modelo: String) {
    // Propiedad declarada en el cuerpo de la clase
    var color: String = "blanco"

    // Constructor secundario
    constructor(marca: String, modelo: String, color: String)
    : this(marca, modelo) {
        this.color = color
    }
}

fun main() {
    // Utilizando el constructor primario
    val coche1 = Vehiculo("Toyota", "Yaris")
    println("${coche1.marca} ${coche1.modelo}, color ${coche1.color}")

    // Utilizando el constructor secundario
    val coche2 = Vehiculo("Seat", "Ibiza", "rojo")
    println("${coche2.marca} ${coche2.modelo}, color ${coche2.color}")
}
```

**Ejemplo cotidiano:** podemos crear un vehículo indicando solo marca y modelo,
o añadir también el color usando otra forma de construir el objeto.


### 3.3. Bloque de inicialización:
```kotlin
class Vehiculo(var marca: String, var modelo: String) {
    var momentoDeCreacion: Long = 0

    // Inicialización en el bloque init
    init {
        println("Creando el vehículo $marca $modelo")
        // Guardamos el momento de creación en milisegundos
        this.momentoDeCreacion = System.currentTimeMillis()
    }
}
```

**Ejemplo sencillo:** `init` es como una alarma que suena justo al crear el
vehículo. Sirve para preparar datos o mostrar un mensaje de bienvenida.

### 3.4. Ejemplo completo:
```kotlin
class Vehiculo(var marca: String, var modelo: String) {
    // Constructor primario

    // Propiedades declaradas en el cuerpo de la clase
    var color: String = "blanco"
    var momentoDeCreacion: Long = 0

    // Inicialización en el bloque init
    init {
        println("Creando el vehículo $marca $modelo")
        // Guardamos el momento de creación en milisegundos
        this.momentoDeCreacion = System.currentTimeMillis()
    }

    // Constructor secundario que recibe un parámetro más
    constructor(marca: String, modelo: String, color: String)
    : this(marca, modelo) {
        this.color = color
    }

    fun mostrarDatos() {
        println("$marca $modelo de color $color")
    }
}

fun main() {
    val coche1 = Vehiculo("Toyota", "Yaris")
    coche1.mostrarDatos()

    val coche2 = Vehiculo("Seat", "Ibiza", "rojo")
    coche2.mostrarDatos()
}
```



En este ejemplo se usan las ideas anteriores: el constructor prepara los datos,
`init` anuncia la creación y `mostrarDatos()` realiza una acción.

## 4. Herencia
La herencia es un concepto importante en la POO que permite a una clase heredar
propiedades y métodos de otra clase.

En Kotlin, una clase puede heredar de otra
clase utilizando la palabra clave :, se utiliza la palabra clave open para permitir que
una clase sea heredada o permitir sobrescribir un método. Y utilizamos la palabra
clave override para sobrescribir métodos.

**Ejemplo:** `Vehiculo` es la clase general. Todos los vehículos tienen marca,
modelo y color. Una moto hereda esos datos y añade que tiene dos ruedas y un
manillar; un coche también los hereda, pero tiene cuatro ruedas y un volante.
```kotlin
// Clase general: todos los vehículos comparten estos datos
open class Vehiculo(
    val marca: String,
    val modelo: String,
    val color: String
) {
    open fun mostrarInformacion() {
        println("$marca $modelo de color $color")
    }
}

// La moto hereda marca, modelo y color, y añade sus propios datos
class Moto(marca: String, modelo: String, color: String) : Vehiculo(marca, modelo, color) {
    val numeroDeRuedas = 2
    val tieneManillar = true

    override fun mostrarInformacion() {
        println("Moto: $marca $modelo, $color, $numeroDeRuedas ruedas y manillar")
    }
}

// El coche también hereda los datos comunes y añade los suyos
class Coche(marca: String, modelo: String, color: String) : Vehiculo(marca, modelo, color) {
    val numeroDeRuedas = 4
    val tieneVolante = true

    override fun mostrarInformacion() {
        println("Coche: $marca $modelo, $color, $numeroDeRuedas ruedas y volante")
    }
}

// Probando la herencia
fun main() {
    val moto = Moto("Honda", "CB125", "roja")
    moto.mostrarInformacion()

    val coche = Coche("Toyota", "Yaris", "azul")
    coche.mostrarInformacion()
}
```


## 5. Polimorfismo
El polimorfismo permite que los objetos de diferentes clases respondan al mismo
mensaje de manera diferente. En Kotlin, el polimorfismo se logra mediante la
herencia y la sobreescritura de métodos.

**Ejemplo sencillo:** la orden "moverse" es la misma para una moto y un coche,
pero cada vehículo puede responder de una manera distinta.
```kotlin
interface VehiculoAccion {
    fun moverse()
}

class MotoAccion : VehiculoAccion {
    override fun moverse() {
        println("La moto avanza entre los coches")
    }
}

class CocheAccion : VehiculoAccion {
    override fun moverse() {
        println("El coche avanza por la carretera")
    }
}

fun main() {
    val vehiculos: List<VehiculoAccion> = listOf(MotoAccion(), CocheAccion())
    for (vehiculo in vehiculos) {
        vehiculo.moverse()
    }
}
```
### Explicación: La interfaz `VehiculoAccion` indica que cualquier vehículo debe
tener una acción `moverse()`. La moto y el coche implementan esa misma acción de
forma diferente. Esto demuestra el concepto de polimorfismo en Kotlin.

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
class Vehiculo {
    private var marca: String = ""
    private var modelo: String = ""

    public fun mostrarDatos() {
        println("Vehículo: $marca $modelo")
    }
}
```

**Ejemplo cotidiano:** un vehículo guarda su velocidad dentro. No dejamos que
cualquiera la cambie directamente; solo permitimos acciones controladas como
`acelerar()` y `frenar()`.

```kotlin
class VehiculoSeguro {
    private var velocidad = 0

    fun acelerar() {
        velocidad += 10
    }

    fun frenar() {
        velocidad = 0
    }

    fun consultarVelocidad(): Int = velocidad
}
```

Como `velocidad` es `private`, solo el propio vehículo puede modificarla.


## 7. Scope (Ámbito)
En programación, el término "scope" se refiere al alcance o la visibilidad de una
variable dentro de un programa. El scope determina dónde una variable es válida y
accesible dentro del código. Hay varios niveles de scope en Kotlin:
### 7.1. Scope de Clase
Las variables declaradas a nivel de clase tienen un scope que abarca toda la clase.
Estas variables son accesibles desde cualquier método o bloque dentro de la clase.

**Ejemplo:** la marca de un vehículo se puede usar desde cualquiera de sus
métodos porque pertenece a la clase `Vehiculo`.
### 7.2. Scope de Método
Las variables declaradas dentro de un método tienen un scope limitado a ese
método específico. Estas variables solo son accesibles dentro del cuerpo del método
en el que fueron declaradas.
Los parámetros de una función tienen un scope limitado a esa función. Estos
parámetros son variables locales que solo son accesibles dentro de la función en la
que fueron definidos.

**Ejemplo:** `velocidadFinal` puede usarse dentro de `calcularVelocidad`, pero deja de existir al
terminar la función. Es como una nota que solo sirve durante una actividad.

### 7.3. Scope Global
Las variables globales tienen un scope que abarca todo el programa. Estas variables
son accesibles desde cualquier parte del código, pero su uso excesivo puede hacer
que el código sea menos legible y propenso a errores.

**Ejemplo:** `MARCA_FAVORITA` está fuera de las funciones, por eso puede
utilizarse desde `mostrarMarcaFavorita` y desde cualquier otra función del archivo.

### Ejemplos:
```kotlin
class Vehiculo {
    var marca: String = "Toyota" // Scope de clase (propiedades)

    fun arrancar() { // Scope de clase (funciones)
        println("El vehículo $marca ha arrancado")
    }
}

fun calcularVelocidad(velocidadInicial: Int, aumento: Int): Int {
    val velocidadFinal = velocidadInicial + aumento // Scope del método
    return velocidadFinal
}

val MARCA_FAVORITA = "Toyota" // Scope global

fun mostrarMarcaFavorita() {
    println("Mi marca favorita es $MARCA_FAVORITA")
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

**Pequeño reto práctico:** crea una clase `Vehiculo` con las propiedades `marca`,
`modelo` y `color`, y los métodos `arrancar()` y `frenar()`. Después crea una
moto y un coche con datos distintos y prueba sus métodos. Así practicarás clases,
objetos, propiedades y métodos con un ejemplo fácil de imaginar.
