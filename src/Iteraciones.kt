
fun main(args: Array<String>) {

    val arreglo = arrayListOf("A","B","C","D","E")

    for((index,c) in arreglo.withIndex()){
        if(index.rem(2) == 0)
        println("$index $c")
    }
    //recorrer arreglo como un foreach
    /*for(c in arreglo){
        println(c)
    }*/

    //se puede usar until para incrementar y downTo para decrementar
    /*for(i in 10..20 step 2){
        println(i)
    }*/
}