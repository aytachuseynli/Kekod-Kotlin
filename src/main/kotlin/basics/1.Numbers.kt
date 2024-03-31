package org.aytachuseynli.basics

fun main() {

    /*

    Degiskene deger atamasi yapilirken maksimum performans almak icin dogru degisken tipini kullanmak onemlidir. Bunun icin degiskenlerin deger araliklarini yukaridan kontrol edebilirsiniz.
    Tip cikarimi (Type Inference) sirasinda eger sayi Int ifadeden buyuk degilse tipi default olarak Int set edilir.
    Tip cikarimi (Type Inference) sirasinda eger sayi Int ifadeden buyukse tipi default olarak Long set edilir.

     */

    val minByteValue: Byte = Byte.MIN_VALUE
    val maxByteValue: Byte = Byte.MAX_VALUE

    val minShortValue: Short = Short.MIN_VALUE
    val maxShortValue: Short = Short.MAX_VALUE

    val minIntValue: Int = Int.MIN_VALUE
    val maxIntValue: Int = Int.MAX_VALUE

    val minLongValue: Long = Long.MIN_VALUE
    val maxLongValue: Long = Long.MAX_VALUE

    val minFloatValue: Float = Float.MIN_VALUE
    val maxFloatValue: Float = Float.MAX_VALUE

    val minDoubleValue: Double = Double.MIN_VALUE
    val maxDoubleValue: Double = Double.MAX_VALUE

    println("minByteValue: $minByteValue")
    println("maxByteValue: $maxByteValue")
    println("minShortValue: $minShortValue")
    println("maxShortValue: $maxShortValue")
    println("minIntValue: $minIntValue")
    println("maxIntValue: $maxIntValue")
    println("minLongValue: $minLongValue")
    println("maxLongValue: $maxLongValue")
    println("minFloatValue: $minFloatValue")
    println("maxFloatValue: $maxFloatValue")
    println("minDoubleValue: $minDoubleValue")
    println("maxDoubleValue: $maxDoubleValue")



    val byteNumber: Byte = 42
    val shortNumber: Short = 12345
    val intNumber: Int = 987654321
    val longNumber: Long = 1234567890123456789L // 'L' son eki uzun sayı literali için kullanılır ("l" kullanilmaz)
    val floatNumber: Float = 3.14f // 'f' ve ya "F" son eki float literali için kullanılır
    val floatNumber2: Float = 32f // 'f' ve ya "F" son eki float literali için kullanılır  (Result: 32.0)
    val doubleNumber: Double = 2.71828
    val doubleNumber2: Double = 3.14e10
    val charLetter: Char = 'A'
    val booleanValue: Boolean = true
    val decimalNumber = 1907
    val octalNumber = 12154
    val hexadecimalNumber = 0x759
    val binaryNumber = 0b0100011



    println("Byte: $byteNumber")
    println("Short: $shortNumber")
    println("Int: $intNumber")
    println("Long: $longNumber")
    println("Float: $floatNumber")
    println("Float: $floatNumber2")
    println("Double: $doubleNumber")
    println("Double: $doubleNumber2")
    println("Char: $charLetter")
    println("Boolean: $booleanValue")
    println("Decimal: $decimalNumber")
    println("Octal: $octalNumber")
    println("Hexadecimal: $hexadecimalNumber")
    println("Binary: $binaryNumber")


    /* Number degisken tanimi yapilirken underscore "_" kullanilabilir. */

    val oneMillion = 1_000_000
    val creditCardNumber= 1234_5678_9012_3456L
    val bytes = 0b0000011_000001000_01010101011

    /*
    Boxed: Degiskenin obje referansi olarak tutulmasidir.
    UnBoxed: Degiskenin primitiv olarak tutulmasidir.
    === operatoru degiskenlerin referansini karsilastirirken kullanilir.
    == operatoru degiskenlerin degerini karsilastirirken kullanilir.
     */

    val number: Int = 100  //int
    val boxedNumber: Int? = number
    val anotherBoxedNumber: Int? = number
    println(boxedNumber === anotherBoxedNumber)  //true

    val number2: Int = 10000
    val boxedNumber2: Int? = number2
    val anotherBoxedNumber2: Int? = number2
    println(boxedNumber2 === anotherBoxedNumber2)  //false

    val number3: Int = 126
    val boxedNumber3: Int? = 129
    val anotherBoxedNumber3: Int? = 129
    println(boxedNumber2 === anotherBoxedNumber2)  //false


    /**
     * Backend`ten donen Double and Float degiskenleri kullanirken dikkatli olmaniz gerekiyor.
     * Eger backend`den donen deger uzerinde "." isaretine gore bir split isi yapacaksaniz basiniz agriyabilir.
     * cunki backend`ten donen Double and Float degiskenleri her zaman "." ile ayrilmiyor olabilir.
     */









}