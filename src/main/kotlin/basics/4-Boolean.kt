package org.aytachuseynli.basics

fun main() {
    /**
     * 8 bit alan kaplar.
     * true ya da false deger atamasi icin kullanilir.
     * Nullable versiyonları null deger de alir.
     * 0 ve ya 1 Boolean olarak kullanilamaz.
     */

    val isStudent: Boolean = true
    val isTeacher: Boolean = false

    val isFirstStudentMale: Boolean? = null

    // val isStudent2:Boolean = 1
    // val isTeacher2:Boolean = 0

    /*---------------------------------------------------*/

    /**
     *  || (or) && (and) gibi operatorler ile birlikde kullanilir.
     */

    if (isStudent && isTeacher){

    }

    if (isStudent and isTeacher){

    }

    if (isStudent || isTeacher){

    }

    if (isStudent or isTeacher){

    }

     if (isStudent or(isTeacher)){

    }

    if (!isStudent){

    }

    if (isStudent.not()){

    }


    /**
     * // ve && operatorleri lazily calisma mekanizmasina sahiptir.Performans acisindan onemlidir.
     * Eger || opearatorunun solu true ise sagdaki degere bakmaya gerek duymaz ve true olarak kabul eder.
     * Eger && operatorunun solu false ise sagdaki degere bakmaya gerek duymaz ve false olarak kabul eder.
     */





}