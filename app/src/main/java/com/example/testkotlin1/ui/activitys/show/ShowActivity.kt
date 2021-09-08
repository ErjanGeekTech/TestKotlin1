package com.example.testkotlin1.ui.activitys.show

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.testkotlin1.R
import com.example.testkotlin1.databinding.ActivityShowBinding
import com.example.testkotlin1.ui.activitys.constants.Constants.EXTRA_INPUT_TEXT

class ShowActivity : AppCompatActivity(R.layout.activity_show) {

    private val binding by viewBinding(ActivityShowBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialize()
    }

    private fun initialize() {
        binding.showText.text = intent.getStringExtra(EXTRA_INPUT_TEXT)
    }
}