package com.example.intentmei

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var nim_1: EditText = findViewById(R.id.nim_a)
        var nama_2: EditText = findViewById(R.id.nama_b)
        var nilai_3: EditText = findViewById(R.id.nilai_c)


        btn_proses.setOnClickListener{

            intent = Intent(this,Activity_2::class.java)
            intent.putExtra("nim",nim_1.getText())
            intent.putExtra("nama",nama_2.getText())
            intent.putExtra("nilai",nilai_3.getText())
            startActivity(intent)
        }

    }
}