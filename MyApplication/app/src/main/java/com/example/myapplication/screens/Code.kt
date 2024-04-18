package com.example.myapplication.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.navigation.Screens

@Composable
fun Code(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 300.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = "Введите код из E-mail", fontSize = 24.sp, fontWeight = FontWeight.Bold
        )


        Row(verticalAlignment = Alignment.CenterVertically) {
            //val password = remember{mutableStateOf("")}
            val code = remember { mutableStateOf("") }
            if(code.value.length ==4 ){navController.navigate(Screens.Password.route)}
            TextField(
                value = code.value,
                onValueChange = { code.value = it },
                modifier = Modifier.size(58.dp).padding(5.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                textStyle = TextStyle(color = Color.Black),
                shape = RoundedCornerShape(20)
            )
            TextField(

                value = code.value,
                onValueChange = { code.value = it },
                modifier = Modifier.size(58.dp).padding(5.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                textStyle = TextStyle(color = Color.Black),
                shape = RoundedCornerShape(20)
            )
            TextField(
                value = code.value,
                onValueChange = { code.value = it },
                modifier = Modifier.size(58.dp).padding(5.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                textStyle = TextStyle(color = Color.Black),
                shape = RoundedCornerShape(20)
            )
            TextField(
                value = code.value,
                onValueChange = { code.value = it
                     },
                modifier = Modifier.size(58.dp).padding(5.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                textStyle = TextStyle(color = Color.Black),
                shape = RoundedCornerShape(20)
            )
        }

        // password.value,
        //   {password.value = it},)
        //  Shape = MaterialTheme.shapes.small.copy(bottomEnd = ZeroCornerSize, bottomStart = ZeroCornerSize))

        /*  val timer = object: CountDownTimer(60, 0) {
            override fun onTick(millisUntilFinished: Long) {...}

            override fun onFinish() {...}
        }
                   /*val timer = object: CountDownTimer(60, 0) {
            override fun onTick(millisUntilFinished: Long) {
                // Действия при каждом тике
            }

            override fun onFinish() {
                // Действия по завершению отсчета
            }
        }*/

        timer.start() */
    }
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 400.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val timer = "60"
        Text(
            text = "Отправить код повторно \n можно будет через $timer секунд",
            fontSize = 15.sp,
            color = Color(0xFF7E7E9A),
            modifier = Modifier.padding(top = 3.dp),
            textAlign = TextAlign.Center
        )

    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 800.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = " ")
    }

}
