package com.example.testkotlin1.ui.activitys.show

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.testkotlin1.R
import com.example.testkotlin1.constants.Constants.EXTRA_INPUT_TEXT
import com.example.testkotlin1.databinding.ActivityShowBinding
import com.example.testkotlin1.ui.activitys.main.MainActivity

class ShowActivity : AppCompatActivity(R.layout.activity_show) {

    private val binding by viewBinding(ActivityShowBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialize()
        setupListener()
    }

    private fun initialize() {
        binding.showText.text = intent.getStringExtra(EXTRA_INPUT_TEXT)
    }

    private fun setupListener() {
        setupClickMainActivity()
    }

    private fun setupClickMainActivity() {
        binding.nextActivityBtn.setOnClickListener {
            if (!TextUtils.isEmpty(binding.showText.text.toString())) {
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra(EXTRA_INPUT_TEXT, binding.showText.text.toString())
                }
                startActivity(intent)
            }
        }
    }
}