package org.aytachuseynli.loop

import kotlin.text.Typography.times

/**
 *
 * 3 farkli sekilde for tanimlayabilirsiniz.
 * value in list                           seklinde value degerlerini alabilirsiniz.
 * index in list.indices                   seklinde index degerlerini alabilirsiniz.
 * (index, value) in list.withIndex()      seklinde index, value degerlerini alabilirsiniz.
 *
 **/

fun main() {
    val value2:Int = 45
    for (value: Int in 1..10){
        print("$value")
    }

    val countryCodeArray = arrayOf("tr", "az", "en", "fr")
    val countryCodeArrayChar = arrayOf('A', 'B', 'C', 'D')

    for (value in countryCodeArray){
        print("$value")
    }

    for (value:Char in 'A'..'Z'){
        print("$value")
    }

    for (index in countryCodeArray.indices){
        print("\n$index . degeri : ${countryCodeArray[index]}")
    }

    for ((index, value) in countryCodeArray.withIndex()){

    }

    /*------------------------------------------------------------------*/

    /**
     * repeat(size) seklinde herhangi bir listeye ihtiyac duymadan tekrarlanan isler yapabilirsiniz.
     **/

    repeat(10){
        println("\nDaha cok blog yazmam lazim!")
    }

    /*------------------------------------------------------------------*/

    /**
     * return kullanarak ilgili sart saglanirsa, donguden cikabilirsiniz.
     * continue kullanarak ilgili sart saglanirsa, donguyu o degeri atlayarak devam edebilirsiniz.
     * break sart saglaniyorsa, donguyu kirar. Sonraki islemi yapar.
     *
     */

    for (value in 1..50){
        if (value % 2 == 1){
            continue
        }
        println("\n$value")
    }

    for (value in 1..50){
        if (value % 2 == 1){
            break
        }
        println("\n$value")
    }

    var number = 1
    while (number % 2 == 0){
        print("\n${number++}")
    }

    /*---------------------------------------------------------------*/

    /**
     * Ic-Ice donguleri kullaniyorsak bir ustteki for`a degil de iki ustteki,
     * uc ustteki for`a donmek istiyorsak label kullanabiliriz.
     * Bunun icin labelname@ ifadesini ilgili for`un onune yazip, return ya da continue yapacagimiz
     * yere ise @labelname seklinde yazmamiz yeterlidir.
     */

    for (value in 1..50){
        for (value2 in 0..10){
            if(value2 == 5){
                continue
            }
            print("continue1: $value2 | ")
        }
    }

    println("")

    /**
     * ic ice donguleri bir listenin en buyuk elemanini bulmak icin kullana biliriz.
     * Listedeki elemanlari indekslarine gore bir-biri ile karsilastirip en buyugunu bulur.
     *
     */

    returnlabel@ for (value in 1..50){
        for (value2 in 0..10){
            if (value2 == 5){
                continue@returnlabel
            }
        }
    }

    for (value in 1..50){
        for (value2 in 0..10){
            if (value2 == 5){
                break
            }
            print("break1: $value2")
        }
    }
}