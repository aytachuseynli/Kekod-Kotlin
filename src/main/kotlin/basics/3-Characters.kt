package org.aytachuseynli.basics


fun main()  {
    /**
     * 16 bit yer kaplar.
     *
     * Tek tirnaklarin arasina harf, sayi, escape char ya da unicode yazarak kullanilir.
     * Cift tirnak icerisine yazilirsa String olur, Char olmaz.
     */

    val firstCharOfName: Char = 'G'
//    val firstCharOfName2 : Char = "G"  //yanlis
//    val firstCharOfName3 : Char = 'Ay'  //yanlis

    val charNumber: Char = '6'
//    val charNumber2 : Char = '53'

    /*-----------------------------------------------------------------------------------------------*/

    /**
     *Number deger olan bir Char degisken Int`e cevrilirkenç gercek sayisal degerini almaz.
     * Alacagi deger ASCİİ tablosundaki o sayisal degerin karsiligi olacaktir.
     * */

    val convertedCharNumber = charNumber.toInt()
    val convertedCharNumber2 = charNumber.code
    val digitToInt = charNumber.digitToInt()
    println("charNumber = " + charNumber)
    println("convertedCharNumber = " + convertedCharNumber)
    println("convertedCharNumber2 = " + convertedCharNumber2)
    println("digitToInt = " + digitToInt)

    /*------------------------------------------------------------------------------------------------ */

    /**
     *  Escape karakterlerini de tanimlamak icin kullanilabilir.
     */

    val exampleString = "Kotlin`de escape karakteri örnekleri: \n " +
            "\t \\t ile bir tab boslugu ekleyebilirsiniz. \n"+
            "\t \\n ile bir yeni bir satira geçebilirsiniz. \n"+
            "\t \\b ile bir backspace (geri al) işlemi yapabilirsiniz. \n"+
            "\t \\r ile satır basına dönebilirsiniz. \n"+
            "\t \\' ile tek tirnak (') karakterini kullanabilirsiniz. \n"+
            "\t \\\"  ile cift tirnak (\") karakterini kullanabilirsiniz. \n" +
            "\t \\\\  ile ters slash (\\) karakterini kullanabilirsiniz. \n" +
            "\t \\\$  ile dolar isareti ($) karakterini kullanabilirsiniz. \n"


    println(exampleString)

    /*-------------------------------------------------------------------------------------------*/

    /**
     * Unicode karakterini de tanimlamak icin kullanilabilir.
     */

    val blackHeart = '\u2665'
    val heavyBlackHeart = '\u2764'

    println("First commit with $blackHeart")
    println("First commit with $heavyBlackHeart")

    val ANSI_RED = "\u001B[31m"
    // ANSI Renk sifirlama kodu (Metni varsayilan rengine dondurur)
    val ANSI_RESET = "\u001B[0m"
    println("First commit with $ANSI_RED$blackHeart$ANSI_RESET")

    val char = "❤️"
    val char2 = "⭐"

    println(char)
    println(char2)
}
