package org.aytachuseynli.functions

/**
 *
 * fun keyword'u ile fonksiyonlar baslar.
 * fonksiyon ismi verilir.
 * parametre parantezleri acilir ve parantezler girilir.
 * : operatoru ve geri donus degeri yazilir.
 * fonksiyon body'si acilir ve kapatilir.
 * Geri donus degeri verilmeyen fonksiyonlar Unit tipini geri dondurur.
 */


fun name(): String = "Gokhan"
val name: String = "Gokhan"
fun main():Unit {


    //Fonksiyon cagrilirken ismi ve parametreleri kullanilir.
    //Eger bir geri donusu varsa bir degiskene atanabilir.

    //Bir fonksiyonun geri donus degeri yoksa onun tipini Unit olur.

    takeSquare(2)
    val squareValue = takeSquare(2)


    //Bir class`in bir fonksiyonunu cagirirken ise nokta isaretini kullaniriz.
    Math.pow(2.0, 3.0)

    /*--------------------------------------------------------------------*/


// Default degeri olan parametrelere sahip bir fonksiyon cagirilirken, default degeri olan parametrelere deger atamak // sart degildir. Default degeri olan bu parametreler opsiyonel parametrelerdir.
// Default degeri olan parametrelere deger atanmadan fonksiyon cagirilacaksa bu durumda parametre sirasi degisir. // Ide'ye hangi parametreye deger atadiginizi soylemek icin Named Arguments'leri kullanmaniz gerekir.
    reformatMessage("Message", true, 7, "tr")
    reformatMessage (message = "Message", size = 7, lang = "tr")
    reformatMessage("Message",true, 7)
    reformatMessage("Message", size = 7)










}

/**
 *  @param number degisken tanimlanir gibi tanimlanir.
 *  fonksiyon parametresi tanimlanirken, val var gibi betimleyiciler kullanilmaz.
 */

fun takeSquare(number: Int): Int {
    //fe
    //gsg
    //fgs

    return 2 * number
}

fun reformatMessage(message: String, isUpperCase: Boolean = false, size : Int, lang: String = "tr"){
    println("Message: " + message + "isUpperCase : " + isUpperCase + "Size : " + size + "lang : " + lang)
}