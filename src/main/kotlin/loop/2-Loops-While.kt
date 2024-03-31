package org.aytachuseynli.loop

/**
 *
 * 3 farkli sekilde for tanimlayabilirsiniz. value in list
 * index in list.indices
 * (index, value) in list.withIndex()
 * seklinde value degerlerini alabilirsiniz. seklinde index degerlerini alabilirsiniz. seklinde index, value degerlerini alabilirsiniz.
 *
 *
 */

fun main() {
    val value2:Int = 45
    for (value: Int in 1..10){
        print("$value")
    }

    val countryCodeArray = arrayOf("tr", "az", "en", "fr")

    for (value in countryCodeArray){
        print("$value")
    }
}