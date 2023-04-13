package com.example.oopdemo

import android.util.Log

open class Car {
    var maxspeed= 30
    open fun start(){
        Log.i("MyTag","The car is starting")
        Log.i("MyTag","Max Speed is $maxspeed")
    }
}