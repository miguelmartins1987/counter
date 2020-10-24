package com.miguelmartins1987.counter

class Counter(var value: Int) {
    fun increment() {
        value += 1
    }

    fun decrement() {
        value -= 1
    }
}
