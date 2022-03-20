package com.example.vahvahinternship

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.vahvahinternship.databinding.ActivityStudentRecordBinding

class StudentRecordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStudentRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveButton.setOnClickListener{
            val name = "Name: ${binding.nameEditText.text}"
            val phoneNo = "Phone no: ${binding.phoneNoEditText.text}"
            val standard = "Standard: ${binding.standardEditText.text}"

            val studentRecord = StudentModel(name, phoneNo, standard)
            MainActivity.studentRecordList?.add(studentRecord)
            Toast.makeText(this, "Record added", Toast.LENGTH_SHORT).show()
            finish()
        }


    }
}