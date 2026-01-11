package com.sedakarakaya.yasamdongusu

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sedakarakaya.yasamdongusu.databinding.ActivityMainBinding
import com.sedakarakaya.yasamdongusu.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val maindenGelenIntent = intent
        val yollananIsim =  maindenGelenIntent.getStringExtra("isim")
        binding.textView2.text = yollananIsim
    }

    /* Kullanıcının girdigi degeri diğer sayfada da gormek için yukardaki kodu yazdık.
    fun birinciAktiviteyiAc(view: View) {
        val intent = Intent (this@SecondActivity, MainActivity::class.java)
        startActivity(intent)
    }
   */


}