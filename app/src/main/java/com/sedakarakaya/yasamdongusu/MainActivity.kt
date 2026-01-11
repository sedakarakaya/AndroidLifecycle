package com.sedakarakaya.yasamdongusu

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sedakarakaya.yasamdongusu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        println("onCreate calıstırıldı.")
    }

    override fun onStart() {
        super.onStart()
        println("onStart calıstırıldı.")
    }

    override fun onResume() {
        super.onResume()
        println("onResume calıstırıldı.")
    }

    override fun onPause() {
        super.onPause()
        println("onPause calıstırıldı.")
    }

    override fun onStop() {
        super.onStop()
        println("onStop calıstırıldı.")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy calıstırıldı.")
    }
    fun sonrakiSayfa(view: View) {

        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        val kullaniciGirdisi = binding.editText.text.toString()
        intent.putExtra("isim", kullaniciGirdisi)
        startActivity(intent)

        // hafızadan silinmesini istersek girdigimiz degerin, finish() kullanmalıyız o zaman.
        // yani aslında activity yi manuel olarak Destroy etmiş oluyoruz.
        //finish()

        // sonraki sayfaya gecemeyiz bu kodla, o yuzden intent kullandık.
        //val kullaniciGirdisi = binding.editText.text.toString()
        //binding.textView.text = "İsim: ${kullaniciGirdisi}"
    }



}