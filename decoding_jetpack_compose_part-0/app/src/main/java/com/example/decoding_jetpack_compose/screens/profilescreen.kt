package com.example.myapplication.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.*

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.decoding_jetpack_compose.R
import com.example.myapplication.model.InstaUserData
import com.example.myapplication.model.getUsers
import com.example.myapplication.widget.BuildGridView

@Composable
fun DetailsScreen(navController: NavController, userid: String?) {
    val userData= getUsers().filter { instaUserData ->instaUserData.id==userid  }
    Scaffold() {

    }
    Scaffold(topBar = {
        TopAppBar(


            elevation = 3.dp,


            backgroundColor = Color.White
        ) {

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly

            ) {

                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Icon",
                    tint = Color.Black,
                    modifier = Modifier.clickable { navController.popBackStack() }

                )
                Spacer(modifier = Modifier.width(30.dp))
                Text(text = userData[0].name,

                    fontWeight = FontWeight.Bold,

                    )
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "Icon",
                    tint = Color.Black
                )
                Spacer(modifier = Modifier.width(10.dp))
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "Icon",
                    tint = Color.Black
                )

            }

        }
    }) {
        BuildProfile(userData = userData[0])
    }

}


@Composable
fun BuildProfile(userData:InstaUserData) {

    Column() {


        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier.padding(20.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {

                Surface(
                    modifier = Modifier

                        .size(80.dp), shape = CircleShape, elevation = 4.dp
                ) {

                    Image(
                        painter = rememberImagePainter(data = userData.profilePic),

                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.fillMaxWidth()
                    )
                }

                Spacer(modifier = Modifier.width(30.dp))
                BuildDashboard(userData.post.toString(), "Posts")

                Spacer(modifier = Modifier.width(30.dp))
                BuildDashboard(userData.post.toString(), "Followers")
                Spacer(modifier = Modifier.width(30.dp))
                BuildDashboard(userData.post.toString(), "following")
            }
            Text(text = userData.bio)


        }
        PostTabView(userData.imagePost)
    }
}

@Composable
fun BuildDashboard(count: String, name: String) {
    Column(
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = count, fontWeight = FontWeight.Bold)
        Text(text = name, fontWeight = FontWeight.Normal)
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable


fun PostTabView(data:List<String>) {
    val tagData=listOf(
        "https://picsum.photos/id/121/1600/1067",
        "https://picsum.photos/id/123/4928/3264",
        "https://picsum.photos/id/128/3823/2549"
    );

    var selectedTabIndex by remember {
        mutableStateOf(0)
    }
    val imageList =
        listOf(painterResource(id = R.drawable.layout), painterResource(id = R.drawable.tags))

    Column {
        TabRow(
            selectedTabIndex = selectedTabIndex,
            backgroundColor = Color.Transparent,
            contentColor = Color.Black,

            ) {
            imageList.forEachIndexed { index, item ->
                Tab(
                    selected = selectedTabIndex == index,
                    selectedContentColor = Color.Black,
                    unselectedContentColor = Color.Gray,
                    onClick = {
                        selectedTabIndex = index

                    }
                ) {
                    Icon(
                        painter = item,
                        contentDescription = "post",
                        tint = if (selectedTabIndex == index) Color.Black else Color.Gray,
                        modifier = Modifier
                            .padding(10.dp)
                            .size(30.dp)
                    )
                }
            }
        }
        when (selectedTabIndex) {
            0 -> BuildGridView(data)
            1 -> BuildGridView(tagData)
        }
    }


}





