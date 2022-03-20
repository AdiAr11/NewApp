package com.example.vahvahinternship

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vahvahinternship.databinding.RecyclerviewItemBinding

class MainAdapter(private val studentList: List<StudentModel>): RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         val studentRecord = studentList[position]
        holder.bindItem(studentRecord)
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    inner class ViewHolder(private val itemBinding: RecyclerviewItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bindItem(studentRecord: StudentModel){
            itemBinding.nameTextView.text = studentRecord.name
            itemBinding.phoneTextView.text = studentRecord.phoneNo
            itemBinding.standardTextView.text = studentRecord.standard
        }

    }

}