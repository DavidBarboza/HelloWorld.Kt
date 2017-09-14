import java.util.*

fun main(args: Array<String>) {
    println("Escribe tu nombre o pulsa Enter para seguir anonimo:")
    val scanner = Scanner(System.`in`)
    val nextLine = scanner.nextLine()
    //val name = if(nextLine != "")nextLine else "Anonimo"
    //println("Hola $name!")
    println("Hola ${if(nextLine != "")nextLine else "Anonimo"}!") //lo mismo pero en una linea

    //println(sumar(9,5 ))

    //println(esMayorDeEdad(19))
}

fun sumar(a: Int, b: Int) = a + b

fun esMayorDeEdad(edad:Int) = if(edad >= 18) true else false