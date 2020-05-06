package com.shawpoo.testdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_text.setOnClickListener {

            Toast.makeText(this, "Hello world!", Toast.LENGTH_SHORT).show()

        }

        // branch1 add
        Log.d(TAG, "this is this log for branch1.")

        // master add
        Log.d(TAG, "this is the log for master.")

        // master add
        Log.d(TAG, "test git commit --amend.")

        // master log
        Log.d(TAG, "这是你同事的代码")
    }
}
