package com.example.nobleswotting

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main7)

        val button9: Button = findViewById(R.id.button9)
        button9.setOnClickListener {
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)

            val button10: Button = findViewById(R.id.button10)
            button10.setOnClickListener {
                val tent = Intent(this, MainActivity10::class.java)
                startActivity(tent)

                val imageView6: ImageView = findViewById(R.id.imageView6)
                imageView6.setOnClickListener {
                    val course = Intent(this, MainActivity10::class.java)
                    startActivity(course)

                    val imageView7: ImageView = findViewById(R.id.imageView7)
                    imageView7.setOnClickListener {
                        val ui = Intent(this, MainActivity11::class.java)
                        startActivity(ui)


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
    }
}


