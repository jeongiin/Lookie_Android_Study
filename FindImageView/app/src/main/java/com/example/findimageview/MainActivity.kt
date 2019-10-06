package com.example.findimageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var map = mapOf(Pair("수족관정인",R.drawable.aquarium), Pair("다낭정인",R.drawable.danang),Pair("한강정인",R.drawable.hanriver))

        button.setOnClickListener {
            val id = map.get(editText.text.toString()) //"" Key 주소가 Value
            if (id!=null){
                imageView.setImageResource(id)
            }
            else
                Toast.makeText(applicationContext, "찾는 사진이 없습니다",Toast.LENGTH_LONG).show()
        }



    }
}
