package com.puppet_master.caesarscipers

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_decode.*

class DecodeActivity : AppCompatActivity() {

    var optionsLang:String="RU"; var optionsStep:Int=3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decode)
        optionsLang = exploreSettingsLang()
        optionsStep = exploreSettingsStep()
    }

    fun exploreSettingsStep() = intent.getIntExtra("step", 3)
    fun exploreSettingsLang() = intent.getStringExtra("language")

    fun goDecode(view: View){
        val text = editText_input.text.toString()
        var encoder = CaesarCipher()

        when(optionsLang){
            "RU" -> textView_output.text = encoder.decodeRu(text, optionsStep.toInt())
            "ENG" -> textView_output.text = encoder.decodeEng(text, optionsStep.toInt())
        }
    }

}
