package com.example.linkedinonboarding.ui.component


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CommonButton(name: String, color: Color) {
    Surface(

        color = color,
        border = BorderStroke(1.dp, color),
        shape = RoundedCornerShape(40.dp),
        elevation = 1.dp,
        modifier = Modifier.fillMaxWidth()

    ) {
        Text(
            name, fontSize = 18.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(15.dp)


        )
    }
}