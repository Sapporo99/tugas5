package com.example.atry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity<Button> : AppCompatActivity() {
    private lateinit var btnIntent : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnIntent = findViewById(R.id.btn_intent)
        btnIntent.setOnClickListener(this)

    }
    override fun onClick (v: view) {
        when(v.id){
            R.id.btn_intent ->{
            val IntentBiasa = Intent(this@MainActivity, IntentBiasaActivity::class.java)
                startActivity(IntentBiasa)
            }
        }
    }
}