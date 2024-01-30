package fuad.kalkulator

import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Character.isDigit

private const val TAG = "FUAD"
private const val DEFAULT_HASIL = 0

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kalkulator_layout)

        initComponents()
        initListener()


    }

    lateinit var satuButton: Button
    lateinit var duaButton: Button
    lateinit var tigaButton: Button
    lateinit var empatButton: Button
    lateinit var limaButton: Button
    lateinit var enamButton: Button
    lateinit var tujuhButton: Button
    lateinit var delapanButton: Button
    lateinit var sembilanButton: Button
    lateinit var nolButton: Button
    lateinit var tambahButton: Button
    lateinit var kaliButton: Button
    lateinit var kurangButton: Button
    lateinit var hasilButton: Button
    lateinit var acButton: Button
    lateinit var bagiButton: Button
    lateinit var hasilTextView: TextView
    lateinit var hitungTextView: TextView
    lateinit var komaButton: Button
    lateinit var deleteButton: Button

    private fun initComponents(){
        satuButton = findViewById(R.id.satuButton)
        duaButton = findViewById(R.id.duaButton)
        tigaButton = findViewById(R.id.tigaButton)
        empatButton = findViewById(R.id.empatButton)
        limaButton = findViewById(R.id.limaButton)
        enamButton = findViewById(R.id.enamButton)
        tujuhButton = findViewById(R.id.tujuhButton)
        delapanButton = findViewById(R.id.delapanButton)
        sembilanButton = findViewById(R.id.sembilanButton)
        nolButton = findViewById(R.id.nolButton)
        tambahButton = findViewById(R.id.tambahButton)
        kurangButton = findViewById(R.id.kurangButton)
        bagiButton = findViewById(R.id.bagiButton)
        kaliButton = findViewById(R.id.kaliButton)
        hasilButton = findViewById(R.id.hasilButton)
        acButton = findViewById(R.id.acButton)
        hasilTextView = findViewById(R.id.hasilTextView)
        hitungTextView = findViewById(R.id.hitungTextView)
        komaButton = findViewById(R.id.komaButton)
        deleteButton = findViewById(R.id.deleteButton)
    }

    private fun initListener(){
        hasilTextView.text = "= $DEFAULT_HASIL"

        satuButton.setOnClickListener {
            hitungTextView.append("1")
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hasilTextView.setTextSize(30F)
            hitungTextView.setTextSize(40F)

            hitung()
        }

        duaButton.setOnClickListener {
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hitungTextView.append("2")
            hasilTextView.setTextSize(30F)
            hitungTextView.setTextSize(40F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitung()
        }

        tigaButton.setOnClickListener {
            hitungTextView.append("3")
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hasilTextView.setTextSize(30F)
            hitungTextView.setTextSize(40F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitung()
        }

        empatButton.setOnClickListener {
            hitungTextView.append("4")
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hasilTextView.setTextSize(30F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.setTextSize(40F)
            hitung()
        }

        limaButton.setOnClickListener {
            hitungTextView.append("5")
            hasilTextView.setTextSize(30F)
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.setTextSize(40F)
            hitung()
        }

        enamButton.setOnClickListener {
            hasilTextView.setTextSize(30F)
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hitungTextView.setTextSize(40F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.append("6")
            hitung()
        }

        tujuhButton.setOnClickListener {
            hasilTextView.setTextSize(30F)
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hitungTextView.setTextSize(40F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.append("7")
            hitung()
        }

        delapanButton.setOnClickListener {
            hasilTextView.setTextSize(30F)
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hitungTextView.setTextSize(40F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.append("8")
            hitung()
        }

        sembilanButton.setOnClickListener {
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hasilTextView.setTextSize(30F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.setTextSize(40F)

            hitungTextView.append("9")
            hitung()
        }

        nolButton.setOnClickListener {
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hasilTextView.setTextSize(30F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.setTextSize(40F)

            hitungTextView.append("0")
            hitung()
        }

        tambahButton.setOnClickListener {
            hasilTextView.setTextSize(30F)
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hitungTextView.setTextSize(40F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)

            val hitungHitung = hitungTextView.text.toString()
            if(hitungHitung.isNotEmpty() && "+-x÷".contains(hitungHitung.last())){
                val teksBaru = hitungTextView.text.dropLast(1)
                hitungTextView.text = teksBaru.toString()
                hitungTextView.append("+")
            }
            else{
                hitungTextView.append("+")
            }
        }

        kurangButton.setOnClickListener {
            hasilTextView.setTextSize(30F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.setTextSize(40F)

            val hitungHitung = hitungTextView.text.toString()
            if(hitungHitung.isNotEmpty() && "+-x÷".contains(hitungHitung.last())) {
                val teksBaru = hitungTextView.text.dropLast(1)
                hitungTextView.text = teksBaru.toString()
                hitungTextView.append("-")
            }
            else {
                hitungTextView.append("-")
            }
        }

        kaliButton.setOnClickListener {
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hasilTextView.setTextSize(30F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.setTextSize(40F)

            val hitungHitung = hitungTextView.text.toString()
            if(hitungHitung.isNotEmpty() && "+-x÷".contains(hitungHitung.last())) {
                val teksBaru = hitungTextView.text.dropLast(1)
                hitungTextView.text = teksBaru.toString()
                hitungTextView.append("x")
            }
            else if(hitungHitung.isEmpty()){
                hitungTextView.text = "0x"
            }
            else {
                hitungTextView.append("x")
            }
        }

        bagiButton.setOnClickListener {
            hasilTextView.setTextSize(30F)
            hitungTextView.setTextSize(40F)
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)

            val hitungHitung = hitungTextView.text.toString()
            if(hitungHitung.isNotEmpty() && "+-x÷".contains(hitungHitung.last())) {
                val teksBaru = hitungTextView.text.dropLast(1)
                hitungTextView.text = teksBaru.toString()
                hitungTextView.append("÷")
            }
            else if(hitungHitung.isEmpty()){
                hitungTextView.text = "0÷"
            }
            else {
                hitungTextView.append("÷")
            }
        }

        acButton.setOnClickListener {
            hitungTextView.text = ""
            hasilTextView.text = "= $DEFAULT_HASIL"
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hasilTextView.setTextSize(30F)
            hitungTextView.setTextSize(40F)
        }

        komaButton.setOnClickListener {
            hitungTextView.append(".")
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hasilTextView.setTextSize(30F)
            hitungTextView.setTextSize(40F)
        }

        deleteButton.setOnClickListener {
            if (hitungTextView.text.isNotEmpty()) {
                val teksBaru = hitungTextView.text.dropLast(1)
                hitungTextView.text = teksBaru.toString()
            } else {
                hitungTextView.text = ""
            }
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hasilTextView.setTextSize(30F)
            hitungTextView.setTextSize(40F)
            hitung()
        }

        hasilButton.setOnClickListener {
            hasilTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.setTypeface(null, Typeface.NORMAL)
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hasilTextView.setTextSize(40F)
            hitungTextView.setTextSize(30F)

            hitung()
        }
    }

    fun hitung() {
        val isi = hitungTextView.text?.toString()?.trim() ?: ""

        if ("= Tidak bisa dibagi dengan nol" == hasilTextView.text.toString()){
            hasilTextView.text ="= 0"
        }
        else if (isi.length != 1 && isi.isNotEmpty() && '÷' == isi[isi.length - 2] &&  isi.last() == '0'){
            hasilTextView.text ="= Tidak bisa dibagi dengan nol"
            hitungTextView.text = ""
        }
        else if (isi.isNotEmpty() && isi.length != 1) {
            if ("+-x÷".contains(isi.last())) {
                val ubah = isi.replace('x', '*').replace('÷', '/')
                val expressionString = ubah.substring(0, ubah.length - 1)

                if (expressionString.isNotEmpty()) {
                    val expression = ExpressionBuilder(expressionString).build()
                    val hasil = expression.evaluate()
                    if(hasil % 1 == 0.0){
                        val result = hasil.toInt()
                        hasilTextView.text = "= $result"
                    }else{
                        hasilTextView.text = "= $hasil"
                    }
                } else {
                    hasilTextView.text = "= 0"
                }
            } else {
                val ubah = isi.replace('x', '*').replace('÷', '/')
                val expression = ExpressionBuilder(ubah).build()
                val hasil = expression.evaluate()
                if(hasil % 1 == 0.0){
                    val result = hasil.toInt()
                    hasilTextView.text = "= $result"
                }else{
                    hasilTextView.text = "= $hasil"
                }
            }
        }
        else if (isi.length != 1 && isi.isNotEmpty() && '÷' == isi[isi.length - 2] &&  isi.last() == '0'){
            hasilTextView.text ="= Tidak bisa dibagi dengan nol"
        }
        else if (isi.length != 1 && isi.isNotEmpty() && '÷' == isi[isi.length - 2] &&  isi.last() == '0'){
            hasilTextView.text ="= Tidak bisa dibagi dengan nol"
        }
        else if(isi.length == 1 && "+-x÷".contains(isi)){
            hasilTextView.text = "= 0"
        }
        else if ("= Tidak bisa dibagi dengan nol" == hasilTextView.text.toString()){
            hasilTextView.text ="= Tidak bisa dibagi dengan nol"
        }
        else {
            hasilTextView.text = "= 0"
        }
    }
}
//Test