package Classes

fun main(args: Array<String>) {
    val persona = Persona("David Barboza",29)

    println(persona.nombre) //ya esta accesibles los atributos de la clase
    println(persona.edad)
    println(persona.esMayor)// se pueden crear nuestros propios getter

    persona.edad = 16
    println(persona.edad)
    println(persona.esMayor)
}