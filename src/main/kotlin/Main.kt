fun main(args: Array<String>) {
    println("Bem vindo ao Bytebank")
    var i = 0
    while (i < 5) {
        val titular: String = "Danilo  $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0
        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")

    }
    for (i in 1..5) {
        println(i)
    }

}


fun testaCondicional(saldo: Double) {
    if (saldo > .00) {
        println("Valor : $saldo consta positivo")
    } else if (saldo == .000) {
        println("Valor : $saldo consta neutro")
    } else {
        println("Valor : $saldo consta negativo")
    }

}