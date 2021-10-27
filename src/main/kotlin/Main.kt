//4 - Crie um programa que leia 10 valores e identifique a quantidade de números pares e ímpares

fun main(args: Array<String>) {

    var num = 0
    var cont = 0
    var cont1 = 0
    var cont2 = 0

    while (cont < 10){
        print("Digite um número: ")
        num = readLine()!!.toInt()

        if (num %2 == 0){
            cont1++
        }else{
            cont2++
        }

        cont++
    }
    println("A quantidade de números pares foi de digitado é: $cont1")
    println("A quantidade de números ímpares foi de digitado é: $cont2")

}