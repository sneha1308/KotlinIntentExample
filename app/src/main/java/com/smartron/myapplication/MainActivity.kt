package com.smartron.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextButton.setOnClickListener {

            /* val (variable declaration "val(read-only)" or "var(mutable)")
             * String (Data type : it may be String, int, float, double)
             * text (represents getText() or setText()*/

            val message: String = helloWorld.text.toString()

            /*Explicit Intent, first parameter says the current activity and second parameter tells the destination activity
            * destination activity defined like DestinationActivity::class.java*/

            val intent = Intent(this@MainActivity, HelloWorld::class.java)

            // putExtra to pass the message to another activity using key, value parameters
            intent.putExtra("text", message)

            startActivity(intent)
        }
    }
}
