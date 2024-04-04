package org.aytachuseynli.functions


fun main() {
    /**
     * Daha okunakli kodlar yazmak icin kullanilir.
     * . (nokta) kullanimini kaldirir.
     * Bir fonksiyonu infix hale getirebilmek icin 5 sart vardir.
     * 1. infix keywordu ile baslar
     * 2. fonksiyon bir uye fonksiyon olmalidir. (bir sinifa ait olmalidir)
     * 3. ya da bir extension fonksiyon olmalidir.
     * 4. sadece bir parametre almalidir. Bu parametre vararg olamaz.
     * 5. infix method`un parametresi default deger alamaz.
     *
     * Yapisal olarak;
     *
     * infix fun infixMethod(justOneParam : AwesomeParam) : Whatever {
     *
     * }
     *
     **/

    val isStudent = false
    val isMale = true

    /**
     * and, or, xor gibi onlarca infix method vardir.
     */
    if (!isStudent and isMale){
        print("Öğrenci olmayan erkek")
    }


    //infix kullanimi
    isStudent and isMale
    isStudent.and(isMale)

    val awesomeInstance = AwesomeClass()
    //infix kullanimi
    awesomeInstance downloadImage "www.google.com.tr"
    awesomeInstance.downloadImage("www.google.com.tr")


    /*---------------------------------------------------------------------------------------------*/

    val number = 5
    // matematiksel operatorlarin, tip donusumlerin (type conversion),
    // range kullanimin, infix methodlara karsi islem onceligi vardir.

    if (number + number -2 * (awesomeInstance specialPlus 4) == 5) {

    }

    /*----------------------------------------------------------------------------------*/

    // infix methodlarin da mantik operatorlerinde gore onceligi vardir.
    if (number == 3 && number < 5 || awesomeInstance specialPlus  4 == 5){

    }


}


/*-------------------------------------------------------------------------------------*/


class AwesomeClass {
    //infix fun downloadImage(imageUrl : String = "Ahmet") {}


    /*---------------------------------------------------------------------------------*/

    infix fun downloadImage(imageUrl: String) {

    }

    infix fun specialPlus(number: Int): Int {
        return 4
    }


    /*----------------------------------------------------------------------------------------------*/

//    infix fun <T> downloadImage2(vararg  mageUrl: T){
//
//    }



    /*------------------------------------------------------------------------------------------------*/

    // bir sinifin icindeyken this kullanimi size bulundugu sinifi isaret eder.
    // asagidaki kullanimda AwesomeClass().downloadImage(imageUrl) kullanimi olusur aslinda. (implicit)
    fun logWhenImageDownloaded(imageUrl: String){
        downloadImage(imageUrl)
//        downloadImage imageUrl
        this downloadImage  imageUrl
    }

}

/*----------------------------------------------------------------------------------------------------*/

// bir sinifin disindayken infix method cagirimi yapilirsa this kullanilmaz.
fun logWhenImageDownloaded(imageUrl: String){
    // this downloadImage imageUrl
}

