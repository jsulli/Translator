package com.jsulli.translate.translate

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_translate.*

class TranslateActivity : AppCompatActivity() {

    private val languages = ArrayList<String>()
    private var languageAdapter: ArrayAdapter<CharSequence>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translate)
        populateSpinner()
    }

    private fun populateSpinner() {
        languageAdapter = ArrayAdapter.createFromResource(this, R.array.languages, R.layout.spinner_item)
        picker.adapter = languageAdapter
        picker.setSelection(0)
    }
}
