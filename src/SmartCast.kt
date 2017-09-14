
// 3 x 4 x 2 + 2 + 4
interface Expresion
class Numero(val valor:Int) : Expresion
class Sumar(val valorA: Expresion, val valorB: Expresion) : Expresion
class Multiplicar(val valorA: Expresion, val valorB: Expresion) : Expresion

/*fun evaluarExpresion(expresion: Expresion):Int{
    if(expresion is Numero){
        return expresion.valor
    } else if(expresion is Sumar){
        return evaluarExpresion(expresion.valorA) + evaluarExpresion(expresion.valorB)
    } else if (expresion is Multiplicar){
        return evaluarExpresion(expresion.valorA) * evaluarExpresion(expresion.valorB)
    } else {
        throw IllegalArgumentException("No se puede reconocer la expresion")
    }
} forma anterior con if, el siguiente bloque lo hace usando "when"*/

fun evaluarExpresion(expresion: Expresion):Int = when(expresion){
    is Numero -> expresion.valor
    is Sumar -> evaluarExpresion(expresion.valorA) + evaluarExpresion(expresion.valorB)
    is Multiplicar -> evaluarExpresion(expresion.valorA) * evaluarExpresion(expresion.valorB)
    else -> throw IllegalArgumentException("No se puede reconocer la expresion")
}

fun main(args: Array<String>) {
    println(evaluarExpresion(Multiplicar(Numero(3),Numero(4))))
}