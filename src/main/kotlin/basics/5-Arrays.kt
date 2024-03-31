package org.aytachuseynli.basics


    /**
     * Aynı türden ya da belirtilen türün alt türlerinden, sabit sayıda veri tutan bir veri yapısıdır.
     * En sık kullanılan versiyonu Object-Type Array'lerdir. Array sınıfı ile temsil edilirler.
     * Eğer primitive tipleri Object-Type Array olarak kullanırsanız Boxed kullanım yapmış olursunuz.
     * Bu da performansa etki eder. Eğer sadece primitive'lerden oluşan arrayler oluşturacaksanız,
     * bu durumda Primitive-Type Array'ler kullanın.
     * ByteArray(byte[]), ShortArray(short[]), IntArray(int[]), LongArray (Long[]),
     * DoubleArray(double[]), FloatArray(float[]),
     * BooleanArray(boolean[]), CharArray (char[])
     * arrayOf(ayni tip degerler) seklinde tanimlanabilir.
     * arrayOf<Any>(farkli tip degerler) seklinde tanimlanabilir.
     * arrayOfNulls<Type>(size) seklinde ise verilen boyut kadar null deger iceren dizi tanimlanabilir.
     * emptyArray() boş array tanımlar
     */
fun main() {
        val studentNumbers = arrayOf(13, 45, 53, 54, 25, 10)
        val studentNames = arrayOf("Ahmet", "Ayşe", "Veli", "Derya")
        val firstCharOfNames = arrayOf('A', 'A', 'V', 'D')
        val mixedArray = arrayOf<Any>(13, "Ahmet", 'V', true)

        val arrayOfNulls = arrayOfNulls<String>(4)
        println(arrayOfNulls.joinToString())

        val emptyArray = emptyArray<String>()
        var emptyArray2: Array<String> = emptyArray()

          // emptyArray[5] = "Yeni Eleman"

         /*------------------------------------------------------------------------------------*/


        /**
         * Arrayler sabit büyüklüktedir. Arraylere ekleme ve çıkarma yapmak aynı String`lerde oldugu gibi
         * memory`de yeni bir Array oluşturulmasına neden olur.
         **/

         var citiesArray = arrayOf("Istanbul", "Hatay", "Kars")
         citiesArray += "Sivas"

         // Birden fazla eleman eklemek icin
         citiesArray += arrayOf("Izmir", "Konya")
         println(citiesArray.joinToString())

         citiesArray.forEach {
                 println("$it, ")
         }


        /**
         * Array`in önünde var varsa mutabledir, val varsa immutabledir.
         * Array`in önünde var ve ya val olmasına bakmadan,
         * içindeki her bir indekse uygun veri (value) değişe bildigi icin mutabledir, ama
         * Arraylere biz ekleme yapdikda var olan deger birakilir, yenisi yaratılır, bu bakımdan immutabledir.
         */

        /*--------------------------------------------------------------------------------------------------*/

        // 5 elemanlı, tüm elemanlari 3.14 olan bir dizi olusturun.
        val carNamesMini = Array<Double>(5) {
            // pseudo Codes
            // pseudo Codes
            // pseudo Codes
            3.14 * it
        }


        // 10 elemanli, 0-9 arasinda index degerlerinin karesini alan bir dizi olustur.
        // {0,1,2,4,9,16,25,36,49,81}

        val carNames = Array<Unit>(10) {
            println(it * it).toString()
        }

        /*----------------------------------------------------------------------------------------------*/

        /**
         *
         * ByteArray, ShortArray, IntArray, LongArray, DoubleArray, FloatArray giat ya da bunların Unsigned halleri
         * primitive array tanimlamalari da yapılabilir.
         *
         * .toTypedArray() fonksiyonu ile Object-Type bir array Primitive-Typed bir array'e dönüştürülür.
         * Bu tarz tanimlamalarda ilgili index degerine atama icin set(index, value) ya da [index] = value kullanilabilir.
         * Bu tarz tanimlamalarda ilgili index degerindeki degisken degerine get(index) ya da [index] seklinde ulasilir.
         **/


        val firstCharOfCountries = CharArray ( 4)
        firstCharOfCountries[0] = 'T'
        firstCharOfCountries.set(1, 'İ')
        firstCharOfCountries.set(3, 'A')

        firstCharOfCountries [2]= 'B'

        println("firstCharOfCountries index 2 :" + firstCharOfCountries.get(2))
        println("firstCharOfCountries index 2 :" + firstCharOfCountries[2])

        /**
         *
         * val ile tanimlanmis bir array'in herhangi bir index'indeki deger degistirilebilir.
         * val indexdeki degerlerin degismesine karismaz.
         * Ancak ilgili diziyi baska bir dizi ile esitlemenize izin verilmez.
         * Bunun icin tanimlamayi var ile degistirmeniz gerekir.
         **/

        val awesomeArray = arrayOfNulls<String>(5)
        awesomeArray[2] = "Gokhan"
        awesomeArray[2] = "euhfie"
        awesomeArray[2] = "tejrtjr"
//        awesomeArray = arrayOf("foo", "boo", "goo", "doo", "loo")

        /**
         * Array`in size`i disina cikiyorsaniz (boyutu disina), IndexOutOfBound hatasi alirsiniz.
         */
        awesomeArray[4] = "Mehtap"
//        awesomeArray[5] = "Mehtap"

        /*--------------------------------------------------------------------------------------*/

        // 2 boyutlu diziler
        val twoDArray = Array(2){ Array<Int>(2) { 0 } }
        println(twoDArray.contentDeepToString())
        // [[0, 0], [0, 0]]



        // 3 boyutlu diziler
        val threeDArray = Array(3){Array(3) {Array<Int>(3){ 0 } } }
        println(threeDArray.contentDeepToString())

        // [[0, 0], [0, 0], [0, 0]]
        // [[0, 0], [0, 0], [0, 0]]
        // [[0, 0], [0, 0], [0, 0]]
        // [3 x 3]


        // Array`ler her zaman degisebilirdir. (mutable)

        val simpleArray = arrayOf(1, 2, 3)
        //Accesses the element and modifies it
        simpleArray[0] = 10
        twoDArray[0][10] = 2

        println(simpleArray[0].toString()) //10
        println(twoDArray[0][0].toString()) //2

        // Ayni zamanda array`ler ust class`lari yerine atanamazlar (invariant)

        val arrayOfString: Array<String> = arrayOf("V1", "V2")
        // val arrayOfAny: Array<Any> = arrayOfString
        val arrayOfAny: Array<Any> = arrayOf("V1", "V2")

        /*-------------------------------------------------------------------------------------------*/

        /**
         *
         *
         * vararg kelimesi ile istediğimiz sayıda parametreyi kabul edebiliriz.
         * Eğer vararg'a denk gelecek şekilde bir array kullanmak istiyorsak "spread" "*" operatörü kullanırız.
         * Spread operatoru verdiğiniz arrayin elemanlarının her birini bir variable olacak şekilde parametre olarak passlar.
         */





    }