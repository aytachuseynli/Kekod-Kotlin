package org.aytachuseynli.classes

class Encapsulation {
     val name: String = "Gokhan"
     val surName: String = "OZTURK"


    fun getFullName(): String{
        return "$name $surName"
    }



}


fun main() {
    val encapsulation = Encapsulation()
//    encapsulation.name = "fjjgeriojgk"
}

/**
 * Kotlinde ENCAPSULATION
 * Kotlin default olarak encapsulation destekliyor.
 *
 * Biz üye değişken oluşturdukda bunlar field değil,
 * property. Ben bunların get-set fonksiyonlarını arka planda oluşturmuş oluyorum.
 * Dolayısıyla, ben bunları private yapsam bile,
 * basitce bunların get-set fonksiyonlarını alıp-almamasını belirliyor.
 *
 * public olursa, get-set fonksiyonlarını alır.
 * private olursa, get-set fonksiyonlarını almaz.
 *
 */


/*---------My Notes---------------------------------------------------*/
/**
 * Kotlin'de bir "property" (özellik),
 * bir sınıfın içinde tanımlanan ve o sınıfa ait verileri tutan bir öğedir.
 * Özellikler, sınıfın durumunu temsil ederler ve
 * genellikle sınıfın dışındaki kod tarafından erişilir, okunur veya yazılır.
 *
 * Kotlin'de, bir özellik bir veya daha fazla arka plan alanına (backing field) sahip olabilir.
 * Bu arka plan alanı, özelliğin gerçek değerini saklar.
 * Özellikler, getter ve setter metodlarına sahip olabilirler,
 * ancak gerektiğinde bunlar otomatik olarak oluşturulabilir.
 */

class Person {
    var name: String = "John" // Özellik tanımı
    var age: Int = 30 // Özellik tanımı



}

/**
 * Yukarıdaki örnekte, name ve age adında iki özellik tanımlanmıştır.
 * Her ikisi de var anahtar kelimesi ile tanımlanmıştır,
 * bu da bu özelliklerin hem okunabilir hem de yazılabilir olduğunu belirtir.
 * String ve Int gibi veri türleri ile ilgili özellikler tanımlanmıştır.
 */

//val person = Person()
//println(person.name) // Özelliği okuma
//person.name = "Alice" // Özelliğe yazma
//println(person.age) // Özelliği okuma
//person.age = 25 // Özelliğe yazma

/**
 * Kotlin, arka planda bu özellikler için
 * getter ve setter metodlarını otomatik olarak oluşturabilir.
 *
 * Ancak, ihtiyaca göre bu getter ve setter metodlarını
 * manuel olarak da tanımlayabilirsiniz.
 */

var name: String = "John"
    get() = field.uppercase() // Getter metodunun özelleştirilmiş tanımı
    set(value) {
        field = value.capitalize() // Setter metodunun özelleştirilmiş tanımı
    }

/**
 * Bu, name özelliği için özel bir getter ve setter metodlarını tanımlar.
 * Bu getter metodunun dönüş değeri field'ın büyük harfli halidir ve
 * setter metodunun parametresi olan value değeri
 * baş harfi büyük harfli hale getirilerek field'a atanır.
 */