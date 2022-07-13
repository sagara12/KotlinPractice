package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kotlinpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        var mBinding = ActivityMainBinding.inflate(layoutInflater)
        mBinding.button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

            }

        })


        //버튼 람다식 사용 조건
        //1. 코틀린 인터페이스가 아닌 자바 인터페이스 여야함
        //2. 그 인터페이스는 딱 하나의 메소드만 가져야 한다.

        mBinding.button.setOnClickListener{

        }

    }
}