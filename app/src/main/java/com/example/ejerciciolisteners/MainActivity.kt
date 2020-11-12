package com.example.ejerciciolisteners

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b1 = findViewById<Button>(R.id.b1)
        val et1 = findViewById<EditText>(R.id.et1)
        val img=findViewById<ImageView>(R.id.imag)

        b1.setOnClickListener {
            if(et1.visibility==View.VISIBLE) {
                et1.visibility = View.INVISIBLE
                b1.text = "FINALIZAR"
            }
            else{
                b1.text ="COMENZAR"
                et1.visibility = View.VISIBLE
            }
        }

        et1.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                s?.let {
                    if (it.contains("Wayne")) {
                        img.visibility = View.VISIBLE
                    } else {
                        img.visibility = View.INVISIBLE
                    }

                    if(it.contains("joker")){
                        b1.setBackgroundColor(Color.BLUE)
                        et1.setBackgroundColor(Color.RED)
                    }
                }

            }
        })

    }

}


