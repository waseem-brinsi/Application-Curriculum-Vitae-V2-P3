package com.example.cv2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ExperienceAdapter(val ExpList : MutableList<Experiences>) : RecyclerView.Adapter<ExperienceViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExperienceViewHolder {
        val rootView = LayoutInflater.from(parent.context).inflate(R.layout.activity_expersience_single_item,parent,false)
        return ExperienceViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: ExperienceViewHolder, position: Int) {
        holder.ExpPic.setImageResource(ExpList[position].ExpPic)
        holder.ExpName.setText(ExpList[position].ExpName)
        holder.ExpLoc.setText(ExpList[position].ExpLoc)
        holder.ExpFirstDate.setText(ExpList[position].ExpFirstDate)
        holder.ExpLastdate.setText(ExpList[position].ExpLastDate)
        holder.ExpDesc.setText(ExpList[position].ExpDesc)
    }

    override fun getItemCount(): Int = ExpList.size
}