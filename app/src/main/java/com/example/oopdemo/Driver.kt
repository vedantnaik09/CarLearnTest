package com.example.oopdemo

import android.util.Log

class Driver(var name: String, credit: Int) {
    var totalCredit =50
    val car= Car()
    init{
        totalCredit+=credit
        car.maxspeed=150
        car.start()
    }

//    lateinit var drivername: String
//    init{
//        drivername=name
//    }
    fun showDetails(){
//        Log.i("MyTag","Name of the driver is $drivername")
        Log.i("MyTag","Name of the driver is $name with $totalCredit credits")
    }
}