package com.example.cv2

import androidx.annotation.DrawableRes

data class Experiences(
    @DrawableRes
    val ExpPic : Int,
    val ExpName : String,
    val ExpLoc : String,
    val ExpFirstDate : String,
    val ExpLastDate: String,
    val ExpDesc : String

)
