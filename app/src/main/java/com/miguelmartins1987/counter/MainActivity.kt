package com.miguelmartins1987.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val counter = Counter(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun onButtonCountUp() {
        counter.increment()
        updateCounterText(counter.value)
    }

    private fun onButtonCountDown() {
        counter.decrement()
        updateCounterText(counter.value)
    }

    private fun updateCounterText(value: Int) {
        findViewById<TextView>(R.id.textViewCounter).text = value.toString()
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.buttonCountUp -> onButtonCountUp()
            R.id.buttonCountDown -> onButtonCountDown()
        }
    }
}