package com.example.vahvahinternship

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vahvahinternship.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MainAdapter
    companion object{
        var studentRecordList: MutableList<StudentModel>? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        studentRecordList = mutableListOf(
            StudentModel("", "", "")
        )
        adapter = MainAdapter(studentRecordList!!)
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL , false)
        binding.recyclerView.adapter = adapter

        binding.floatingActionButton.setOnClickListener {
            val intent = Intent(this, StudentRecordActivity::class.java)
            startActivity(intent)
            //finish()
        }

    }

    override fun onRestart() {
        super.onRestart()
        adapter.notifyDataSetChanged()
    }



}