package org.aytachuseynli.functions

import java.util.Locale

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

    takeSquare()
    takeSquare(number = 2)
    takeSquare(number2 = 5)
    takeSquare(number = 2, number2 = 5)

    val squareValue = takeSquare(2)


    //Bir class`in bir fonksiyonunu cagirirken ise nokta isaretini kullaniriz.
    Math.pow(2.0, 3.0)

    /*--------------------------------------------------------------------*/



    reformatMessage("Message", true, 7, "tr")
    reformatMessage(message = "Message", size = 7, lang = "tr")
    reformatMessage("Message", true, 7)
    reformatMessage("Message", size = 7)

    reformatMessage("hello kotlin", lang ="tr", size = 7)

    /*-------------------------------------------------------------------------------*/

    //vararg kullanımına örnek: key = 3`den  onceki parametreler vararg parametresine denk gelir.
    getUserInfo1("Gökhan", "ÖZTÜRK", "Istanbul", "Türkiye","","", "", key = 3)

    // vararg parametresi olarak arrayOf kullanilmak isenirse * operatoru eklenmelidir. (spread operatoru)
    // bu operator diger dillerdeki pointer kullanimi anlamina gelmez. Kotlinde pointerler yoktur.
    getUserInfo1(*arrayOf("Gökhan", "ÖZTÜRK", "Istanbul", "Türkiye"), key = 3)
    getUserInfo3(3,"Gökhan", "ÖZTÜRK", "Istanbul", "Türkiye","", "", "")
    getUserInfo4(3, "Gökhan", "ÖZTÜRK", "Istanbul", "Türkiye", true, 3.14, "")






}

/**
 *  @param number degisken tanimlanir gibi tanimlanir.
 *  fonksiyon parametresi tanimlanirken, val var gibi betimleyiciler kullanilmaz.
 *
 *  fonksiyon overload - bir isimle yazılmış fonksiyonun parametre sayıları değiştirilerek,
 *  ya da parametre tipleri değiştirilerek aynı fonksiyon isminde birden fazla fonksiyon yazılması olayıdır.
 *
 *  Kotlinde name argument ve ya default value kullanarak yaptığımız işlem fonksiyon overload`ı sağlamış oluruz.
 */

fun takeSquare(number: Int = 5, number2: Int = 3): Int {
    //fe
    //gsg
    //fgs

    return 2 * number
}


fun repeat(times: Int, startedValue: Int = 0){
    for (index in startedValue until times){

    }
}


/**
 * = ile fonksiyonlara default deger verilebilir. (Default argument)
 * Default deger atamasi yapmak function overload islemi yapmamizi saglar.
 * Tekrar-tekrar ayni fonksiyonun farkli varyasyonlarini yazmak durumunda kalmayiz.
 *
 */
fun reformatMessage(message: String, isUpperCase: Boolean = false, size : Int, lang: String = "tr"){

    val locale = if (lang == "tr"){
        Locale("TR", "tr")
    } else {
        Locale.ROOT
    }


    val localMessage = if (isUpperCase){
        message.toUpperCase(locale)
    } else {
        message.toLowerCase(locale)
    }

    println("Message: $localMessage")
}

//fun reformatMessage(message: String, isUpperCase: Boolean = false, size : Int, lang: String = "tr"){
//    println("Message: " + message + "isUpperCase : " + isUpperCase + "Size : " + size + "lang : " + lang)
//}


/**
 * Default degeri olan parametrelere sahip bir fonksiyon Java siniflarindan cagirilacaksa eger,
 * bu fonksiyona @JvmOverloads annotation`i verilmelidir. Boylece yazilan kod Jvm`e hazir hale getirilerek
 * ilgili fonksiyonun tum varyasyonlari yazilir (overload edilir)
 */

@JvmOverloads
fun print(message: String = "Message"){
    println(message)
}

/**
 * Extend edilebilir bir sinif, yavru (child) sinif tarafindan miras (inherit) alinirsa
 * ve bu sinifin override edilebilir open bir methodu varsa, bu method default argument`e sahip olur.
 * bu sinifi miras alan sinifda method override edilirse, override edilen methodun parametresine defaultdur.
 * ust sinifin method`undaki default argument gecerli olur.
 */
open class A{
    open fun foo(i: Int = 10){

    }
}


class B : A(){
    override fun foo(i: Int) {

    } // no default value allowed
}


/**
 * Çok uzun sayida parametreniz olacaksa "variable number of arguments" - vararg tanimlanabilir.
 * Bu sayede foksiyon tek bir parametre aliyor gibi gozukurken kendisine cok miktarda degisken atanabilirş
 * Bu degiskenlere array`e erisir gibi erisebilirsiniz. [index]  ya da .get(index) seklinde
 *
 * vararg tek ya da son parametre olarak yazilirsa, Jvm`e hazirlanirken, Java`daki "String..." gibi
 * Ancak vararg param birden fazla tanimlanirken ortada ya da basta yer alirsa, Jvm`e hazirlanirken
 * bu da performans farki olusturur demektir.
 */

fun getUserInfo1(vararg userInfo: String, key: Int){
    userInfo[3]
    userInfo.get(3)
}

fun getUserInfo3(key: Int, vararg userInfo: String){
    userInfo[3]
    userInfo.get(3)
    println(key)
}

fun getUserInfo4(vararg userInfo: Any){
    userInfo[3]
    userInfo.get(3)
}


// Ayni fonksiyon icerisinde birden fazla vararg tanimi yapilmasina izin verilmez.

//fun getUserInfo(vararg  userInfo: String, vararg userInfo2: String){
//    userInfo[3]
//}

/*----------------------------------------------------------------------------------------------*/


//val userInfo = arrayOfNulls<String>(5)
//
//fun getListCount(): Int = userList.size
//
//fun getListCount2() = userList.size
//
//fun getListCount3():Int{
//    return userList.size
//}

