package com.example.cv2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EducationAdapter(val EduList : MutableList<Education>) : RecyclerView.Adapter<EducationViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EducationViewHolder {
        val rootView = LayoutInflater.from(parent.context).inflate(R.layout.activity_education_single_item,parent,false)
        return EducationViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: EducationViewHolder, position: Int) {
        holder.EduPic.setImageResource(EduList[position].EduPic)
        holder.EduName.setText(EduList[position].EduName)
        holder.EduLoc.setText(EduList[position].EduLoc)
        holder.EduFirstDate.setText(EduList[position].EduFirstDate)
        holder.EduLastdate.setText(EduList[position].EduLastDate)
    }

    override fun getItemCount(): Int =EduList.size
}