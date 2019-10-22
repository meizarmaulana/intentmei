package com.example.intentmei

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_2.*

class Activity_2 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val bundle= intent.extras
        val nimz = bundle?.get("nim")
        val namaz = bundle?.get("nama")
        val nilaiz = bundle?.get("nilai")
        var nilai = nilaiz.toString()
        var nilaib = nilai.toInt()

        if (nilaib >= 80){
            keterangan.setText("A")
        }
        else if(nilaib >= 60){
            keterangan.setText("B")
        }
        else if(nilaib >= 40){
            keterangan.setText("C")
        }
        else if(nilaib >= 20){
            keterangan.setText("D")
        }
        else{
            keterangan.setText("E")
        }
        nim_q.setText(""+nimz)
        nama_w.setText(""+namaz)
        nilai_e.setText(""+nilaiz)

        button.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }

}