package com.example.linkedinonboarding.ui.component



import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun SocialLoginButton(desc: String, drawableId: Int) {
    Button(
        onClick = {

        },
        modifier = Modifier
            .fillMaxWidth(),

        shape = RoundedCornerShape(40.dp),
        border = BorderStroke(1.5.dp, Color.Gray),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.White,
            contentColor = Color.Gray,
        )
    ) {
        Image(
            painter = painterResource(id = drawableId),
            contentDescription = desc,
            modifier = Modifier.size(40.dp,30.dp),
        )
        Text(
            text = desc, modifier = Modifier.padding(6.dp),
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            color = Color.Gray,
            fontWeight = FontWeight.Bold,

            )
    }
}