package com.example.euniceadinlewa_comp304_001_hands_on_test1_s24

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

//301281523
class AdinlewaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adinlewa)


        val checkbox1: CheckBox = findViewById(R.id.checkbox_1)
        val checkbox2: CheckBox = findViewById(R.id.checkbox_2)
        val checkbox3: CheckBox = findViewById(R.id.checkbox_3)
        val checkbox4: CheckBox = findViewById(R.id.checkbox_4)
        val btnNext: Button = findViewById(R.id.btnNext)
        val tvSelectedExercises: TextView = findViewById(R.id.tvSelectedExercises)

        // Set OnClickListener for the Button
        btnNext.setOnClickListener {
            val selectedExercises = mutableListOf<String>()
            if (checkbox1.isChecked) selectedExercises.add(checkbox1.text.toString())
            if (checkbox2.isChecked) selectedExercises.add(checkbox2.text.toString())
            if (checkbox3.isChecked) selectedExercises.add(checkbox3.text.toString())
            if (checkbox4.isChecked) selectedExercises.add(checkbox4.text.toString())

            val message = if (selectedExercises.isEmpty()) {
                "No exercises selected."
            } else {
                selectedExercises.joinToString("\n")
            }

            // Display the selected exercises in the TextView
            tvSelectedExercises.text = message
            tvSelectedExercises.visibility = TextView.VISIBLE
        }
    }
}
