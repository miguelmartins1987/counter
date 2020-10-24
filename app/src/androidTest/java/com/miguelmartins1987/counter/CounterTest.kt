package com.miguelmartins1987.counter

import org.junit.Test

import org.junit.Assert.*

class CounterTest {

    @Test
    fun increment() {
        val counter = Counter(0)
        counter.increment()
        assertEquals(1, counter.value)
    }

    @Test
    fun decrement() {
        val counter = Counter(0)
        counter.decrement()
        assertEquals(-1, counter.value)
    }

    @Test
    fun getValue() {
        val counter = Counter(0)
        assertEquals(0, counter.value)
    }

    @Test
    fun setValue() {
        val counter = Counter(0)
        counter.value = 2
        assertEquals(2, counter.value)
    }
}