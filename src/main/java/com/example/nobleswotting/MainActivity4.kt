package com.example.nobleswotting

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)

        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)

            val imageview12: ImageView = findViewById(R.id.imageView12)
            imageview12.setOnClickListener {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)

                ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                    val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                    v.setPadding(
                        systemBars.left,
                        systemBars.top,
                        systemBars.right,
                        systemBars.bottom
                    )
                    insets
                }
            }
        }
    }
}