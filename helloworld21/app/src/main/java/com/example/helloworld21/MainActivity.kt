package com.example.helloworld21
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

//Nama: Imam Waliyuddin Rabbani
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //Membuat instance
        super.onCreate(savedInstanceState)
        //Menentukan tampilan dari activity_main.xml
        setContentView(R.layout.activity_main)
        //menginstansiasi val text dari text yang diambil
        //dari activity_main.xml yang memiliki id=text
        val text = findViewById<TextView>(R.id.text)
        //menginstansiasi val button  dari button yang diambil
        //dari activity_main.xml yang memiliki id=button
        val button = findViewById<Button>(R.id.button)
        //menginstansiasi val anim dari library AnimationUtils
        //dan load file anim.xml yang berisi kode bounce
        val anim = AnimationUtils.loadAnimation(getApplicationContext(),
            R.anim.anim)
        //membuat click listener dari val button
        button.setOnClickListener {
            //membuat val text memantul jika button ditekan.
            text.startAnimation(anim)
        }
    }
}