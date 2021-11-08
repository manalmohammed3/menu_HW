package com.example.manal_hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class countact_us : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_countact_us)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }
}