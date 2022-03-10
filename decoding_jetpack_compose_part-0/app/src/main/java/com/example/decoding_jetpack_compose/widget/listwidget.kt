package com.example.myapplication.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape

import androidx.compose.material.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.decoding_jetpack_compose.R
import com.example.myapplication.model.InstaUserData

@Composable
fun BuildList(list: List<InstaUserData>, onItemClick: (String) -> Unit) {
    Column {
        LazyColumn {
            items(items = list) {

                Row(

                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(10.dp)
                        .clickable { onItemClick(it.id) }
                ) {
                    Surface(
                        modifier = Modifier
                            .padding(all = 12.dp)
                            .size(80.dp), shape = CircleShape, elevation = 4.dp
                    ) {

                        Image(
                            painter = rememberImagePainter(data = it.profilePic),

                            contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    Column {
                        Text(text = it.name, color = Color.Black, fontWeight = FontWeight.Bold)
                        Text(text = it.username, color = Color.Gray, fontWeight = FontWeight.Normal)
                    }

                    Spacer(Modifier.weight(1f))
                    if (it.isFollow) BuildButton(
                        name = "Following", color = ButtonDefaults.buttonColors(
                            backgroundColor = Color.White,
                            contentColor = Color.Black
                        )
                    ) else BuildButton(
                        name = "  Follow  ", color = ButtonDefaults.buttonColors(
                            backgroundColor = Color(0xff3897F0),
                            contentColor = Color.White
                        )
                    )


                    Surface(modifier = Modifier.size(20.dp)) {
                        Image(
                            painterResource(R.drawable.more),

                            "content description",


                            modifier = Modifier.fillMaxHeight(1f)
                        )
                    }
                }

            }
        }
    }
}

@Composable
fun BuildButton(name: String, color: ButtonColors) {
    Button(onClick = { /*TODO*/ }, colors = color) {

        Text(text = name)
    }
}