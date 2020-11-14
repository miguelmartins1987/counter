package com.miguelmartins1987.counter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val _mutableLiveData = MutableLiveData<Counter>()
    private val _counter = Counter(0)

    val counter: LiveData<Counter>
        get() {
            return _mutableLiveData
        }

    fun increment() {
        _counter.increment()
        _mutableLiveData.postValue(_counter)
    }

    fun decrement() {
        _counter.decrement()
        _mutableLiveData.postValue(_counter)
    }
}
