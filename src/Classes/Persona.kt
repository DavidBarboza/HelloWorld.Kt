package Classes

class Persona(val nombre: String, var edad: Int){
    val esMayor : Boolean
        get() {
            return if(edad >= 18) true else false
        }
    //get()= if(edad >= 18)true else false //asi es en una linea
}