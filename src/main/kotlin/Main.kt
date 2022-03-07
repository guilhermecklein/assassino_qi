fun main(){
    println("Digite  1- Sim    2- Não ")
    val detetive = detetive()

    var contagem = 0
    println("Você telefonou para a vitima? ")
    if(readLine()!!.toInt()  == 1) contagem++

    println("Você esteve no local do crime? ")
    if(readLine()!!.toInt() == 1) contagem++

    println("Você mora perto da vitima? ")
    if(readLine()!!.toInt() == 1) contagem++

    println("Você devia para a vitima? ")
    if(readLine()!!.toInt() == 1) contagem++

    println("Você já trabalhou com a vitima? ")
    if(readLine()!!.toInt() == 1) contagem++

    if (contagem == 5) {
        println("Você é um assassino!")

    } else if (contagem < 2) {
        println("Você é inocente!")

    } else if (contagem == 2) {
        println("Você é um suspeito!")

    } else if (contagem == 3 ||  contagem == 4)
        println("Você é um Cúmplice!")

}

fun detetive() {

    var contagem = 0
    println("Você telefonou para a vitima? ")
    if(readLine()!!.toInt()  == 1) contagem++

    println("Você esteve no local do crime? ")
    if(readLine()!!.toInt() == 1) contagem++

    println("Você mora perto da vitima? ")
    if(readLine()!!.toInt() == 1) contagem++

    println("Você devia para a vitima? ")
    if(readLine()!!.toInt() == 1) contagem++

    println("Você já trabalhou com a vitima? ")
    if(readLine()!!.toInt() == 1) contagem++

    if (contagem == 5) {
        println("Você é um assassino!")

    } else if (contagem < 2) {
        println("Você é inocente!")

    } else if (contagem == 2) {
        println("Você é um suspeito!")

    } else if (contagem == 3 ||  contagem == 4)
        println("Você é um Cúmplice!")

}

