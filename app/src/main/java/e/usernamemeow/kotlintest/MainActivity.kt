package e.usernamemeow.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun toastMe(view: View){
        Toast.makeText(this, "This is toast", Toast.LENGTH_SHORT).show()
    }

    fun btnCount(view: View){
        val count =  textView.text.toString().toInt()
        textView.text = (count+1).toString()
    }

    fun btnRandom(view: View){

    }
}
