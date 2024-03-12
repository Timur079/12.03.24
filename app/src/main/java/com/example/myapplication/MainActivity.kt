package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import com.example.myapplication.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.loshad.setImageResource(R.drawable.loshad)

        binding.slon.setOnClickListener{
            var a = "https://w.forfun.com/fetch/2e/2ed552bdb4a00b0524e61ff725e811d3.jpeg"
            var b = "https://pic.rutubelist.ru/video/6f/75/6f750fa9355bb9234588366fa548a9a6.jpg"
            var c = "https://w.forfun.com/fetch/db/dba585033931a669881cf1ab8896dfd6.jpeg"
            Picasso.get()
                .load(listOf(a, b, c).random())
                .into(binding.loshad)}

        binding.Sobaka.setOnClickListener{
           var a = "https://w.forfun.com/fetch/25/25e23fdb29b80e4cebd850f2b7f1f0b4.jpeg"
            var b = "https://gas-kvas.com/grafic/uploads/posts/2023-10/1696601769_gas-kvas-com-p-kartinki-s-sobakami-9.jpg"
            var c = "https://classpic.ru/wp-content/uploads/2019/08/35931/nemeckaja-ovcharka-otdyhaet-na-trave.jpg"
                Picasso.get()
                    .load(listOf(a, b, c).random())
                    .into(binding.loshad)}

        binding.Koska.setOnClickListener{
            var a = "https://mrkot.com/wp-content/uploads/2018/10/cat-2068462_1920.jpg"
            var b = "https://w.forfun.com/fetch/a8/a825274c3f23c6dc799fb1f1a713a44e.jpeg"
            var c = "https://kotello.ru/wp-content/uploads/2015/11/sonnik-koshka-kotello.ru-007.jpg"
            Picasso.get()
                .load(listOf(a, b, c).random())
                .into(binding.loshad)}
    }

}