import java.util.*

/**
 * Yaklaşık her karakter başına 2 byte yer kaplar. UTF-16 encoding kullanır.
 *
 * Şift tırnak içerisine yazılan karakterler bütünüdür.
 * Bir String ifadenin tüm karakterlerini tek-tek akıp Char bir listeye atabilirsiniz.
 * Ya da ekrana yazdırabilirsiniz.
 **/
fun main() {

    val name = "KeKod"
    val char1 = 'K'
    val char2 = 'e'
    val char3 = 'K'
    val char4 = 'o'
    val char5 = 'd'
    val nameArray = charArrayOf(char1, char2, char3, char4, char5)

    for (char in name){
        println(char)
    }

    val awesomeKeKod = "KeKod is Awesome" // 16 chars
    val firstCharOfAwesomeKeKod = awesomeKeKod[awesomeKeKod.indices.first]
    val firstCharOfAwesomeKeKod2 = awesomeKeKod[1]
    val lastCharOfAwesomeKeKod = awesomeKeKod[awesomeKeKod.indices.last]
    val lastCharOfAwesomeKeKod2 = awesomeKeKod[15] // not 16 index out of range exception

    /*--------------------------------------------------------------------------------------------------------*/

    /**
     *
     * Stringler immutable`dır. Bir String ilk değer ataması yapıldıktan sonra değerini değiştiremez ya da
     * yeni bir değer set edilemez. String üzerinde yapacağınız tüm işlemler sizlere yeni bir String object`i dönecektir.
     * String`in ilk hali değişmeyecektir.
     *
     * Garbage Collector - kullanmadığımız valueleri memoryden siler.
     *
     **/



    var surName2 = "Şahin"
    surName2 = "ÖZTÜRK"

    val surName = "Şahin"
    println(surName.uppercase())  //ŞAHIN
    println(surName)  // Şahin


    /**
     * val - read-only değişken - değeri okunabilir, amma değer atanamaz.
     * Dolayısıyla, okunabilir olan değer değiştilebilir.
     * Bir classın içinde olan bir variable`ye val olsa bile GET fonksiyonu ile return değeri değiştirilebilir.
     *
     * String`ler val ve ya var olmalarına karşılık, iki durumun ikisi için de String değişkenler immutable`dir.
     * Burdaki immutable`dan kasıt ordaki value ifadesi memoryde HEAP alanda saklanırken üzerine atama yapılmaz,
     * o HEAP alanda saklanmaya devam eder, Garbage collector onu belli bir yerden sonra silecek.
     * Amma yeni olan değer HEAP alanında ikinci bir value olarak saklanır.
     * Bu yüzden ilk değer değişmediği için, yani memoryde hala kaldığı için String değişkenler immutable`dir.
     *
     **/

    /**
     * Farklı tipdeki bir değişkenin  önüne String bir değişken ya da ifade koyarak toplarsanız, sonuş String olacaktır.
     * Ancak String bir değişken ya da ifadenin sonuna, + operatoru ile, farklı bir değişken eklerseniz, kod çalışmaz.
     */

    val numbersValue: String = "value" + (4 + 2 + 8) // value14
    val numbeerValue2:String = "value".plus((4+2+8))
//    val numbeeerValue2:String = (4 + 2 + 8).plus("value")   // Calismaz
//    val numbersValue2: String = (4 + 2 + 8) + "value"   //Çalışmaz

    println("numbersValue" + numbersValue)

    /**
     * Herhangi bir degisken + operatorune ihtiyac duyulmadan direkt olarak "" arasina yazilarak kullanilabilir.
     * Bunun icin sadece $ isaretine ihtiyaciniz vardir. Bu yapiya STRING TEMPLATE denir.
     * Eger degiskenin bir ozelligine ihtiyac duyacaksaniz ${} seklinde kullanilir.
     */

    println("numbersValue $numbersValue")
    println("numbersValue ${numbersValue.length}")

    /*-------------------------------------------------------------------------------------------------------------*/

    /**
     *
     * 3 tane cift tirnak kullanarak Raw String (Multiline String) olusturulabilir.
     * Raw String'ler ide'ye nasil yaziliyorsa oyle kullanilir. Hizalamada bozulma olmaz.
     * trimIndent() fonksiyonu ile bu Raw String'in kenar bosluklarini silebilirsiniz.
     * Bu silme islemini yaparken tum satirlardaki en soldaki karakteri baz alarak silme islemini saglar.
     * Alttaki ornek icin 3 satirdan da $ isaretinin solundaki bosluga kadarini siler.
     * Raw Stringlerin icinde escape karakterler calismaz.
     *
     **/

    val rawPineTree = """
           *
     $    ***
         *****
    """.trimIndent()

    val rawPineTree2 = """
              *
        $    ***
            *****
    """

    /**
     * trimMargin (margin Prefix) ise verilen karakter ne ise, string satirlarindaki o karaktere kadar olan kismi siler.
     * Yukaridan farkli olarak bu karakter tek bir satirda ise, sadece o satirin, o karaktere kadar olan kismi silinir.
     * trimMargin () ise karaktere bakmadan tum satirlarin en solundaki degeri baz alip,
     * tum satirlardan o degerin solundaki bosluk kadar bosluk siler.
     *
     **/

    val rawPineTree3 = """
              *
        $    ***
            *****
    """.trimMargin("$")

    println(rawPineTree)
    println(rawPineTree2)
    println(rawPineTree3)

    /**
     *
     * Raw Stringler (Multiline Strings) i,inde characterler kullanmak icin ${'$'} yapisini kullanabilirsiniz.
     * Raw String`ler \ characterini alamazlar.
     */

    val price = """
        Price ${'$'}_9.99
        """ // 9.99

//    val price = """
//        Price \$_9.99
//        """ // $_9.99

    val price2 = "Price \$_9.99"  //$_9.99
    println(price2)

    /*-----------------------------------------------------------------------------*/

    /**
     * Kotlin'de String.format() metodu, Java'nın String.format() metoduna çok benzer şekilde çalışır.
     * Bu metod, belirli bir string içinde yer tutucuları belirtilen değerlerle değiştirerek yeni bir string
     * oluşturmanıza olanak tanır. Yer tutucular, formatlama belirtimleriyle tanımlanır ve bu belirtimler,
     * değiştirilecek değerlerin nasıl biçimlendirileceğini kontrol eder.
     * %s: String için
     * %d: Tam sayı (Integer) için
     * %f: Kayan noktalı sayı (Float/Double) için
     * %n: Yeni bir satıra geçmek için (platform bağımsız)
     */

    val yas = 30
    val mesaj = String.format("Yasim: %d", yas)
    println(mesaj) // "Yasim: 30" yazdirir.

    val boy = 1.75
    val boyMesak = String.format("Boyum: %2f metre", boy)
    println(boy)

    val ad = "Ahmet"
    val kisiBilgisi = String.format("Adim: %s, Yasim: %d, Boyum: %2f", ad, yas, boy)
    println(kisiBilgisi) // "Adim: Ahmet, Yasim: 30, Boyum: 1.75" yazdirir.

    val sayi = 1234567.89
    val usFormat = String.format(Locale.US, "US formatinda: %, 2f", sayi)
    println(usFormat) // "US formatinda: 1,234,567.89" yazdirir.

    //Türkçe için Locale nesnesi, "tr" ISO 639 dil kodu ve "TR" ISO 3166 ülke kodu ile olusturulabilir
    val localeTR = Locale ( "tr",  "TR") // Türkçe için Locale nesnesi oluşturuluyor
    val usFormatTR = String.format(localeTR, "TR formatında: %, .2f", sayi)

    println(usFormatTR) // "US formatında: 1,234,567.89" yazdırır.












}