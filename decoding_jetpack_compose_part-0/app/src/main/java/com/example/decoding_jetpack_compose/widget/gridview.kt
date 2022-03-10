package com.example.myapplication.widget

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.Colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import kotlin.random.Random

@ExperimentalFoundationApi
@Composable
fun BuildGridView(data: List<String>) {


    LazyVerticalGrid(
        cells = GridCells.Fixed(3),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(data.size) {
            Card(
                modifier = Modifier
                    .padding(2.dp)
                    .size(120.dp),
                backgroundColor = Color.Gray
            ) {

                Image(
                    painter = rememberImagePainter(data = data[it]),

                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,

                    )
            }
        }
    }

}