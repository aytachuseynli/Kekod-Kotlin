package org.aytachuseynli.functions


fun main() {
    calculateAndPrintNormal(2, 4,'*')
    calculateAndPrintNormal(5,44,'+')
    calculateAndPrintNormal(55,5,'/')
    calculateAndPrintNormal(112,434,'-')
    calculateAndPrintNormal(112,434,'%')

    print("Birinci sayıyı giriniz: ")
    val numberOne = readLine()!!.toInt()

    print("İkinci sayıyı giriniz: ")
    val numberTwo = readLine()!!.toInt()

    print("İşlem türünü giriniz: ")
    val operation: String = readLine()!!

    val sumFunction = {numberOne:Int, numberTwo:Int -> numberOne + numberTwo}

    val minusFunction = fun(numberOne:Int, numberTwo:Int):Int{
        return numberOne - numberTwo
    }

    val multiplyFunction = (fun(numberOne:Int, numberTwo:Int): Int = numberOne + numberTwo)

    when(operation){
        "+" -> calculateAndPrint (numberOne, numberTwo, { numberOne, numberTwo -> numberOne * numberTwo })
        "+" -> calculateAndPrint (numberOne, numberTwo) { numberOne, numberTwo -> numberOne * numberTwo }
        "+" -> calculateAndPrint(numberOne, numberTwo, sumFunction)

        "-" -> calculateAndPrint(numberOne, numberTwo, { numberOne, numberTwo -> numberOne + numberTwo })
        "-" -> calculateAndPrint(numberOne, numberTwo, minusFunction)

        "*" -> calculateAndPrint(numberOne, numberTwo, { numberOne, numberTwo -> numberOne - numberTwo })
        "*" -> calculateAndPrint(numberOne, numberTwo, multiplyFunction)

        "/" ->calculateAndPrint(numberOne, numberTwo, { numberOne, numberTwo -> numberOne / numberTwo })

        //fonksiyonun body`sini kullanmak istedikde :: kullanılır (parametre sayısı, tipi, geri dönüş tipi aynı olmalı).
        "/" ->calculateAndPrint(numberOne, numberTwo,::divFunction)
        "/" ->calculateAndPrint(numberOne, numberTwo,::divFunction2)


//    "/" ->calculateAndPrint(numberOne, numberTwo, divFunction2(23, 32))
//    "/" ->calculateAndPrint(numberOne, numberTwo, ::divFunction2(23, 32))

    }
}


fun divFunction(numberOne: Int, numberTwo: Int): Int{
    return numberOne / numberTwo
}
fun divFunction2(numberOne: Int, numberTwo: Int): Int = numberOne / numberTwo



fun calculateAndPrintNormal(numberOne: Int, numberTwo: Int, operation: Char){
    val result = when(operation){
        '+' -> {
            numberOne + numberTwo
        }
        '-' -> {
            numberOne - numberTwo
        }

        '*' -> {
            numberOne * numberTwo
        }

        '%' -> {
            numberOne % numberTwo
        }

        '/' -> {
            numberOne / numberTwo
        }

        else -> {
            numberOne + numberTwo
        }

    }

    println("Result: $result")

}

fun calculateAndPrint(numberOne: Int, numberTwo: Int, operation: (Int, Int) -> Int): Unit{
    val result = operation(numberOne, numberTwo)
    println("Result: $result")
}

//fun calculateAndPrint4(
//    numberOne: Int = 3,
//    numberTwo: Int = 4,
//    operation(Int, Int) -> Int = {numberOne, numberTwo -> numberOne + numberTwo}
//) {
//    val result = operation(numberOne, numberTwo)
//    println("Result: $result")
//}

/*
fun calculateAndPrint2(numberOne: Int, numberTwo: Int, operation: (numberOne:Int, numberTwo:Int, foo:() -> Unit) -> Int): Unit{
    val result = operation(numberOne, numberTwo)
    println("Result: $result")

}
fun calculateAndPrint3(numberOne: Int, numberTwo: Int, operation: (numberOne:Int, numberTwo:Int) ->()-> Int): Unit{
    val result = operation(numberOne, numberTwo)
    println("Result: $result")

}

*/






/*
Higher Order Fonksiyon -
Bir fonksiyon parametre olarak başka bir fonskiyona veriliyor ve ya
Bir fonksiyon bir fonksiyonun geri dönüş tipi oluyor
 */