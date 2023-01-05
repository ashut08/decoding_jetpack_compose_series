package com.example.linkedinonboarding.ui.views

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_linkedin_clone.ui.views.component.DotsIndicator
import com.example.linkedinonboarding.R
import com.example.linkedinonboarding.data.onboarding
import com.example.linkedinonboarding.ui.component.CommonButton
import com.example.linkedinonboarding.ui.component.SocialLoginButton
import com.example.linkedinonboarding.ui.theme.primaryColor
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.delay


@OptIn(ExperimentalPagerApi::class)
@Composable

fun OnBoardingPage() {

    Scaffold(
        topBar = { TopAppBar() }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(20.dp)
        ) {
            Surface(modifier = Modifier.padding(it)) {
                BuildViewPager()
            }



            Spacer(modifier = Modifier.height(30.dp))
            CommonButton("Join now", primaryColor)
            Spacer(modifier = Modifier.height(25.dp))
            SocialLoginButton("Continue with Google", R.drawable.icons_google)

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Sign In", modifier = Modifier.padding(6.dp),
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                color = primaryColor,
                fontWeight = FontWeight.Bold,

                )
        }
    }
}


@Composable
fun TopAppBar() {
    TopAppBar(
        title = {
            Icon(
                painter = painterResource(R.drawable.logo),
                contentDescription = "LinkedIn Logo",


                )
        },
        backgroundColor = Color.Transparent,
        elevation = 0.dp,
    )
}


@OptIn(ExperimentalPagerApi::class)
@Composable
fun BuildViewPager() {
    val pagerState = rememberPagerState(

        initialPage = 0,
    )

    LaunchedEffect(key1 = pagerState.currentPage) {
        delay(2000)
        with(pagerState) {
            val target = if (currentPage < pageCount - 1) currentPage + 1 else 0

            tween<Float>(
                durationMillis = 500,
                easing = FastOutSlowInEasing
            )
            animateScrollToPage(page = target)
        }
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        HorizontalPager(
            state = pagerState, count = onboarding.size,

            ) { page ->
            Column(


            ) {

                Image(
                    painter = painterResource(id = onboarding[page].drawableId),
                    contentDescription = page.toString(),
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Text(
                    text = onboarding[page].description,


                    modifier = Modifier.align(
                        alignment = Alignment.CenterHorizontally,

                        ),
                    fontWeight = FontWeight.Bold,

                    textAlign = TextAlign.Center,
                    fontSize = 25.sp

                )
            }


        }
        Spacer(modifier = Modifier.height(30.dp))
        DotsIndicator(
            totalDots = 3,
            selectedIndex = pagerState.currentPage,
            selectedColor = Color.Black,
            unSelectedColor = Color.Gray
        )
    }

}

