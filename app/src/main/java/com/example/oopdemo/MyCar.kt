package com.example.oopdemo

import android.util.Log

class MyCar: Car(),SpeedController {
    override fun start() {
        Log.i("MyTag","This is MyCar starting..Brand ID is ${getBrandId()}")
    }

    override fun accelerate() {
        TODO("Not yet implemented")
    }

    override fun deaccelerate() {
        TODO("Not yet implemented")
    }

}