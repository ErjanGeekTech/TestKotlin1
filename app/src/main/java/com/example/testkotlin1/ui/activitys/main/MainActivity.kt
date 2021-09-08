package com.example.testkotlin1.ui.activitys.main

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.testkotlin1.R
import com.example.testkotlin1.databinding.ActivityMainBinding
import com.example.testkotlin1.ui.activitys.constants.Constants.EXTRA_INPUT_TEXT
import com.example.testkotlin1.ui.activitys.show.ShowActivity


class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding by viewBinding(ActivityMainBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupListener()
    }

    private fun setupListener() {
        setupNextActivityClick()
    }

    private fun setupNextActivityClick() {
        binding.nextActivityBtn.setOnClickListener {
            val inputText = binding.etInputTextMain.text.toString()
            if (TextUtils.isEmpty(inputText))
                Toast.makeText(this, "EditText не может быть пустым", Toast.LENGTH_SHORT).show()
            else{
                val intent = Intent(this, ShowActivity::class.java).apply {
                    putExtra(EXTRA_INPUT_TEXT, inputText)
                }
                startActivity(intent)
            }
        }
    }

}