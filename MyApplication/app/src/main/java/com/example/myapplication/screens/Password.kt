package com.example.myapplication.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.navigation.Screens

@Composable
fun Password(navController: NavController) {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Пропустить", fontSize = 15.sp, color = Color(0xFF57A9FF),
            modifier = Modifier.padding(top = 50.dp, start = 265.dp, bottom = 50.dp).clickable { navController.navigate(Screens.Karta.route) }
        )
        Text(
            text = "Создайте пароль", fontSize = 24.sp, fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 3.dp, start = 80.dp, bottom = 10.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Для защиты ваших персональных данных",
            fontSize = 15.sp,
            color = Color(0xFF7E7E9A),
            modifier = Modifier.padding(top = 3.dp, start = 40.dp,  bottom = 40.dp,),
            textAlign = TextAlign.Center
        )
        Canvas(
            modifier = Modifier.fillMaxWidth()
        )
        {
            drawCircle(style = Stroke(3f), color =  Color(0xFF57A9FF), radius = 25f, center = Offset(450f,200f))
            drawCircle(color =  Color(0xFF57A9FF), radius = 25f, center = Offset(550f,200f))
            drawCircle(style = Stroke(3f), color =  Color(0xFF57A9FF), radius = 25f, center = Offset(650f,200f))
            drawCircle(style = Stroke(3f), color =  Color(0xFF57A9FF), radius = 25f, center = Offset(750f,200f))
        }

    }
}