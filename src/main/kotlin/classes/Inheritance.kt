package org.aytachuseynli.classes


open class Animal(open val name: String = "", val feetCount: Int = 4){
    var origin: String = "Sivas"
    var tailShape: String = "oval"


    open fun  makeASound(): String{
        return ""
    }

    final fun attackToTheWolf(){

    }

    fun eat(){

    }

    fun walk(){

    }


    fun dance(){

    }


}

class Dog(name: String, feetCount: Int) : Animal(name, feetCount) {

    override fun makeASound(): String{
        return super.makeASound()
    }

}

class Cat(override val name: String, feetCount: Int): Animal(name, feetCount) {
}

fun main() {
    val animal = Animal()
    val dog = Dog("vtyfyut",4)
    val cat = Cat("guyguy", 4)

    dog.name
    cat.name

    dog.attackToTheWolf()
    cat.attackToTheWolf()
}

/*

open class BaseFragment(val layoutId: Int): Fragment{
    override fun onViewCreated():View{
        return inflate.inflater(layoutId)

    }
}

class View

class DashboardFragment(): BaseFragment(R.layout.fragment_dashboard){

// BaseFragment`dan miras aliriz ve asagidaki kodlari yazmaya gerek kalmaz
//    fun onViewCreated():View{
//        return inflate.inflater(R.layout.fragment_profile)
//
//    }
}

class ProfileFragment(): BaseFragment(R.layout.fragment_profile){

}

 */


/**
 * open ve final - Kotlinde erişim düzenleyicisidir.
 * class`lar ve fonksiyonlar default olarak final olur.
 * Eğer biz bir class`ın önüne open keywordunu koyuyorsak,
 * bu class diğer child class`lar tarafından miras alına bilir anlamına geliyor.
 *
 * sinif override edilemez.
 * Degisken ve fonksiyonlar override edilebilir.
 *
 * Eğer biz bir değişkenin önüne open keywordünü verirsek, bu durumda da o değişken
 * child classlarda override edilebilir anlamına gelir ki, bu override yapma işlemine
 * Polymorphism denir.
 * Polymorhism`in de 2 türü var: Dinamik ve Statik polymorphism.
 * Yukaridaki söylenin şekilde yapılan polymorphism dinamik polymorphismdir.
 *
 */
