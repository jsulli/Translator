package com.jsulli.translate.translate

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_translate.*

class TranslateFragment : Fragment() {

    companion object {
        fun newInstance() = TranslateFragment()
    }

    private val languages = ArrayList<String>()
    private var languageAdapter: ArrayAdapter<CharSequence>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, state: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_translate, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initViewModel() {
    }

    private fun initUI() {
        languageAdapter = ArrayAdapter.createFromResource(this.context, R.array.languages, R.layout.spinner_item)
        picker.adapter = languageAdapter
        picker.setSelection(0)
    }

}