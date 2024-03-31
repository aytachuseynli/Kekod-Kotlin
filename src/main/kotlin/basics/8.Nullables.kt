package org.aytachuseynli.basics


/* Bir degiskene null deger atamasi yapabilmek icin
   degisken tipinin sonuna ? isareti konulur. */
fun main() {

    val name: String? = null
    val age: Int? = null


    /*
    Eger bir degiskene tip verilmez ve direkt null deger atamasi yapilirsa, IDE tip cikarimi yaparken
    bu degiskenin degerini Nothing? olarak isaretler. Cunku hangi tipe karsilik geldigini bilemez.
    */

//    val number = null


    val number:Nothing? = null
    val number3 = null //Nothing

    var number1: Int? = null
    var number2: Int? = null


    /*
    Elimizde nullable bir degisken varsa, bu degiskenin methodlarindan birine ihtiyac duyacaksak ya
    direkt olarak kullanacaksak bu durumda IDEye ya bu degiskenin null olmayacaginin garantisini !!
    operatoru ile vermek gerekiyor ya da null degilse calissin demek icin ?. operatorunu kullanmak gerekiyor
    */


    var result: Int? = 0
    result!!.plus(324)
    result?.plus(324)


    number1 = readLine()!!.toInt()
    number2 = readLine()!!.toInt()

    //yukarida readLine()`nin null olamayacagini soylediginiz icin
    // alt satirda tekrar nullable yazmamiza gerek kalmiyor.
    // (smart cast ozelligi)

    result = number1 + number2
    println(result)

}