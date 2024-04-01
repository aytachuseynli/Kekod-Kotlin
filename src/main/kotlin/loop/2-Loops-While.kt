package org.aytachuseynli.loop

fun main() {

    /**
     * Degisen hic bir sey yok. Diger dillerde nasil kullaniyorsaniz Kotlin`de de ayni sekilde kullaniliyor.
     * Eger bir donguye ihtiyaciniz varsa ve bu dongu sirasinda if else ile bir sartli duruma ihtiyaciniz varsa
     * bu durumda for + if else kullanmak yerine while kullanabilirsiniz.
     */

    var number = 0

    while (number < 5){
        print("${number++}, ")
    }

    while (number < 5){
        print("$number , ")
        number++
    }

    println("-------------------")

    for (value in 0.. 110){
        if (value < 5){
            print("$value , ")
        } else {
            return
        }
    }


    /*------My Notes------------------------*/

    /**
     * Bu kod, i değişkeni başlangıçta 0 değeriyle başlar. Ardından,
     * do bloğu içindeki kod çalıştırılır ve sonra while koşulu kontrol edilir.
     * Koşul doğru olduğu sürece (i'nin değeri < 5 olduğu sürece) döngü devam eder.
     * Döngü her döndüğünde i değeri bir arttırılır ve döngü devam eder.
     *
     * Bu özel durumda, döngü en az bir kez çalıştırılacaktır çünkü do bloğu önce çalışır ve sonra koşul kontrol edilir.
     *
     */

    
    var i = 0
    do {
        println("Değer: $i")
        i++
    } while (i < 5)
}