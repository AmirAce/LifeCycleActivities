package com.example.lifecycleactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = "StateChange"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.i(TAG, "OnCreate")
    }


    override fun onStart() {
        super.onStart()

    }


    override fun onPause(){
        super.onPause()
        Log.i(TAG,"onPause")


    }
    override fun onResume(){
        super.onResume()
        Log.i(TAG,"onResume")

    }
    override fun onStop(){
    super.onStop()
        Log.i(TAG,"onStop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG,"onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"onDestroy")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG,"onSaveInstanceState")

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }

}