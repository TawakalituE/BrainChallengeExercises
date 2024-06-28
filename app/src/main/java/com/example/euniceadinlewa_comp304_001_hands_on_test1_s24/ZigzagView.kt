package com.example.euniceadinlewa_comp304_001_hands_on_test1_s24

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

//301281523
class ZigzagView(context: Context, attrs: AttributeSet) : View(context, attrs) {
    private val paint = Paint().apply {
        color = Color.WHITE
        strokeWidth = 10f
    }

    init {
        setBackgroundColor(Color.BLUE)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val width = width.toFloat()

        // Get y coordinates from the string array
        val yCoords = resources.getStringArray(R.array.y_coordinates).map { it.toFloat() }

        // Calculate the increment for x-coordinates based on the view width and number of y-coordinates
        val xIncrement = width / (yCoords.size - 1)

        var x = 0f

        for (i in 0 until yCoords.size - 1) {
            canvas.drawLine(x, yCoords[i], x + xIncrement, yCoords[i + 1], paint)
            x += xIncrement
        }
    }
}
