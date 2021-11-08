package com.example.manal_hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.countact_us -> {
                val intentCountact = Intent(this,countact_us::class.java)
                startActivity(intentCountact)
            }
            R.id.setting -> {
                val intentSetting = Intent(this,setting::class.java)
                startActivity(intentSetting)

            }
            R.id.login -> { sign(item)
            return true}


        else -> super.onOptionsItemSelected(item)
    }
        return true
}

    private fun sign(menuItem: MenuItem) {

       if (menuItem.title == "SignIn") {
            menuItem.title =  "SignOut"
       }  else menuItem.title = "SignIn"

    }

    }