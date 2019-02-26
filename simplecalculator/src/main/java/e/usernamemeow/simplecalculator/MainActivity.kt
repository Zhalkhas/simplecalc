package e.usernamemeow.simplecalculator

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        if(menu != null) {
            menu.add("clear")
            menu.add("quit")
        }
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.title){
            "clear" -> tvResult.text=""
            "quit" -> finish()
        }
        return super.onOptionsItemSelected(item)
    }

    @SuppressLint("SetTextI18n")
    fun onClick(view: View){
        var result: Double? = null
        var action:Char? = null
        val text1 = etNum1.text.toString().toDouble()
        val text2 = etNum2.text.toString().toDouble()
        when(view.id){
            R.id.btnAdd -> {
                result = text1+text2
                action = '+'
            }
            R.id.btnSub -> {
                result = text1 - text2
                action = '-'
            }
            R.id.btnMult -> {
                result = text1*text2
                action = '*'
            }
            R.id.btnDiv -> {
                if (text2 == 0.0) {
                    Toast.makeText(this, "Division to zero!", Toast.LENGTH_SHORT).show()
                    return
                }
                else {
                    result = text1 / text2
                    action = '/'
                }
            }
        }
        if(result != null && action != null){
        tvResult.text = "$text1 $action $text2 = $result"

        }
    }
}
