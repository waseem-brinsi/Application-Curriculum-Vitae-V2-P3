package com.example.cv2

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class ExperienceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val ExpPic = itemView.findViewById<ImageView>(R.id.ExpPic)
    val ExpName = itemView.findViewById<TextView>(R.id.ExpName)
    val ExpLoc = itemView.findViewById<TextView>(R.id.ExpLoc)
    val ExpFirstDate = itemView.findViewById<TextView>(R.id.ExpFirstDate)
    val ExpLastdate =itemView.findViewById<TextView>(R.id.ExpLastDate)
    val ExpDesc = itemView.findViewById<TextView>(R.id.ExpDesc)
}