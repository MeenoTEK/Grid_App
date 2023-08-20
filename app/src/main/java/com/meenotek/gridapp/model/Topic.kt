package com.meenotek.gridapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val courseTopic: Int,
    val courseCount: String,
    @DrawableRes val courseImage: Int,
)
