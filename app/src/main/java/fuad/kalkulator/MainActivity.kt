package fuad.kalkulator

import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
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
        }
        duaButton.setOnClickListener {
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hitungTextView.append("2")
            hasilTextView.setTextSize(30F)
            hitungTextView.setTextSize(40F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
        }
        tigaButton.setOnClickListener {
            hitungTextView.append("3")
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hasilTextView.setTextSize(30F)
            hitungTextView.setTextSize(40F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
        }

        empatButton.setOnClickListener {
            hitungTextView.append("4")
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hasilTextView.setTextSize(30F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.setTextSize(40F)
        }

        limaButton.setOnClickListener {
            hitungTextView.append("5")
            hasilTextView.setTextSize(30F)
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.setTextSize(40F)
        }

        enamButton.setOnClickListener {
            hasilTextView.setTextSize(30F)
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hitungTextView.setTextSize(40F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.append("6")
        }

        tujuhButton.setOnClickListener {
            hasilTextView.setTextSize(30F)
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hitungTextView.setTextSize(40F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.append("7")
        }

        delapanButton.setOnClickListener {
            hasilTextView.setTextSize(30F)
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hitungTextView.setTextSize(40F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.append("8")
        }

        sembilanButton.setOnClickListener {
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hasilTextView.setTextSize(30F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.setTextSize(40F)
            hitungTextView.append("9")
        }

        nolButton.setOnClickListener {
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hasilTextView.setTextSize(30F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.setTextSize(40F)
            hitungTextView.append("0")
        }

        tambahButton.setOnClickListener {
            hasilTextView.setTextSize(30F)
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hitungTextView.setTextSize(40F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.append("+")
        }

        kurangButton.setOnClickListener {
            hasilTextView.setTextSize(30F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.setTextSize(40F)
            hitungTextView.append("-")
        }

        kaliButton.setOnClickListener {
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hasilTextView.setTextSize(30F)
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.setTextSize(40F)
            hitungTextView.append("*")
        }

        bagiButton.setOnClickListener {
            hasilTextView.setTextSize(30F)
            hitungTextView.setTextSize(40F)
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hitungTextView.append("/")
            hasilTextView.setTypeface(null, Typeface.NORMAL)
            hitungTextView.setTypeface(null, Typeface.BOLD)
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
        }

        hasilButton.setOnClickListener {
            hasilTextView.setTypeface(null, Typeface.BOLD)
            hitungTextView.setTypeface(null, Typeface.NORMAL)
            hasilTextView.setTextColor(ContextCompat.getColor(this, R.color.black))
            hitungTextView.setTextColor(ContextCompat.getColor(this, R.color.normal))
            hasilTextView.setTextSize(40F)
            hitungTextView.setTextSize(30F)

            if (hitungTextView.text == ""){
                hitungTextView.text = ""
            }else{
                hitung()
            }
        }
    }

    fun hitung() {
        val isi = hitungTextView.text?.toString()?.trim() ?: ""

        if (isi.isNotEmpty()) {
            if ("+-*/".contains(isi.last())) {
                val expressionString = isi.substring(0, isi.length - 1)

                if (expressionString.isNotEmpty()) {
                    val expression = ExpressionBuilder(expressionString).build()
                    val hasil = expression.evaluate()
                    hasilTextView.text = "= $hasil"
                } else {
                    hasilTextView.text = "0"
                }
            } else {
                val expression = ExpressionBuilder(isi).build()
                val hasil = expression.evaluate()
                hasilTextView.text = "= $hasil"
            }
        } else {
            hasilTextView.text = "= 0"
        }
    }

}