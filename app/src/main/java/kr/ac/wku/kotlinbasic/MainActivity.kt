package kr.ac.wku.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import kr.ac.wku.kotlinbasic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnLog.setOnClickListener {
            //로그 버튼이 클릭되면 실행될 코드 스코프

            //로그 찍어보기
            Log.d("메인화면", "로그 버튼 클릭됨")
        }

    }
}