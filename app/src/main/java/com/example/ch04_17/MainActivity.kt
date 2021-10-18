package com.example.ch04_17

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //xml -> kotlin 로 가져온다.

        //1.kotlin 객체를 만든다.
        //2.kotlin 객체에 xml 객체를 연결한다.(바인딩)
        //3.kotlin 객체에 작업을 한다.

        //1.kotlin 객체를 만든다.
        var tv1 : TextView;
        var tv2 : TextView;
        var tv3 : TextView;

        //2.kotlin 객체에 xml 객체를 연결한다.(바인딩)
        tv1 = findViewById<TextView>(R.id.textView1);
        tv2 = findViewById<TextView>(R.id.textView2);
        tv3 = findViewById<TextView>(R.id.textView3);

        //3.kotlin 객체에 작업을 한다.
        tv1.setText("안녕하세요?")
        tv1.setTextColor(Color.RED)
        tv2.setTextSize(30.0f)
        tv2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC)
        tv3.setText("가가가가나랆ㄴㅇㄻㄴㅇㄻㄴㅇㄻㄴㅇㄻㄴㅇㄻㄴㅇㄻㄴㅇㄻㄴㅇㄻㄴㅇㄻㄴㅇㄻㄴㅇㄻㄴㅇㄻㄴㅇㄹ")
        tv3.setSingleLine()


    }
}