
fun convertirAPesosMxn(monto:Double, moneda: Moneda) = when(moneda){

    Moneda.ARS -> monto * 0.9323
    Moneda.BOB -> monto * 2.57907868
    Moneda.CLP -> monto * 34.6063
    Moneda.COP -> monto * 0.00607680656
    Moneda.MXN -> monto
    Moneda.PEN -> monto * 0.1813
    Moneda.PYG -> monto * 0.00315423684
    Moneda.USD -> monto * 0.0561
    Moneda.UYU -> monto * 0.61855119
}

fun obtenerRegion(moneda: Moneda) = when(moneda){
    Moneda.USD, Moneda.MXN -> "Norteamerica"

    Moneda.UYU, Moneda.COP, Moneda.BOB, Moneda.PEN, Moneda.ARS, Moneda.PYG, Moneda.CLP -> "Sudamerica"

}

fun main(args: Array<String>) {
    println(convertirAPesosMxn(100.00, Moneda.USD))
    println(obtenerRegion(Moneda.USD))
}