package org.aytachuseynli.basics

fun main() {

    /**
     * Implicit Type Conversion : Ortulu - belirgin olmayan sekilde tip donusumu
     * Explicit Type Conversion : Acik - belirgin tip donusumu
     *
     * Kotlinde implicit type conversion yoktur.
     */

//    val number:Int = (Int) 3L

    /**
     * Tip donusumu icin kullanabileceginiz fonksiyonlar;
     * toByte(), toShort(), toInt(), toLong(), toDouble(), toFloat(), toChar(), toString(),
     * toUByte(), toUShort(), toUInt(), toULong(), toDuration(), toBigDecimal(), toBigInteger()
     */
/*---------------------------------------------------------------------------------------------------------*/

    /**
     * 1.Numbers.kt dosyasinin icerisindeki degisken tiplerinin deger araliklarini inceleyiniz.
     * Deger araligi kucuk olan tipler buyuk olan tiplere sorunsuz, acik olarak (explicit) donusturulebilir.
     */

    val schoolNumber = 125.toByte()
    val convertedValue: Short = schoolNumber.toShort()

    println("schoolNumber: " + schoolNumber)
    println("convertedValue: " +convertedValue)

    /*----------------------------------------------------------------------------------------------------------*/
    /**
     * 1.Numbers.kt dosyasinin icerisindeki degisken tiplerinin deger araliklarini inceleyiniz.
     * Deger araligi buyuk olan tipler kucuk olan tiplere acik olarak (explicit) donusturulurken dikkatli olunmalidir.
     * Ust tipden bir degiskenin degeri, alt tipin deger araligindan pozitis yonde fazla buyuk,
     * negatif yonde fazla kucuk ise bu tip donusumu sirasinda yanlis deger atamalari yapilacaktir.
     */

    val tcIndetityNumber = 15860826657
    val convertedInt = tcIndetityNumber.toInt()

    println("convertedInt: " + convertedInt)

    /*----------------------------------------------------------------------------------------------------------*/

    /**
     * Kapali(implicit) tip donusumu olmasa bile, iki number tip arasinda matematiksel islem yapilirsa,
     * sonuc degeri cikan degerin tipinde olacaktir.
     */

    val totalValur: Long = tcIndetityNumber + schoolNumber //Long + Byte = Long

    /*----------------------------------------------------------------------------------------------------------*/

    /**
     * Kotlin'in sagladigi yukaridaki tip donusumlerinin yaninda, String to Number donusumler icin
     * Java'dan asina oldugumuz tip donusumlerini de kullanabiliriz.
     * Bunun icin ilgili tiplerin Java versionlarini kullanmalisiniz.
     *
     * java.lang.Byte.parseByte(), java.lang.Short.parseShort(), java.lang. Int.parseInt(),
     * java.lang. Long.parseLong(), java.lang. Double.parseDouble(), java.lang. Float.parseFloat(),
     * java.lang.Byte.parseUByte(), java.lang.Short.parse UShort(), java.lang.Int.parseInt(),
     * java.lang. Long.parseULong(), java.lang. Double.parse UDouble(), java.lang. Float.parseFloat()
     */

    val byte: String = "3"
    val intValue = Integer.parseInt(byte)

    val intValue2 = 3
    val doubleValue = 3.0
    val floatValue = 3.0F
    val longValue = 3L
    val shortValue: Short = 3
    val byteValue: Byte = 3

    getValue(byteValue.toDouble())

}

fun getValue(doubleNumber: Double){}
