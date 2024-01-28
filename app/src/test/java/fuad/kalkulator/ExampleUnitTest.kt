package fuad.kalkulator

import net.objecthunter.exp4j.ExpressionBuilder
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import java.lang.Double.parseDouble

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun hitung() {
        val isi = "2+3*3*3"
//        for (i in isi.indices){
//            val char = isi[i]
//            if(char.isDigit()){
//                ubah.add(i.toString())
//            }
//            when(char){
//                '+' -> ubah.add("+")
//                'x' -> ubah.add("*")
//                '÷' -> ubah.add("/")
//                '-' -> ubah.add("-")
//                '%' -> ubah.add("%")
//            }
//        }

        val expression = ExpressionBuilder(isi).build()
        val hasil = expression.evaluate()
        println(hasil)
    }
}