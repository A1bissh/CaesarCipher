package com.puppet_master.caesarscipers

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_decode.*

class EncodeActivity : AppCompatActivity() {

    var optionsLang:String="RU"; var optionsStep:Int=3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_encode)
        optionsLang = exploreSettingsLang()
        optionsStep = exploreSettingsStep()
    }

    private fun exploreSettingsStep() = intent.getIntExtra("step", 3)
    private fun exploreSettingsLang() = intent.getStringExtra("language")

    fun goEncode(view: View){
        val text = editText_input.text.toString()
        var encoder = CaesarCipher()

        when(optionsLang){
            "RU" -> textView_output.text = encoder.encodeRu(text, optionsStep.toInt())
            "ENG" -> textView_output.text = encoder.encodeEng(text, optionsStep.toInt())
        }
    }



}
