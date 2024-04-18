package com.example.myapplication.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.R
import com.example.myapplication.navigation.Screens

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Swipe(navController: NavController){
    val pagerState = rememberPagerState (initialPage = 0){3}
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Transparent)) {
        HorizontalPager(state = pagerState) {
                currentPage ->  if(currentPage == 0) {First(navController)}
            if(currentPage == 1) {
                Second(navController)
            }
            if(currentPage == 2) {
                Third(navController)
            }
        }
    }
}


@Composable
fun Second(navController: NavController) {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "Пропустить", fontSize = 20.sp, color = Color(0xFF57A9FF),
                modifier = Modifier.padding(top = 30.dp, bottom = 50.dp, start = 25.dp).clickable { navController.navigate(Screens.Hello.route) }
            )
            Image(painter = painterResource(id = R.drawable.plus), contentDescription = "", contentScale = ContentScale.FillWidth, modifier = Modifier.size(167.dp, 163.dp))
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Уведомления", fontSize = 20.sp, color = Color(0xFF00B712)            )
            Text(
                text = "Вы быстро узнаете о результатах ", fontSize = 14.sp, color = Color(0xFF939396),
                modifier = Modifier.padding(top = 33.dp)
            )
            Canvas(
                modifier = Modifier.fillMaxWidth()
            ) {
                drawCircle(style = Stroke(3f), color =  Color(0xFF57A9FF), radius = 25f, center = Offset(450f,200f))
                drawCircle(color =  Color(0xFF57A9FF), radius = 25f, center = Offset(550f,200f))
                drawCircle(style = Stroke(3f), color =  Color(0xFF57A9FF), radius = 25f, center = Offset(650f,200f))
            }
        }
        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column(modifier = Modifier.fillMaxSize(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)            {
                Image(painter = painterResource(id = R.drawable.yvedomlenia), contentDescription = "", contentScale = ContentScale.FillWidth, modifier = Modifier.width(263.dp))
            }
        }
    }
}

@Composable
fun Third(navController: NavController) {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "Пропустить", fontSize = 20.sp, color = Color(0xFF57A9FF),
                modifier = Modifier.padding(top = 30.dp, bottom = 50.dp, start = 25.dp).clickable { navController.navigate(Screens.Hello.route)}
            )
            Image(painter = painterResource(id = R.drawable.plus), contentDescription = "", contentScale = ContentScale.FillWidth, modifier = Modifier.size(167.dp, 163.dp))
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Мониторинг", fontSize = 20.sp, color = Color(0xFF00B712)            )
            Text(
                text = "Наши врачи всегда наблюдают", fontSize = 14.sp, color = Color(0xFF939396),
                modifier = Modifier.padding(top = 33.dp)
            )
            Text(
                text = "за вашими показателями здоровья", fontSize = 14.sp, color = Color(0xFF939396),
                modifier = Modifier.padding(top = 3.dp)
            )
            Canvas(
                modifier = Modifier.fillMaxWidth()
            ) {
                drawCircle(style = Stroke(3f),  color = Color(0xFF57A9FF), radius = 25f, center = Offset(450f,200f))
                drawCircle(style = Stroke(3f),  color = Color(0xFF57A9FF), radius = 25f, center = Offset(550f,200f))
                drawCircle(color =  Color(0xFF57A9FF), radius = 25f, center = Offset(650f,200f))
            }        }
        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column(modifier = Modifier.fillMaxSize(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)            {
                Image(painter = painterResource(id = R.drawable.monitorind), contentDescription = "", contentScale = ContentScale.FillWidth, modifier = Modifier.width(263.dp))

            }
        }
    }
}

@Composable
fun First(navController: NavController) {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "Пропустить", fontSize = 20.sp, color = Color(0xFF57A9FF),
                modifier = Modifier.padding(top = 30.dp, bottom = 50.dp, start = 25.dp).clickable { navController.navigate(Screens.Hello.route)}
            )
            Image(painter = painterResource(id = R.drawable.plus), contentDescription = "", contentScale = ContentScale.FillWidth, modifier = Modifier.size(167.dp, 163.dp))
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Анализы", fontSize = 20.sp, color = Color(0xFF00B712)            )
            Text(
                text = "Экспресс сбор и получение проб", fontSize = 14.sp, color = Color(0xFF939396),
                modifier = Modifier.padding(top = 33.dp)
            )
            Canvas(
                modifier = Modifier.fillMaxWidth()
            ) {
                drawCircle(color =  Color(0xFF57A9FF), radius = 25f, center = Offset(450f,200f))
                drawCircle(style = Stroke(3f),  color = Color(0xFF57A9FF), radius = 25f, center = Offset(550f,200f))
                drawCircle(style = Stroke(3f), color =  Color(0xFF57A9FF), radius = 25f, center = Offset(650f,200f))
            }        }
        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column(modifier = Modifier.fillMaxSize(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)            {
                Image(painter = painterResource(id = R.drawable.analyzi), contentDescription = "", contentScale = ContentScale.FillWidth, modifier = Modifier.width(263.dp))
            }
        }
    }
}

