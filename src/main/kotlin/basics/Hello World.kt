package org.aytachuseynli.basics

fun main() {
    println("Hello World!")
    val name:String = "Jack"
    val surname:String
    val age = 34  //type inference - IDE`nin değişkenin tipine karar vermesi

    surname = readLine()!!
    //readLine - comment satırından bilgi almak için kullanılır
    //Eğer değişkenin değerini direk olarak atamıyorsanız, sonradan atama yapacaksanız tipini belirlemeniz gerek.

    var isMale = true
    var isStudent: Boolean = true

    //var - (variable) değeri sonradan değiştirile bilir.
    //val - (value) değeri sonradan değiştirilemez.

    isMale = false
}

class A(){
    var isMale:Boolean = true
        private set
}

/*
var ile tanımlanmış bir değişkeni, var keyword'unu kullanarak val değişken nasıl yapılabilir?
var için set`i private yapmakla, bu sayede val değişkeni dışarıdan değer atanamaz hale gelir.
Böylece değişkenin ilk değeri neyse sadece o alınıp korunmuş olur.

=====================================================================================================
val ve var performans farkı nasıldır?
Threading, multi-treading yoksa, var daha performanslıdır, val daha az performanslıdır.
multi-threading varsa, val daha performanslıdır.
multi-thread yoksa, ikisi arasında ciddi bir performans farkı yoktur.
*/