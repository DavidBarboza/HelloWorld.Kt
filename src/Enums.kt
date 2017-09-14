
enum class Moneda(val simbolo:String){
    USD("$"), PEN("S/."), ARS("$"), MXN("$"), BOB("\$b"), CLP("$"), COP("$"), PYG("Gs"), UYU("\$U");

    fun formato(monto: Double) = "$simbolo $monto"

}

fun main(args:Array<String>){
    println(Moneda.ARS)
    println(Moneda.PEN.simbolo)
    println(Moneda.MXN.formato(230.00))
}