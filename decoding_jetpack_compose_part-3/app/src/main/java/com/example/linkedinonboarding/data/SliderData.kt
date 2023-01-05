package com.example.linkedinonboarding.data

import com.example.linkedinonboarding.R

data class SliderData(
    val drawableId: Int,
    val description: String
)
val onboarding =
    listOf(
        SliderData(
            drawableId = R.drawable.find_job,
            description = "Find and land your next job\n   "
        ),
        SliderData(
            drawableId = R.drawable.network,
            description = "Build your network on the go"
        ),
        SliderData(
            drawableId = R.drawable.find_job,
            description = "Stay ahead with curated content for your career"
        ),
    )