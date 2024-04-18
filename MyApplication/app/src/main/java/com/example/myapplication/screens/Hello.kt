package com.example.myapplication.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.R
import com.example.myapplication.ViewModelSmartLab
import com.example.myapplication.navigation.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Hello(navController: NavController, viewModel: ViewModelSmartLab) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 100.dp, start = 0.dp, end = 0.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Добро пожаловать!", fontSize = 24.sp, fontWeight = FontWeight.Bold
        )

        // Image(painter = painterResource(id = R.drawable.hi), contentDescription = "", contentScale = ContentScale.FillWidth, modifier = Modifier.size(32.dp, 32.dp))

    }
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(start = 30.dp, top = 100.dp)
    ) {
        //Spacer(modifier = Modifier.height(100.dp))
        /*Row(
            verticalAlignment = Alignment.CenterVertically
        ) {*/
        Image(
            painter = painterResource(id = R.drawable.hi),
            contentDescription = "",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.size(32.dp, 32.dp)
        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 150.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Войдите, чтобы пользоваться функциями",
            fontSize = 15.sp,
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(start = 30.dp, top = 10.dp),
            textAlign = TextAlign.Start
        )
        Text(
            text = "приложения",
            fontSize = 15.sp,
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(start = 30.dp, top = 10.dp),
            textAlign = TextAlign.Start
        )

    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 300.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "    Вход по E-mail",
            fontSize = 15.sp,
            color = Color(0xFF7E7E9A),
            modifier = Modifier.fillMaxWidth(1f),
            textAlign = TextAlign.Start
        )
        //OutlinedTextField(
        val email = remember{ mutableStateOf("") }

        TextField(
            email.value,
            {email.value = it},
            // value = "example@mail.ru", onValueChange = {},
            modifier = Modifier.fillMaxWidth(1f),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            textStyle = TextStyle(color = Color.Black),
            shape = RoundedCornerShape(60),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0XFFF5F5F9),
                focusedIndicatorColor = Color(0xFFEBEBEB),
                focusedTextColor = Color(0XFF578FFF),
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Color(0XFF578FFF),
                focusedSupportingTextColor = Color(0xFF00000)
            ),
            placeholder = { Text("example@mail.ru") }// Color(0xFF#939396)

            //  colors = TextFieldDefaults.outlinedTextFieldColors(
            //       focusedBorderColor= Color(0xFF5F5F9),
            //  unfocusedBorderColor = Color.LightGray)
        )

        /* setContent {
        val message = remember{mutableStateOf("")}

        OutlinedTextField(
            message.value,
            {message.value = it},
            textStyle = TextStyle(fontSize = 30.sp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor= Color.Green, // цвет при получении фокуса
                unfocusedBorderColor = Color.LightGray  // цвет при отсутствии фокуса
            )*/
        /*TextField(value = "example@gmail.com", onValueChange = {},
              colors = TextFieldDefaults.outlinedTextFieldColors(
              focusedBorderColor= Color.Green,
              unfocusedBorderColor = Color.LightGray
               )*/

        // )


        Button(
            onClick = {
                viewModel.sendCodeEmail(email.value)
                navController.navigate(Screens.Code.route)},
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .padding(top = 15.dp, start = 0.dp, end = 10.dp),
            shape = MaterialTheme.shapes.medium,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFC9D4FB),
                contentColor = Color.White
            )
        )
        {
            Text("Далее", fontSize = 25.sp)
        }
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 600.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Или войдите с помощью", fontSize = 15.sp, color = Color(0xFF7E7E9A)
        )
        Button(

            onClick = {},
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .padding(top = 15.dp, start = 0.dp, end = 10.dp),
            shape = MaterialTheme.shapes.medium,
            border = BorderStroke(1.dp, Color(0xFFEBEBEB)),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black,
            )
        )
        {
            Text("Войти с Яндекс", fontSize = 25.sp)
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(" ")
    }
}
