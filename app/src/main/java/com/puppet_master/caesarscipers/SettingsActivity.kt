package com.puppet_master.caesarscipers

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {

    var lang = intent.getStringExtra("language")
    var step = intent.getStringExtra("step")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
    }

    fun changeLang(view: View){
        when(lang){
            "RU" -> lang = "ENG"
            "ENG" -> lang = "RU"
        }

        textView_langChanger_label.text = lang
    }

    fun changeStep(){

    }

    fun saveSettings(view:View){

    }

}
