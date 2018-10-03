package com.smartron.myapplication

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_helloworld.*
import kotlinx.android.synthetic.main.activity_main.*
import java.security.AccessControlContext

class HelloWorld : AppCompatActivity() {
    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, HelloWorld::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_helloworld)

        /*intent.extras.getString("text") -> to get the text passed from the previous activity*/

        textMsg.setText(intent.extras.getString("text"))

    }
}
