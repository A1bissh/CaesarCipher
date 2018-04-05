package com.puppet_master.caesarscipers

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {

    lateinit var lang:String; lateinit var step: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        lang = intent.getStringExtra("language")
        step = intent.getStringExtra("step")
        textView_language.text = lang
    }

    fun changeLang(view: View){
        when(lang){
            "RU" -> lang = "ENG"
            "ENG" -> lang = "RU"
        }

        textView_language.text = lang
    }

    private fun changeStep(){
        step = editTextStep.text.toString()
    }

    fun saveSettings(view:View){

        val saveIntent = Intent(this, MainActivityCopy::class.java)

        changeStep()

        saveIntent.putExtra("language", lang)
        saveIntent.putExtra("step", step)

        startActivity(saveIntent)


    }

}
