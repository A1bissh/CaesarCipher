package com.puppet_master.caesarscipers

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivityCopy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView_optionsLanguage.text = intent.getStringExtra("language")
        textView_optionsStep.text = intent.getStringExtra("step")
    }

    fun goToEncode(view: View){
        val encodeIntent = Intent(this, EncodeActivity::class.java)

        val optionsLanguage = textView_optionsLanguage.text.toString()
        val optionsStep = textView_optionsStep.text.toString()

        encodeIntent.putExtra("language", optionsLanguage)
        encodeIntent.putExtra("step", optionsStep)

        startActivity(encodeIntent)
    }

    fun goToDecode(view:View){
        val decodeIntent = Intent(this, DecodeActivity::class.java)

        val optionsLanguage = textView_optionsLanguage.text.toString()
        val optionsStep = textView_optionsStep.text.toString()

        decodeIntent.putExtra("language", optionsLanguage)
        decodeIntent.putExtra("step", optionsStep)

        startActivity(decodeIntent)
    }

    fun changeOptions(view:View){
        val changeSettingsIntent = Intent(this, SettingsActivity::class.java )

        val optionsLanguage = textView_optionsLanguage.text.toString()
        val optionsStep = textView_optionsStep.text.toString()

        changeSettingsIntent.putExtra("language", optionsLanguage)
        changeSettingsIntent.putExtra("step", optionsStep)

        startActivity(changeSettingsIntent)

    }



}
