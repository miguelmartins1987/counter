package com.miguelmartins1987.counter

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val counterViewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterViewModel.counter.observe(
            this,
            { counter -> updateCounterText(counter.value) })
    }

    private fun onButtonCountUp() {
        counterViewModel.increment()
    }

    private fun onButtonCountDown() {
        counterViewModel.decrement()
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