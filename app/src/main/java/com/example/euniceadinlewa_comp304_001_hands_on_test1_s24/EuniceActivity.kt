package com.example.euniceadinlewa_comp304_001_hands_on_test1_s24

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

//301281523
class EuniceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eunice)

        // Find the ImageButton and set an OnClickListener
        val imgButton: ImageButton = findViewById(R.id.imgButton)
        imgButton.setOnClickListener {
            val intent = Intent(this, AdinlewaActivity::class.java)
            startActivity(intent)
        }
    }
}
